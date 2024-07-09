import { Component, OnInit } from '@angular/core';
import { Router } from 'express';
import { Location } from '../locations/location.model';
import { HttpClient } from '@angular/common/http';
import { LocationsService } from '../locations/locations.service';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-createlocation',
  templateUrl: './createlocation.component.html',
  styleUrl: './createlocation.component.css'
})
  
export class CreatelocationComponent implements OnInit{
  location: Location = new Location();
  formValue!: FormGroup;
  submited = false;


  constructor(
  private locationService: LocationsService,
  private router: Router,
  private httpClient: HttpClient,
  private formBuilder:FormBuilder
  ) {

  }

  ngOnInit(): void {
    // this.formValue = this.formBuilder.group({
    //   name:[''],  
    //   city:[''],  
    //   state:[''],  
    //   photo:[''],  
    //   availableUnits:[''],  
    //   wifi:[''],  
    //   laundry:[''],  
    //   })
  }


  createLocation() { 
    this.location.name = this.formValue.value.name;
    this.location.city = this.formValue.value.city;
    this.location.state = this.formValue.value.state;
    this.location.photo = this.formValue.value.photo;
    this.location.availableUnits = this.formValue.value.availableUnits;
    this.location.wifi = this.formValue.value.wifi;
    this.location.laundry = this.formValue.value.laundry;

    this.locationService.createLocation(this.location)
      .subscribe({
        next: res => {
          console.log(res);
          this.formValue.reset();
        },
        error: error => {
          console.log(error);
        }
      }
      );
    
    
    // .subscribe(
      //   res => {
      //     console.log(res);
      //     this.formValue.reset();
      //     },
      //   error => {
      //     console.log(error);
      //       }

      // );
  }


}
