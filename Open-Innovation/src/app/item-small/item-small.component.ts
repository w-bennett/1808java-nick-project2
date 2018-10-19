import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-item-small',
  templateUrl: './item-small.component.html',
  styleUrls: ['./item-small.component.css']
})
export class ItemSmallComponent implements OnInit {

  closeResult: string;
  discussValue =  '';

  ngOnInit() {
  }

  constructor(private modalService: NgbModal) {}

  showDiscussFunc(): void {
    this.discussValue = 'true';
    // document.getElementById('discuss').style.display = 'visible';
  }

  hiddenDiscussFunc(): void {
    this.discussValue = '';
    // document.getElementById('discuss').style.display = 'visible';
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

}
