import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';
import { Comment } from 'src/app/Comment';
import { CommentList } from 'src/app/comment-list';
import { CommentService } from 'src/app/comment.service';
import { Observable } from 'rxjs';




@Component({
  selector: 'app-item-small',
  templateUrl: './item-small.component.html',
  styleUrls: ['./item-small.component.css']
})
export class ItemSmallComponent implements OnInit {

  closeResult: string;
  discussValue =  '';
  commentValue = '';
  list: Comment[] = [];
  tempVarUser = '';

  ngOnInit() {
  }

  constructor(private modalService: NgbModal, private commentService: CommentService) {}

  showDiscussFunc(): void {
    this.discussValue = 'true';
    this.commentService.getAllComments().subscribe((data) => { this.list = data; });
    console.log(this.list);
  }

  hiddenDiscussFunc(): void {
    this.discussValue = '';
  }

  addCommentFunc(): void {
    // console.log(this.commentValue);
    const articleId = 1;
    const user2 = sessionStorage.getItem('usernameStorage');
    const role2 = sessionStorage.getItem('roleStorage');

    const comment = new Comment(articleId, user2, role2, this.commentValue);
    console.log(comment);
    this.commentService.postComment(comment).subscribe();
  }

  open(content) {
    // const modalRef = this.modalService.open(content, { size: 'lg', backdrop: 'static' });
    this.modalService.open(content, { size: 'lg', ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return  `with: ${reason}`;
    }
  }

  checkUserComment(): boolean {
      return false;
  }

  deleteComment(comment: Comment): void {
    // console.log(id);
    this.commentService.deleteComment(comment).subscribe();
  }

}
