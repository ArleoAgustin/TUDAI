import { Component, Input, OnInit } from '@angular/core';
import { Vianda } from '../viandas-list/Viandas';

@Component({
  selector: 'app-input-integer',
  templateUrl: './input-integer.component.html',
  styleUrls: ['./input-integer.component.scss']
})
export class InputIntegerComponent implements OnInit {

 
  
  viandasInCart: Vianda [] = [];
  
  constructor() { }
  
  @Input()
  vianda!: Vianda;
  
  ngOnInit(): void {
  }

  upQuantity(vianda: Vianda): void{
    vianda.quantity++;
  }

  
  downQuantity(vianda: Vianda): void{
    if(vianda.quantity > 0)
    vianda.quantity--;
  }


  addVianda(vianda: Vianda): void{
    this.viandasInCart.push(vianda);
    console.log(this.viandasInCart)
   }
   
}
