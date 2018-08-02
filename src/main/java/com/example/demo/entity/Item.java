package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

    //배송비
    @Column(name = "delivery_fee")
    private int deliveryFee;

    private boolean deleted = false;
    //기타 상세설명

    //이미지 저장 위치(main)

    //이미지 저장 위치(세부)

    public void update(Item item){
        this.price = item.price;
        this.deliveryFee = item.deliveryFee;
    }

    public void delete() {
        this.deleted = true;
    }

}