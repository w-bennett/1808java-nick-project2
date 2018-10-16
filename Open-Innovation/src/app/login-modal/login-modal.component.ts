import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from 'src/app/User';
import { LoginService } from 'src/app/login.service';

@Component({
  selector: 'app-login-modal',
  templateUrl: './login-modal.component.html',
  styleUrls: ['./login-modal.component.css']
})
export class LoginModalComponent implements OnInit {

  user: '';
  pass: '';
  userObj: User;

  constructor(private loginService: LoginService) {  }

  ngOnInit() {
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
    location.replace('');
  }
}

