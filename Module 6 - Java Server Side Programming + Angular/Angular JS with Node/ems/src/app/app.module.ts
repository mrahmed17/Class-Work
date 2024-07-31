import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LocationComponent } from './location/viewlocation/location.component';
import { CreatelocationComponent } from './location/createlocation/createlocation.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { UpdatelocationComponent } from './location/updatelocation/updatelocation.component';
import { ViewstudentComponent } from './student/viewstudent/viewstudent.component';
import { CreatestudentComponent } from './student/createstudent/createstudent.component';
import { UpdatestudentComponent } from './student/updatestudent/updatestudent.component';
import { RouterModule } from '@angular/router';
import { LoginComponent } from './registration/login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './dashboard/home/home.component';
import { LogoutComponent } from './registration/logout/logout.component';
import { UserprofileComponent } from './registration/userprofile/userprofile.component';
import { FooterComponent } from './dashboard/footer/footer.component';
import { HeaderComponent } from './dashboard/header/header.component';



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
    FooterComponent,
    HeaderComponent,
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