package day4;
public class product {
 private String productName;
 private String productCode;
 private double price;
 public String getProductName() {
     return productName;
 }
 public void setProductName(String productName) {
     this.productName = productName;
 }
 public String getProductCode() {
     return productCode;
 }
 public void setProductCode(String productCode) {
     this.productCode = productCode;
 }
 public double getPrice() {
     return price;
 }
 public void setPrice(double price) {
     this.price = price;
 }
 public void applyDiscount(double percentage) {
     if (percentage > 0 && percentage <= 100) {
         this.price -= this.price * (percentage / 100);
     }
 } 
}
