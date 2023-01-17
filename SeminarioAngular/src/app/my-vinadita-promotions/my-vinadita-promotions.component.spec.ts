import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyVinaditaPromotionsComponent } from './my-vinadita-promotions.component';

describe('MyVinaditaPromotionsComponent', () => {
  let component: MyVinaditaPromotionsComponent;
  let fixture: ComponentFixture<MyVinaditaPromotionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyVinaditaPromotionsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyVinaditaPromotionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
