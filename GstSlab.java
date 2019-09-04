package com.innovect.gstCalculatorV3;

public class GstSlab {
  private static double slab1 = 0.0;
  private static double slab2 = 0.05;
  private static double slab3 = 0.15;


  static double gstCalculator(Product product) {
    double gstBill = 0.0;
    switch (product.getCategory()) {
      case FOOD:
        double foodGst = slab1 * product.getPrice();
        gstBill = foodGst;
        break;

      case FURNITURE:
        double furnitureGst = slab2 * product.getPrice();
        gstBill = furnitureGst;
        break;

      case ELECTRONICS:
        double electronicGst = slab3 * product.getPrice();
        gstBill = electronicGst;
    }
    return gstBill;
  }
}
