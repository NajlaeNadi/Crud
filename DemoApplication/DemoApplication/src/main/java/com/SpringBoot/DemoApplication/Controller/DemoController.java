package com.SpringBoot.DemoApplication.Controller;
import java.util.*;

import com.SpringBoot.DemoApplication.DAQ.ProdRepo;
import com.SpringBoot.DemoApplication.Model.Prod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


    @CrossOrigin
    @RestController
    public class DemoController {
        @Autowired
        private ProdRepo Repo;

        @GetMapping("/products")
        public List<Prod> findAll(){
                return Repo.findAll();
        }
        @PostMapping("/products")
        public Prod saveProduct(@RequestBody Prod product){
                return Repo.save(product);
        }
        @GetMapping("/products/{id}")
        public ResponseEntity<Prod> findById(@PathVariable Integer id) throws Exception{
             Prod product =Repo.findById(id).orElseThrow(()->new Exception("Not Found"));

            return ResponseEntity.ok(product);

        }

        @PutMapping("products/{id}")
        public ResponseEntity<Prod> updateOrSave(@RequestBody Prod productdetails, @PathVariable Integer id)throws Exception{
          Prod product =Repo.findById(id).orElseThrow(()->new Exception("Not Found"));
          product.setName(productdetails.getName());
            product.setBrand(productdetails.getBrand());
            product.setPrice(productdetails.getPrice());
            product.setDate(productdetails.getDate());
            product.setCategory(productdetails.getCategory());
            Prod UpdatedProduct = Repo.save(product);
            return ResponseEntity.ok(UpdatedProduct);


        }
        @DeleteMapping("products/{id}")
        public ResponseEntity<Map<String,Boolean>>delete(@PathVariable Integer id)throws Exception{
            Prod product =Repo.findById(id).orElseThrow(()->new Exception("Not Found"));
            Repo.delete(product);
             Map<String,Boolean> response= new HashMap<>();
             response.put("deleted",Boolean.TRUE);
             return ResponseEntity.ok(response);

        }

}
