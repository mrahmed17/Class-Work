import { Component } from '@angular/core';
import { AuthService } from '../service/auth.service';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserModel } from '../model/user.model';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrl: './registration.component.css'
})


export class RegistrationComponent {

  regForm: FormGroup;
  selectedFile: File | null = null;

  constructor(
    private authService: AuthService,
    private router: Router,
    private formBuilder: FormBuilder

  ) {
    this.regForm = this.formBuilder.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', Validators.required],
      profilePhoto: ['', Validators.required]

      // name:['', Validators.required],
      // email:['', [Validators.required, Validators.email]],
      // password:['',[Validators.required, Validators.min(6), Validators.max(20)]]

    });

  }

  onFileSelected(event: Event): void {
    const input = event.target as HTMLInputElement;
    if (input.files && input.files.length > 0) {
      this.selectedFile = input.files[0];
    }
  }

  onSubmit(): void {
    if (this.regForm.valid) {
      const user: UserModel = this.regForm.value;
      this.authService.registration(user).subscribe({
        next: (res) => {
          console.log('User registered successfully:', res);
          this.authService.storeToken(res.token);
          this.router.navigate(['/']); // Navigate to a protected route after registration
        },
        error: (err) => {
          console.error('Error registering user:', err);
        }
      });
    }
    else {
      alert("Field Complete Mandatory");
    }
  }

}

// // import { Component } from '@angular/core';
// import { AuthService } from '../service/auth.service';
// import { Router } from '@angular/router';
// import { FormBuilder, FormGroup, Validators } from '@angular/forms';
// import { UserModel } from '../model/user.model';

// @Component({
//   selector: 'app-registration',
//   templateUrl: './registration.component.html',
//   styleUrl: './registration.component.css'
// })


// export class RegistrationComponent {

//    regForm: FormGroup;
//   selectedFile: File | null = null;

//   constructor(
//     private authService: AuthService,
//     private router: Router,
//     private formBuilder: FormBuilder

//   ) {
//     this.regForm = this.formBuilder.group({
//       name: ['', Validators.required],
//       email: ['', [Validators.required, Validators.email]],
//       password: ['', Validators.required],
//       profilePhoto: ['', Validators.required]

//       // name:['', Validators.required],
//       // email:['', [Validators.required, Validators.email]],
//       // password:['',[Validators.required, Validators.min(6), Validators.max(20)]]

//     });

//   }

//   onFileSelected(event: Event): void {
//     const input = event.target as HTMLInputElement;
//     if (input.files && input.files.length > 0) {
//       this.selectedFile = input.files[0];
//     }
//   }

//   onSubmit(): void {
//     if (this.regForm.valid) {
//       const formData = new FormData();
//       formData.append('name', this.regForm.get('name').value);
//       formData.append('email', this.regForm.get('email').value);
//       formData.append('password', this.regForm.get('password').value);
//       if (this.selectedFile) {
//         formData.append('profilePhoto', this.selectedFile, this.selectedFile.name);
//       }

//       this.authService.registration(formData).subscribe({
//         next: (res) => {
//           console.log('User registered successfully:', res);
//           this.authService.storeToken(res.token);
//           this.router.navigate(['/']);
//         },
//         error: (err) => {
//           console.error('Error registering user:', err);
//         }
//       });
//     } else {
//       alert("All fields are mandatory");
//     }
//   }
// }