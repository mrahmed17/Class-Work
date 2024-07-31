import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AuthResponse } from '../model/auth-response';

import { catchError, map, Observable } from 'rxjs';
import { UserModel } from '../model/user.model';



@Injectable({
  providedIn: 'root'
})

export class AuthService {

  private baseUrl: string = "http://localhost:3000/user";

  constructor(
    private http: HttpClient
  ) { }


  registration(user: UserModel): Observable<AuthResponse> {

    return this.http.post<UserModel>(this.baseUrl, user).pipe(

      map(
        (newUser: UserModel) => {
          const token = btoa(`${newUser.email}${newUser.password}`);
          return { token, user: newUser } as AuthResponse;

        })
    )
  }



  login(credentials: { email: string; password: string }): Observable<AuthResponse> {
    let params = new HttpParams();
    params = params.append('email', credentials.email);

    return this.http.get<UserModel[]>(`${this.baseUrl}`, { params }).pipe(
      map(users => {
        if (users.length > 0) {
          const user = users[0];
          if (user.password === credentials.password) {
            const token = btoa(`${user.email}:${user.password}`);
            this.storeUserProfile(user);
            return { token, user } as AuthResponse;
          } else {
            throw new Error('Invalid password');
          }
        } else {
          throw new Error('User not found');
        }
      }),

      catchError(err => {
        console.error('Login error', err);
        throw err;
      })
    );
  }



  logout(): void {
    localStorage.removeItem('token');
  }

  storeToken(token: string): void {
    localStorage.setItem('token', token);
  }

  getToken(): string | null {
    return localStorage.getItem('token');
  }

  storeUserProfile(user: UserModel): void {
    localStorage.setItem('userProfile', JSON.stringify(user));
  }

  getUserProfileFromStorage(): UserModel | null {
    const userProfile = localStorage.getItem('userProfile');
    return userProfile ? JSON.parse(userProfile) : null;
  }

  removeUserDetails() {
    localStorage.clear();

  }



}