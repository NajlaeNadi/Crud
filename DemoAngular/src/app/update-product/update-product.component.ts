import { Component } from '@angular/core';
import { ProductServiceService } from '../product-service.service';
import { Product } from '../product';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent {
  id: any;
  products :Product=new Product();
  constructor(private productService :ProductServiceService,
    private route: ActivatedRoute,
    private router :Router){}
  ngOnInit():void {
this.id=this.route.snapshot.params['id'];
    this.productService.getProductById(this.id).subscribe(data=>{
      this.products=data;});
    
  }
  OnSubmit(){
    this.productService.updateProduct(this.id,this.products).subscribe(
      data=>{this.goToList();}
    );

  }
  goToList(){
    this.router.navigate(['/products']);
    }

}
