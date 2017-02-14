package edu.jalc.inclass.bottle.sodabottlelabel;

class Logo{
  private String brand;
  private double fontSize;
  private Logo(){
    this.brand = null;
    this.fontSize = 0;
  }
  public Logo(String brand, double fontSize){
    this.brand = brand;
    this.fontSize = fontSize;
  }
  public String setBrand(){
    this.brand = brand;
  }
  public double setFontSize(){
    this.fontSize = fontSize;
  }
  public String getBrand(){
    return this.brand;
  }
  public double getFontSize(){
    return this.fontSize;
  }
}
