package com.innovect.gstCalculatorV3;

public class Product {
  private Category category;
  private String productName;
  private double price;
  private int quantity;

  public Product(Category category, String productName, double price, int quantity) {
    this.category = category;
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "\nCategory:" + this.getCategory() + "\tProduct Name:"+ this.getProductName() + "\tPrice:" + this.getPrice() + "\tQuantity:" + this.getQuantity();
  }
}
