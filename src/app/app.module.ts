import {BrowserModule} from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { ProductListComponents } from './products/product-list.component';

@NgModule({
  declarations:[
    AppComponent,
    ProductListComponents
  ],
  imports:[
    BrowserModule
  ],
  providers:[],
  bootstrap:[AppComponent]
})
export class AppModule{}