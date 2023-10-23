package com.SpringBoot.DemoApplication.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "prod")

public class Prod {

@Id
    private Integer id;
@Column(name="name")
    private String name;
@Column(name="brand")
    private String brand;
@Column(name="Price")
    private float price;
@Column(name="date")
    private LocalDateTime date;
@Column(name="category")
    private String category;

    public Prod() {
    }

    public Prod(Integer id, String name, String brand, float price, LocalDateTime date, String category) {
        this.id=id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.date = date;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
