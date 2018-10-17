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
import { HomeComponent } from './home/home.component';
import { TreeShellComponent } from './tree-shell/tree-shell.component';
import { ItemSmallComponent } from './item-small/item-small.component';
import { ItemBigComponent } from './item-big/item-big.component';

@NgModule({
  declarations: [
    AppComponent,
    BannerVisitorComponent,
    LoginModalComponent,
    RegisterModalComponent,
    HomeComponent,
    TreeShellComponent,
    ItemSmallComponent,
    ItemBigComponent
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
