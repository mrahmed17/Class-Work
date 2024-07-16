import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LocationComponent } from './location/location.component';
import { CreatelocationComponent } from './createlocation/createlocation.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { UpdatelocationComponent } from './updatelocation/updatelocation.component';
import { ViewstudentComponent } from './student/viewstudent/viewstudent.component';
import { CreatestudentComponent } from './student/createstudent/createstudent.component';
import { UpdatestudentComponent } from './student/updatestudent/updatestudent.component';
import { RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './home/home.component';
import { LogoutComponent } from './logout/logout.component';
import { UserprofileComponent } from './userprofile/userprofile.component';


@NgModule({
  declarations: [
    AppComponent,    
    LocationComponent,
    CreatelocationComponent,
    UpdatelocationComponent,
    ViewstudentComponent,
    CreatestudentComponent,
    UpdatestudentComponent,
    LoginComponent,
    RegistrationComponent,
    HomeComponent,
    LogoutComponent,
    UserprofileComponent,     
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule, 
    AppRoutingModule 
  ],
  providers: [
    provideClientHydration(),
    provideHttpClient(
      withFetch()
    )
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }