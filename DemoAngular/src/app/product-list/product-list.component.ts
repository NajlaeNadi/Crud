import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductServiceService } from '../product-service.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit{
  products : Product[];
  constructor(private productService: ProductServiceService
    ,private HttpClient:HttpClient,
    private router: Router
    ){}
  ngOnInit(): void {
    this.getProductst();
  }

  getProductst(){
  this.HttpClient.get<any>('http://localhost:8080/products').subscribe(response=>
  {
    console.log(response);
    this.products=response;
  });
  
 }
 updateProduct(id :any){

  this.router.navigate(['update-product',id])

 }
 deleteProduct(id :any){

  this.productService.deleteProduct(id).subscribe(data=>{
    console.log(data);
    this.getProductst();
  })

 }

    
  }



