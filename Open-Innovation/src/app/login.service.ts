import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { User } from './User';
import { catchError, map, tap } from 'rxjs/operators';


const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  url = 'http://localhost:8080/Open_Innovation/login';

  constructor(private http: HttpClient) { }

  postLogin(user: User): Observable<User> {
    return this.http.post<User>(this.url, user, httpOptions);
  }
}
