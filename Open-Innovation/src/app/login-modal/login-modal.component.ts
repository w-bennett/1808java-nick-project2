import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from 'src/app/User';
import { LoginService } from 'src/app/login.service';
import { GetUserService } from '../get-user.service';

@Component({
  selector: 'app-login-modal',
  templateUrl: './login-modal.component.html',
  styleUrls: ['./login-modal.component.css']
})
export class LoginModalComponent implements OnInit {

  user: '';
  pass: '';
  userObj: User;
  message: string;

  constructor(public loginService: LoginService) {
    this.loginService = loginService;
  }

  ngOnInit() {
    this.loginService.currentMessage.subscribe(message => this.message = message);
  }

  loginFunc(): void {
    console.log(this.user + ' ' + this.pass);
    const u = new User(this.user, this.pass);
    console.log(u);

    this.loginService.postLogin(u).subscribe(data => this.navigate(data));
    // console.log(u2);
  }

  testPrint(user2: User): void {
    console.log(user2);
  }

  navigate(user3: User): void {
    console.log(user3.username + ' ' + user3.role);
    sessionStorage.setItem('usernameStorage', user3.username);
    sessionStorage.setItem('roleStorage', user3.role);

    // this.loginService.changeMessage(user3.username + ' ' + user3.role);
    // console.log(this.loginService.currentMessage);
    location.replace('');
  }
}

