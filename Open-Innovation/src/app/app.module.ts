import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';


import { AppComponent } from './app.component';
import { BannerVisitorComponent } from './banner-visitor/banner-visitor.component';
import { LoginModalComponent } from './login-modal/login-modal.component';

@NgModule({
  declarations: [
    AppComponent,
    BannerVisitorComponent,
    LoginModalComponent
  ],
  imports: [
    BrowserModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
