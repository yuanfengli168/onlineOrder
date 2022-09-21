package com.laioffer.onlineOrder.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cart")
public class Cart {

    private static final long serialVersionUID=8734140534986494039L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OrderItem> orderItemList;

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

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
