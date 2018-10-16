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
export class RegisterService {

  url = 'http://localhost:8080/Open_Innovation/register';

  constructor(private http: HttpClient) { }

  postRegister(user: User): Observable<User> {
    return this.http.post<User>(this.url, user, httpOptions);
  }
}
