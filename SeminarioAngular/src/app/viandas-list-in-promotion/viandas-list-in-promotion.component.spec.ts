import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViandasListInPromotionComponent } from './viandas-list-in-promotion.component';

describe('ViandasListInPromotionComponent', () => {
  let component: ViandasListInPromotionComponent;
  let fixture: ComponentFixture<ViandasListInPromotionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViandasListInPromotionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViandasListInPromotionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
