package com.example.demo;

import java.util.HashMap;

import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private MedicineRepository medicinerepository;

	@GetMapping("/patients")
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}
	
	
	@GetMapping("/medicines")
	public List<Medicine> getAllMedicines() {
		return medicinerepository.findAll();
	}
	
	

	@GetMapping("/patients/{id}")
	public ResponseEntity<Patient> getPatientById(@PathVariable(value = "id") String patientId)
			throws ResourceNotFoundException {
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + patientId));
		return ResponseEntity.ok().body(patient);
	}


	@GetMapping("/medicines/{id}")
	public ResponseEntity<Medicine> getMedicineById(@PathVariable(value = "id") String medicineId)
			throws ResourceNotFoundException {
		Medicine medicine = medicinerepository.findById(medicineId)
				.orElseThrow(() -> new ResourceNotFoundException("Medicine not found for this id :: " + medicineId));
		return ResponseEntity.ok().body(medicine);
	}

	@PostMapping("/patients")
	public Patient createPatient( @RequestBody Patient patient) {
		return patientRepository.save(patient);
	}
	
	@PostMapping("/medicines")
	public Medicine createMedicine( @RequestBody Medicine medicine) {
		return medicinerepository.save(medicine);
	}

	@PutMapping("/patients/{id}")
	public ResponseEntity<Patient> updatePatient(@PathVariable(value = "id") String patientId,
			 @RequestBody Patient patientDetails) throws ResourceNotFoundException {
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + patientId));

		patient.setaddress(patientDetails.getaddress());
		patient.setLastName(patientDetails.getLastName());
		patient.setFirstName(patientDetails.getFirstName());
		final Patient updatedPatient = patientRepository.save(patient);
		return ResponseEntity.ok(updatedPatient);
	}
	
	
	
	@PutMapping("/medicines/{id}")
	public ResponseEntity<Medicine> updateMedicine(@PathVariable(value = "id") String medicineId,
			 @RequestBody Medicine medicineDetails) throws ResourceNotFoundException {
		Medicine medicine = medicinerepository.findById(medicineId)
				.orElseThrow(() -> new ResourceNotFoundException("Medicine not found for this id :: " + medicineId));

		medicine.setPrice(medicineDetails.getPrice());
		medicine.setQuantity(medicineDetails.getQuantity());
		medicine.setmedName(medicineDetails.getmedName());
		final Medicine updatedMedicine = medicinerepository.save(medicine);
		return ResponseEntity.ok(updatedMedicine);
	}

	@DeleteMapping("/patients/{id}")
	public Map<String, Boolean> deletePatient(@PathVariable(value = "id") String patientId)
			throws ResourceNotFoundException {
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + patientId));

		patientRepository.delete(patient);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	
	
	@DeleteMapping("/medicines/{id}")
	public Map<String, Boolean> deleteMedicine(@PathVariable(value = "id") String medicineId)
			throws ResourceNotFoundException {
		Medicine medicine = medicinerepository.findById(medicineId)
				.orElseThrow(() -> new ResourceNotFoundException("Medicine not found for this id :: " + medicineId));

		medicinerepository.delete(medicine);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
