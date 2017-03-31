import { Injectable } from '@angular/core';
import {Observable} from "rxjs/Rx";
import {Contact} from "../component/dashboard/dashboard.component";
import {Headers, Http, RequestOptions} from "@angular/http";

@Injectable()
export class Service {

  API_BASE_URL:string = "http://localhost:8080";

  ENDPOINT_CONTACTS = "contacts";
  ENDPOINT_CONTACT= "contact";
 // ENDPOINT_DELTE_CONTACT="contact";

  constructor(private http:Http) { }

  getContacts():Observable<any[]>{
    console.log("Hitting on: " + this.API_BASE_URL + "/" + this.ENDPOINT_CONTACTS);
    //noinspection TypeScriptValidateTypes
    return this.http.get(this.API_BASE_URL + "/" + this.ENDPOINT_CONTACTS)
        .map((res) => res.json())
        .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }
  
  createContact(contact):Observable<any[]>{

    let headers = new Headers({'Content-Type': 'application/json'});
    let options = new RequestOptions({headers: headers});
    //noinspection TypeScriptValidateTypes
    return this.http.post(this.API_BASE_URL + "/" + this.ENDPOINT_CONTACT, JSON.stringify(contact),options )
        .map(res => res.json())
        .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  deleteContact(id):Observable<any>{
    let headers = new Headers({'Content-Type': 'application/json'});
    let options = new RequestOptions({headers: headers});
    //noinspection TypeScriptValidateTypes
    return this.http.delete(this.API_BASE_URL+"/"+this.ENDPOINT_CONTACT+"/"+id,options)
            .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

}
