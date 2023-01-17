import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyVinaditaHomeComponent } from './my-viandita-home.component';

describe('MyVinaditaHomeComponent', () => {
  let component: MyVinaditaHomeComponent;
  let fixture: ComponentFixture<MyVinaditaHomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyVinaditaHomeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyVinaditaHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
