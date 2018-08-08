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
    @Column(name = "item_num")
    private int itemNum;

    //상품가격
    @Column(name = "price")
    private int price;

    @Column(name = "delivery_fee")
    private int deliveryFee;

    @Column(name = "reg_date")
    private Date regDate;

    @Column(name = "subject")
    private String title;

    @Column(name = "content")
    private String content;

    private boolean deleted = false;

    public void update(Item item){
        this.price = item.price;
        this.deliveryFee = item.deliveryFee;
    }

    public void delete() {
        this.deleted = true;
    }

}