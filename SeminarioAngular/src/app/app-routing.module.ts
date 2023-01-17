import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MyVianditaAboutComponent } from './my-viandita-about/my-viandita-about.component';
import { MyVianditaViandasComponent } from './my-viandita-viandas/my-viandita-viandas.component';
import { MyVinaditaContactComponent } from './my-vinadita-contact/my-vinadita-contact.component';
import { MyVinaditaHomeComponent } from './my-vinadita-home/my-viandita-home.component';
import { MyVinaditaPromotionsComponent } from './my-vinadita-promotions/my-vinadita-promotions.component';

const routes: Routes = [
  
  {
    path: '',
    redirectTo: 'viandas',
    pathMatch:'full'
  },

  {
    path: 'viandas',
    component: MyVianditaViandasComponent
  },
  
  {
    path: 'about',
    component: MyVianditaAboutComponent
  },

  {
    path: 'contact',
    component: MyVinaditaContactComponent
  },
  {
    path: 'promotions',
    component: MyVinaditaPromotionsComponent
  },
  {
    path: 'home',
    component: MyVinaditaHomeComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
