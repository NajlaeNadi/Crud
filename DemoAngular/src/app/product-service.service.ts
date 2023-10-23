import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';
const baseURL ="http://localhost:8080/products";
@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {
  private base="http://localhost:8080/products";
  

  
  constructor(private http:HttpClient) { }

  getProductsList(): Observable<Product[]>{
    return this.http.get<Product[]>(baseURL);
  }
  createProduct(products: Product): Observable<Object>{
return this.http.post(baseURL,products);
  }
  getProductById(id: any): Observable<Product>{
    return this.http.get<Product>(`${this.base}/${id}`);
  }
  updateProduct(id: any,product:Product):Observable<Object>{
    return this.http.put(`${this.base}/${id}`,product);
  }
  deleteProduct(id: any):Observable<Object>{
    return this.http.delete(`${this.base}/${id}`);
  }

}
