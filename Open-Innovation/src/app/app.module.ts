import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { BannerVisitorComponent } from './banner-visitor/banner-visitor.component';
import { LoginModalComponent } from './login-modal/login-modal.component';
import { AppRoutingModule } from './app-routing.module';
import { RegisterModalComponent } from './register-modal/register-modal.component';

@NgModule({
  declarations: [
    AppComponent,
    BannerVisitorComponent,
    LoginModalComponent,
    RegisterModalComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
