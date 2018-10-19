import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BannerVisitorComponent } from './banner-visitor/banner-visitor.component';
import { LoginModalComponent } from './login-modal/login-modal.component';
import { RegisterModalComponent } from './register-modal/register-modal.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'login', component: LoginModalComponent },
  { path: 'register', component: RegisterModalComponent },
  { path: 'home', component: HomeComponent }
];

@NgModule({
  exports: [ RouterModule ],
  imports: [
    RouterModule.forRoot(routes)
  ],
  declarations: []
})
export class AppRoutingModule { }
