import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ItemBigComponent } from './item-big.component';

describe('ItemBigComponent', () => {
  let component: ItemBigComponent;
  let fixture: ComponentFixture<ItemBigComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ItemBigComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ItemBigComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
