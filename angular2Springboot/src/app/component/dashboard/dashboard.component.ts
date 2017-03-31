import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor(private router:Router){}

  employeeList : any;

  backupEmployee: Contact;

  firstName:string = "";
  lastName:string = "";
  phoneNumber: string = "";
  city:string = "";

  ngOnInit(){
    this.employeeList = [
      {
        "firstName": "Ritesh",
        "lastName" : "Manjaramkar",
        "phoneNumber": "9767842482",
        "city": "Nanded"
      },{
        "firstName": "Abhilash",
        "lastName" : "Kale",
        "phoneNumber": "9767842482",
        "city": "Nanded"
      }
    ];
  }

  createNew(){
    console.log("firstName" + this.firstName);
    if(this.firstName == "" || this.lastName == "" || this.city == "" || this.phoneNumber == ""){
      return;
    }
    let contact = new Contact();
    contact.firstName = this.firstName;
    contact.lastName = this.lastName;
    contact.phoneNumber = this.phoneNumber;
    contact.city = this.city;

    this.employeeList.push(contact);

    this.reset();
  }
  reset(){
    this.firstName = "";
    this.lastName = "";
    this.phoneNumber = "";
    this.city = "";
  }
  edit(i){

    this.employeeList[i].backupFirstName = this.employeeList[i].firstName;
    this.employeeList[i].backupLastName = this.employeeList[i].lastName;
    this.employeeList[i].backupPhoneNumber = this.employeeList[i].phoneNumber;
    this.employeeList[i].backupCity = this.employeeList[i].city;

    this.employeeList[i].editable = true
  }

  undo(i){
    this.employeeList[i].firstName = this.employeeList[i].backupFirstName;
    this.employeeList[i].lastName = this.employeeList[i].backupLastName;
    this.employeeList[i].phoneNumber = this.employeeList[i].backupPhoneNumber;
    this.employeeList[i].city = this.employeeList[i].backupCity;

    delete this.employeeList[i].backupFirstName;
    delete this.employeeList[i].backupLastName;
    delete this.employeeList[i].backupPhoneNumber;
    delete this.employeeList[i].backupCity;

    this.employeeList[i].editable = false
  }
  delete(i){
    this.employeeList.splice(i,1);
  }

}
export class Contact{
  firstName:string;
  lastName:string;
  phoneNumber: string;
  city:string;
}