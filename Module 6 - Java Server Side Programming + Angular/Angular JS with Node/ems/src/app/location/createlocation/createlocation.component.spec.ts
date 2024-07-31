import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatelocationComponent } from './createlocation.component';

describe('CreatelocationComponent', () => {
  let component: CreatelocationComponent;
  let fixture: ComponentFixture<CreatelocationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CreatelocationComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreatelocationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
