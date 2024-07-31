import { Component } from '@angular/core';
import { UserModel } from '../../model/user.model';
import { UserprofileService } from '../../service/userprofile.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userprofile',
  templateUrl: './userprofile.component.html',
  styleUrl: './userprofile.component.css'
})
export class UserprofileComponent {

  user!: UserModel;

  constructor(
    private userProfileService: UserprofileService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.loadUserProfile();
  }

  loadUserProfile(): void {
    this.userProfileService.getUserProfile().subscribe({
      next: (user) => {
        if (user) {
          this.user = user;
        }
      },
      error: (err) => {
        console.error('Error, loading user profile:', err);
      }
    });
  }

  // ngOnInit(): void {
  //   this.userProfileService.getUserProfile().subscribe(profile => {
  //     this.user = profile;
  //      });
  //    }

}