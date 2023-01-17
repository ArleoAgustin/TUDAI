import { Component, OnInit } from '@angular/core';
import { Vianda } from './Viandas';
import { ViandaCartService } from '../vianda-cart.service';

@Component({
  selector: 'app-viandas-list',
  templateUrl: './viandas-list.component.html',
  styleUrls: ['./viandas-list.component.scss']
})
export class ViandasListComponent implements OnInit {

  viandas: Vianda [] = [

  {
    "food":"Papas",
    "content": "Papas fritas",
    "price": 300,
    "image": "assets/img/papas_fritas.jpg",
    "offer": false,
    "priceOffer": 0,
    "quantity": 0,
  },
  {
    "food":"Milanesa de pollo",
    "content": "Milanesa de pollo, lechuga, tomate",
    "price": 700,
    "image": "assets/img/milanesa.jpg",
    "offer": true,
    "priceOffer": this.calcularDescuento(700),
    "quantity": 0,
  },
  {
    "food":"Pizza especial",
    "content": "Queso, paleta, tomate, morron",
    "price": 1200,
    "image": "assets/img/pizza.jpg",
    "offer": false,
    "priceOffer": 0,
    "quantity": 0,
  },
  {
    "food":"Canelones",
    "content": "Canelones de jamon y queso",
    "price": 1000,
    "image": "assets/img/canelones.jpg",
    "offer": false,
    "priceOffer": 0,
    "quantity": 0,
  }
];

viandasInCart: Vianda [] = [];

  constructor(private cart: ViandaCartService) { }

  ngOnInit(): void {
  }

  calcularDescuento( n: number): number{
    return n - (n * 0.1);
  }

  addViandaToCart(vianda: Vianda):void{
   if(vianda.quantity > 0)
    this.cart.addViandaToCart(vianda);
    vianda.quantity = 0;
  }
}
