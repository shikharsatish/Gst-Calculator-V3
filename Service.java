package com.innovect.gstCalculatorV3;

import java.util.Map;

public class Service {
 // double discount  =0.0;
 // static double foodBill = 0.0;
//  Electronics electronics = new Electronics();
//  Furniture furniture = new Furniture();
//  Food food = new Food();
//  GstSlab gstSlab = new GstSlab();
//  int quantity = 0;
//
//  double calculateFoodBill(int foodQuantity, double foodPrice) {
//    quantity = quantity + foodQuantity;
//    food.setFoodItem(foodPrice);
//    double foodBill = foodQuantity * food.getFoodItem() + gstSlab.foodGst(foodPrice);
//    if (foodBill > 1000){
//      return discount(foodBill);
//    }else
//    return foodBill;
//  }
//
//  double calculateFurnitureBill(int furnitureQuantity, double furniturePrice) {
//    quantity = quantity + furnitureQuantity;
//    furniture.setFurnitureItem(furniturePrice);
//    double furnitureBill = furnitureQuantity * furniture.getFurnitureItem() + gstSlab.furnitureGst(furniturePrice);
//    if (furnitureBill > 1000){
//      return discount(furniturePrice);
//    }else
//    return furnitureBill;
//  }
//
//  double calculateElectronicsBill(int electronicsQuantity, double electronicPrice) {
//    quantity = quantity + electronicsQuantity;
//    electronics.setElectronicItem(electronicPrice);
//    double electronicsBill = electronicsQuantity * electronics.getElectronicItem() +  gstSlab.electronicGst(electronicPrice);
//    if(electronicsBill > 1000)
//      return discount(electronicsBill);
//    else
//    return electronicsBill;
//  }
//
//  int itemQuantity() {
//    return quantity;
//  }
//  double discount(double price){
//    double discountedPrice = price - (price * 0.1);
//    return discountedPrice;
//  }

 // double totalBill(int foodQuantity, double foodPrice, int furnitureQuantity, double furniturePrice, int electronicsQuantity, double electronicPrice) {
   // return calculateFoodBill(foodQuantity, foodPrice) + calculateFurnitureBill(furnitureQuantity, furniturePrice) + calculateElectronicsBill(electronicsQuantity, electronicPrice);
  //}
  double totalBill(Map<Product, Integer> cartItems){
    double totalBill = 0.0;
    for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
      totalBill+=discountOnBill(entry.getKey(), entry.getValue());
       //totalBill += (entry.getKey().getPrice() + GstSlab.gstCalculator(entry.getKey()))* entry.getValue();
      //totalBill = foodBill + furnitureBill + electronicBill;
     // System.out.println("Category:" + entry.getKey().getCategory() + "\tProduct Name:" + entry.getKey().getProductName() + "\tPrice:" + entry.getKey().getPrice() + "\tQuantity:" + entry.getValue());

    }
    return totalBill;
  }
  double discountOnBill(Product product, int quantity){
    double discountedBill = 0.0;
    switch (product.getCategory()) {
      case FOOD:
      discountedBill = (product.getPrice() + GstSlab.gstCalculator(product)) * quantity;
        if( discountedBill > 1000){
        discountedBill = discountedBill - (discountedBill * 0.1);
        }
        break;

      case FURNITURE:
        discountedBill = (product.getPrice() + GstSlab.gstCalculator(product)) * quantity;
        if(discountedBill > 1000){
          discountedBill = discountedBill - (discountedBill * 0.1);
        }
        break;

      case ELECTRONICS:
        discountedBill = ((product.getPrice() + GstSlab.gstCalculator(product)) * quantity);
        if(discountedBill > 1000){
          discountedBill = discountedBill - (discountedBill * 0.1);
        }
        break;
    }
    return discountedBill;
  }
}
