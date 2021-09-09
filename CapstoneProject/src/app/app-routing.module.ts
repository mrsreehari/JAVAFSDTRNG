import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {PatientListComponent } from './patient-list/patient-list.component';
import {CreatePatientComponent} from './create-patient/create-patient.component';
import{UpdatePatientComponent} from './update-patient/update-patient.component';
import{PatientDetailsComponent} from './patient-details/patient-details.component';
import { from } from 'rxjs';
import { CreateMedicineComponent } from './create-medicine/create-medicine.component';
import { MedicineListComponent } from './medicine-list/medicine-list.component';
import { UpdateMedicineComponent } from './update-medicine/update-medicine.component';
import { MedicineDetailsComponent } from './medicine-details/medicine-details.component';
const routes: Routes = [

  { path: '', redirectTo: 'patient', pathMatch: 'full' },
  { path: 'patients', component: PatientListComponent },
  { path: 'add', component: CreatePatientComponent },
  { path: 'update/:id', component: UpdatePatientComponent },
  { path: 'details/:id', component: PatientDetailsComponent },
  { path: 'add1', component: CreateMedicineComponent },
  { path: 'medicines', component: MedicineListComponent },
  { path: 'update1/:id', component: UpdateMedicineComponent },
  { path: 'details1/:id', component: MedicineDetailsComponent },

];







@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
