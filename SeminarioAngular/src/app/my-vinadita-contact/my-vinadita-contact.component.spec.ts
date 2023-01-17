import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyVinaditaContactComponent } from './my-vinadita-contact.component';

describe('MyVinaditaContactComponent', () => {
  let component: MyVinaditaContactComponent;
  let fixture: ComponentFixture<MyVinaditaContactComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyVinaditaContactComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyVinaditaContactComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
