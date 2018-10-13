import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BannerVisitorComponent } from './banner-visitor.component';

describe('BannerVisitorComponent', () => {
  let component: BannerVisitorComponent;
  let fixture: ComponentFixture<BannerVisitorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BannerVisitorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BannerVisitorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
