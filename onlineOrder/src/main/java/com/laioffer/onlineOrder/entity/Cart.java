package com.laioffer.onlineOrder.entity;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table(name="cart")
public class Cart {

    private static final long serialVersionUID=8734140534986494039L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private double totalPrice;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
