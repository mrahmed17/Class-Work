import { Component, OnInit } from '@angular/core';
import { LocationsService } from './locations.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-locations',
  templateUrl: './locations.component.html',
  styleUrl: './locations.component.css'
})
export class LocationsComponent implements OnInit{
  locations: any;


  constructor(
    private locationServide: LocationsService,
    private router: Router,
    private httpClient: HttpClient
  ) {
    

  }
  ngOnInit(): void {
    this.locations= this.locationServide.getAllLocations();   
  }



}
