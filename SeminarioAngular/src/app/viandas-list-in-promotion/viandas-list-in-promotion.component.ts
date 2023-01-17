import { Component, OnInit } from '@angular/core';
import { Vianda } from '../viandas-list/Viandas';

@Component({
  selector: 'app-viandas-list-in-promotion',
  templateUrl: './viandas-list-in-promotion.component.html',
  styleUrls: ['./viandas-list-in-promotion.component.scss']
})
export class ViandasListInPromotionComponent implements OnInit {

  viandasOffer: Vianda [] = [
    {
      "food":"Milanesa de carne con papas",
      "content": "",
      "price": 1500,
      "image": "",
      "offer": true,
      "priceOffer": this.calcularDescuento(1500),
      "quantity": 10
    },

    {
      "food":"Milanesa de pollo",
      "content": "",
      "price": 700,
      "image": "",
      "offer": true,
      "priceOffer": this.calcularDescuento(700),
      "quantity": 10
    },

    {
      "food":"Medallones de soja",
      "content": "",
      "price": 500,
      "image": "",
      "offer": true,
      "priceOffer": this.calcularDescuento(500),
      "quantity": 10
    },

    {
      "food":"Fideos con salsa roja",
      "content": "",
      "price": 800,
      "image": "",
      "offer": true,
      "priceOffer":this.calcularDescuento(800),
      "quantity": 10
    },

    {
      "food":"Ensalada tradicional",
      "content": "",
      "price": 350,
      "image": "",
      "offer": true,
      "priceOffer": this.calcularDescuento(350),
      "quantity": 10
    },

    {
      "food":"Ensalada rusa",
      "content": "",
      "price": 420,
      "image": "",
      "offer": true,
      "priceOffer": this.calcularDescuento(420),
      "quantity": 10
    },

    {
      "food":"Vianda celiacos",
      "content": "",
      "price": 1100,
      "image": "",
      "offer": true,
      "priceOffer": this.calcularDescuento(1100),
      "quantity": 10
    },

  ];

  constructor() { }

  ngOnInit(): void {
  }

  calcularDescuento( n: number): number{
    return n - (n * 0.1);
  }
}
