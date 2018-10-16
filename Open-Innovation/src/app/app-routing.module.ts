import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BannerVisitorComponent } from './banner-visitor/banner-visitor.component';
import { LoginModalComponent } from './login-modal/login-modal.component';
import { RegisterModalComponent } from './register-modal/register-modal.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'login', component: LoginModalComponent },
  { path: 'register', component: RegisterModalComponent },
  { path: 'home', component: BannerVisitorComponent }
];

@NgModule({
  exports: [ RouterModule ],
  imports: [
    RouterModule.forRoot(routes)
  ],
  declarations: []
})
export class AppRoutingModule { }
