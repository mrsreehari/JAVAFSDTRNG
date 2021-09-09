import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';
import { CreateMedicineComponent } from './create-medicine/create-medicine.component';
import { MedicineDetailsComponent } from './medicine-details/medicine-details.component';
import { MedicineListComponent } from './medicine-list/medicine-list.component';
import { UpdateMedicineComponent } from './update-medicine/update-medicine.component';

//import { Patient } from './patient.service;

@NgModule({
  declarations: [
    AppComponent,
    CreatePatientComponent,
    PatientDetailsComponent,
    PatientListComponent,
    UpdatePatientComponent,
    CreateMedicineComponent,
    MedicineDetailsComponent,
    MedicineListComponent,
    UpdateMedicineComponent,
    
    //Patient.ServiceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
