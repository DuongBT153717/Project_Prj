/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
@Builder
@ToString
public class Cart {
    private Product product;
    private int quantity; // số lượng sản phẩm trên giỏ hàng

    public Cart() {
    }

    public Cart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
