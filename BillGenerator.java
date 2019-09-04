package com.innovect.gstCalculatorV3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BillGenerator {
  public static void main(String[] args) {
    Product biscuit = new Product(Category.FOOD, "Biscuit", 10, 10);
    Product chair = new Product(Category.FURNITURE, "chair", 100, 5);
    Product earphone = new Product(Category.ELECTRONICS, "earphone", 200, 7);
    Cart.addProductToCart(biscuit, 2);
    Cart.addProductToCart(chair, 2);
    Cart.addProductToCart(earphone, 6);
    Cart.addProductToCart(earphone, 56);
    Service service = new Service();
    double totalBill = service.totalBill(Cart.getCartItems());
    System.out.println("\nTotal Amount:" + totalBill);
    System.out.println("Bill:" + Cart.getCartItems());
    Map<Product, Integer> cartItems = Cart.getCartItems();
  }
}
