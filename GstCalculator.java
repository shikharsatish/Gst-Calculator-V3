package com.innovect.assignment;

public class GstCalculator {
  public static void main(String[] args) {
    Service service = new Service();
    service.setFoodPrices(100);
    service.setFurniturePrices(2500);
    double totalBill = service.totalBill(1,1);
    System.out.println("Total Amount: " + totalBill);
  }
}
