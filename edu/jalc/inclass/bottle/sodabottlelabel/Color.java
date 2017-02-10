package edu.jalc.inclass.bottle.sodabottlelabel;

class Color{
  private final byte red;
  private final byte green;
  private final byte blue;
  private Color(){
    this.red = 0;
    this.green = 0;
    this.blue = 0;
  }
  public Color(byte red, byte green, byte blue){
    this.red = red;
    this.green = green;
    this.blue = blue;
  }
  public byte getRed() {
    return red;
  }
  public byte getGreen() {
    return green;
  }
  public byte getBlue() {
    return blue;
  }

  public Color setColor(Color color){
    this.Color = color;
  }
}
