import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClassmateComponent } from './classmate.component';

describe('ClassmateComponent', () => {
  let component: ClassmateComponent;
  let fixture: ComponentFixture<ClassmateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ClassmateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ClassmateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
