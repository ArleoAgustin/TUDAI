import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ViandasListComponent } from './viandas-list/viandas-list.component';
import { FormsModule } from '@angular/forms';
import { MyVianditaAboutComponent } from './my-viandita-about/my-viandita-about.component';
import { MyVianditaViandasComponent } from './my-viandita-viandas/my-viandita-viandas.component';
import { CartComponent } from './cart/cart.component';
import { MyVinaditaContactComponent } from './my-vinadita-contact/my-vinadita-contact.component';
import { MyVinaditaPromotionsComponent } from './my-vinadita-promotions/my-vinadita-promotions.component';
import { MyVinaditaHomeComponent } from './my-vinadita-home/my-viandita-home.component';
import { ViandasListInPromotionComponent } from './viandas-list-in-promotion/viandas-list-in-promotion.component';
import { InputIntegerComponent } from './input-integer/input-integer.component';

@NgModule({
  declarations: [
    AppComponent,
    ViandasListComponent,
    MyVianditaAboutComponent,
    MyVianditaViandasComponent,
    CartComponent,
    MyVinaditaContactComponent,
    MyVinaditaPromotionsComponent,
    MyVinaditaHomeComponent,
    ViandasListInPromotionComponent,
    InputIntegerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
