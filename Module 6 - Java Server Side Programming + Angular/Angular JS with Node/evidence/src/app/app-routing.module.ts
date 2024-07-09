import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClassmateComponent } from './classmate/classmate.component';
import { LocationsComponent } from './locations/locations.component';
import { CreatelocationComponent } from './createlocation/createlocation.component';

const routes: Routes = [
{path: 'classmate', component:ClassmateComponent},
{path: 'locations', component:LocationsComponent},
{path: 'createlocation', component:CreatelocationComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
