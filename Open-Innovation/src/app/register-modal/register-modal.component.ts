import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from 'src/app/User';
import { RegisterService } from 'src/app/register.service';

@Component({
  selector: 'app-register-modal',
  templateUrl: './register-modal.component.html',
  styleUrls: ['./register-modal.component.css']
})
export class RegisterModalComponent implements OnInit {
  user: '';
  pass1: '';
  email: '';
  userObj: User;

  constructor(private registerService: RegisterService) { }

  ngOnInit() {
  }

  registerFunc(): void {
    console.log(this.user + ' ' + this.pass1);
    const u = new User(this.user, this.pass1);
    u.email = this.email;
    console.log(u);

    this.registerService.postRegister(u).subscribe(data => this.navigate(data));
    // console.log(u2);
  }

  navigate(user3: User): void {
    location.replace('');
  }
}
