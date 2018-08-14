package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int price;

    private int quantity;

    private String desc;

    private String url;

    private boolean deleted = false;

    public void update(Item item){
        this.name = item.name;
        this.quantity = item.quantity;
        this.price = item.price;
        this.desc = item.desc;
        this.url = item.url;
    }

    public void delete() {
        this.deleted = true;
    }

}