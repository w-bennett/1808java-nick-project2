import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TreeShellComponent } from './tree-shell.component';

describe('TreeShellComponent', () => {
  let component: TreeShellComponent;
  let fixture: ComponentFixture<TreeShellComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TreeShellComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TreeShellComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
