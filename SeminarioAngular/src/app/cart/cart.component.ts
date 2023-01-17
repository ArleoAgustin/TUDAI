import { Component, OnInit, ɵisListLikeIterable } from '@angular/core';
import { Vianda } from '../viandas-list/Viandas';
import { ViandaCartService } from '../vianda-cart.service';



@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})

export class CartComponent  implements OnInit {

  viandasInCart: Vianda[] =[];

  constructor(private cart: ViandaCartService) {
    cart.listCart.subscribe((observable:Vianda[]) => this. viandasInCart=observable);

    
    
    }
    
  isEmpty():boolean{
    return this.viandasInCart[0] != null;
  }


uptadateTotal():number{

  let total = 0;
  for (let vianda in this.viandasInCart) {
    if(!this.viandasInCart[vianda].offer)
      total+=this.viandasInCart[vianda].price * this.viandasInCart[vianda].quantity;
    else
      total+=this.viandasInCart[vianda].priceOffer * this.viandasInCart[vianda].quantity;
  }
    return total;
  
}

  ngOnInit(): void {
   
   
  }

  removeVianda(vianda:Vianda):void{
    this.cart.removeViandainCart(vianda);
  }

}
