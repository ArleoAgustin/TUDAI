import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { Vianda } from './viandas-list/Viandas';


@Injectable({
  providedIn: 'root'
})
export class ViandaCartService {

  private _listCart: Vianda [] = [];
  listCart: BehaviorSubject<Vianda[]> = new BehaviorSubject(this._listCart);
  
  constructor() {}
  
    addViandaToCart(vianda: Vianda) {
      
      let item: Vianda | undefined = this._listCart.find((v1) => v1.food == vianda.food);
      if(!item){
        this._listCart.push({...vianda});
      }else{
        item.quantity += vianda.quantity;
      }
      this.listCart.next(this._listCart);
    }

    removeViandainCart(vianda:Vianda){
      this._listCart.splice(this._listCart.indexOf(vianda),1)
    }
}
