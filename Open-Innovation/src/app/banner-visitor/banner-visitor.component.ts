import { Component, OnInit } from '@angular/core';
import { GetUserService } from '../get-user.service';
import { Observable } from 'rxjs';
import { User } from '../User';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { LoginService } from 'src/app/login.service';


const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Component({
  selector: 'app-banner-visitor',
  templateUrl: './banner-visitor.component.html',
  styleUrls: ['./banner-visitor.component.css']
})
export class BannerVisitorComponent implements OnInit {

  userObj = new User('default', 'default');
  username2 = '';
  role2 = '';
  message: string;


  url2 = 'http://localhost:8080/Open_Innovation/role';

  constructor(private http: HttpClient, public loginService: LoginService) {
    this.loginService = loginService;
  }

  ngOnInit() {
    this.fetchFunc();
    // this.loginService.currentMessage.subscribe(message => { this.message = message; } );
    // this.postUser().subscribe(data => this.upFunc(data));
    // console.log(this.loginService.currentMessage);
  }

  fetchFunc(): void {
    this.username2 = sessionStorage.getItem('usernameStorage');
    this.role2 = sessionStorage.getItem('roleStorage');
  }

  postUser(): Observable<User> {
    return this.http.post<User>(this.url2, this.userObj, httpOptions);
  }

  upFunc(user4: User): void {
    this.username2 = user4.username;
    this.role2 = user4.role;
  }

  isRoleNullFunc(): boolean {
    if (this.role2) {
      return false;
    } else {
      return true;
    }
  }

  isRoleFunc(): boolean {
    if (this.role2) {
      return true;
    } else {
      return false;
    }
  }

  logoutFunc(): void {
    sessionStorage.clear();
    this.username2 = '';
    this.role2 = '';
    // location.replace('');
  }
}
