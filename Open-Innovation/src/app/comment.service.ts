import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { User } from './User';
import { catchError, map, tap } from 'rxjs/operators';
import { BehaviorSubject } from 'rxjs';
import { Comment } from 'src/app/Comment';


const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class CommentService {

  url1 = 'http://localhost:8080/Open_Innovation/addcomment';
  url2 = 'http://localhost:8080/Open_Innovation/getAllComments';
  url3 = 'http://localhost:8080/Open_Innovation/deletecomment';

  constructor(private http: HttpClient) { }

  postComment(comment: Comment): Observable<Comment> {
    console.log(comment);
    return this.http.post<Comment>(this.url1, comment, httpOptions);
  }

  getAllComments(): Observable<Comment[]> {
    return this.http.get<Comment[]>(this.url2);
  }

  deleteComment(comment: Comment): Observable<Comment> {
    return this.http.post<Comment>(this.url3, comment, httpOptions);
  }

}
