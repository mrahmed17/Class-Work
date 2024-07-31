import { Component } from '@angular/core';
import { StudentModel } from '../../model/student.model';
import { StudentserviceService } from '../../service/studentservice.service';
import { LocationService } from '../../service/location.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Location } from '../../model/location.model';



@Component({
  selector: 'app-updatestudent',
  templateUrl: './updatestudent.component.html',
  styleUrl: './updatestudent.component.css'
})
export class UpdatestudentComponent {

  studentForm!: FormGroup;
  locations: Location[] = [];
  studentId: string = "";
  student: StudentModel = new StudentModel();

  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private locationService: LocationService,
    private studentService: StudentserviceService
  ) { }

  ngOnInit(): void {


    this.studentId = this.route.snapshot.params['id'];


    console.log(this.studentId);

    this.studentForm = this.formBuilder.group({
      name: [''],
      email: [''],
      cellNo: [''],
      location: this.formBuilder.group({
        id: [undefined],
        name: [undefined],
        city: [undefined],
        state: [undefined],
        photo: [undefined],
        availableUnits: [undefined],
        wifi: [undefined],
        laundry: [undefined]
      })
    });

    this.loadLocation();
    this.loadStudentDetails();
  }

  loadLocation(): void {
    this.locationService.getLocationForStudent().subscribe({
      next: (res: Location[]) => {
        this.locations = res;
      },
      error: err => {
        console.log(err);
      }
    });
  }

  loadStudentDetails(): void {
    this.studentService.getStudentById(this.studentId).subscribe({
      next: (student: StudentModel) => {
        this.student = student;
        this.studentForm.patchValue({
          name: student.name,
          email: student.email,
          cellNo: student.cellNo,
          location: student.location
        });
      },
      error: err => {
        console.log(err);
      }
    });
  }

  updateStudent(): void {

    const updatedStudent: StudentModel = {
      ...this.student,
      ...this.studentForm.value
    };
    this.studentService.updateStudent(updatedStudent).subscribe({
      next: res => {
        console.log('Student updated successfully:', res);
        this.router.navigate(['student']); // Navigate to the students list after update
      },
      error: err => {
        console.log('Error updating student:', err);
      }
    });

  }

}