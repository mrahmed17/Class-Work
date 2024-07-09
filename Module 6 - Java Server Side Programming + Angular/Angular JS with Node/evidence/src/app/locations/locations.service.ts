import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Location } from './location.model';

@Injectable({
  providedIn: 'root'
})
export class LocationsService {

  baseUrl: string = "http://localhost:3000/locations";


  constructor(private httpClient: HttpClient) { }
  
  getAllLocations(): Observable<any>{
    
    return this.httpClient.get(this.baseUrl);

  }
  createLocation(location: Location): Observable<any>{
  
    return this.httpClient.post(this.baseUrl, location);

}


}
