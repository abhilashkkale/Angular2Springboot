import { DashboardComponent } from './component/dashboard/dashboard.component';
import { RouterModule } from '@angular/router';
import { Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ToDoComponent } from "app/component/to-do/to-do.component";


const routes: Routes = [  
    {
        path:'dashboard',
        component:DashboardComponent
    },
    {
        path: 'to-do',
        component: ToDoComponent      
    }
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash:true})],
  exports: [RouterModule],
})
export class AppRoutingModule { }

