import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
     // this.router.navigate(['to-do']);
  }

   goTOTODO(){
    this.router.navigate(['to-do'])
  }

  goToAngularTheory(){
  // window.location.href='';
   window.open(
      'https://angular.io/docs/ts/latest/quickstart.html',
      '_blank' // <- This is what makes it open in a new window.
    );
  }

}
