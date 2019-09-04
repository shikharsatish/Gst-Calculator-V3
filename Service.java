package com.innovect.assignment;

public class Service {
  double furnitureGst = 0.05;
  Furniture furniture = new Furniture();
  Food food = new Food();

  void setFoodPrices(double foodPrice){
    food.setFoodItem(foodPrice);
  }
  void setFurniturePrices(double furniturePrice){
    furniture.setFurnitureItem(furniturePrice);
  }
   double calculateFoodBill(int foodQuantity){
     double totalFoodBill = foodQuantity * food.getFoodItem();
     return totalFoodBill;
   }
   double calculateFurnitureBill(int furnitureQuantity){
     double furniturePrice = furniture.getFurnitureItem();
     double totalFurnitureBill = furniturePrice + (furniturePrice * furnitureQuantity * furnitureGst);
     return totalFurnitureBill;
   }
   double totalBill(int foodQuantity, int furnitureQuantity){
     return calculateFoodBill(foodQuantity) + calculateFurnitureBill(furnitureQuantity);
   }
}
