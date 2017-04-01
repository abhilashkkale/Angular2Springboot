import {Router} from '@angular/router';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {

  constructor(public router:Router){}

  goToDashboard(){
    this.router.navigate(['/dashboard']);
  }

  goToAnglarIO(){
    window.open('https://angular.io/docs/ts/latest/quickstart.html','_blank')
  }
}
