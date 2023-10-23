import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../product';
import { ProductServiceService } from '../product-service.service';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.css']
})
export class CreateProductComponent {
  products :Product = new Product();
constructor( private ProdService:ProductServiceService,
  private router:Router){}
ngOnInit(): void{

}
Save(){
  this.ProdService.createProduct(this.products).subscribe(response=>{
    console.log(response);
    this.goToList();
  },
  err =>console.log(err))
  
  
}
goToList(){
this.router.navigate(['/products']);
}
OnSubmit(){
  console.log(this.products);
  this.Save();
}
}
