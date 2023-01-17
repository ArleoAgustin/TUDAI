import { TestBed } from '@angular/core/testing';

import { ViandaCartService } from './vianda-cart.service';

describe('ViandaCartService', () => {
  let service: ViandaCartService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ViandaCartService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
