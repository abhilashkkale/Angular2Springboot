import { RouterModule } from '@angular/router';
import { Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import {AppComponent} from "./app.component";
import {DashboardComponent} from "./component/dashboard/dashboard.component";


const routes: Routes = [  
  {
    path : 'dashboard',
    component: DashboardComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash:true})],
  exports: [RouterModule],
})
export class AppRoutingModule { }

