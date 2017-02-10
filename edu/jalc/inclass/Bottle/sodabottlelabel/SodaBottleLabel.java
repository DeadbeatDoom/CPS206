package edu.jalc.inclass.label;

class Label{

  private final double height;

  private class Color{
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
  }

  public class Logo{
    private final String brand;
    private final double fontSize;
    private Logo(){
      this.brand = null;
      this.fontSize = 0;
    }
    public Logo(String brand, double fontSize){
      this.brand = brand;
      this.fontSize = fontSize;
    }
    public String getBrand(){
      return this.brand;
    }
    public double getFontSize(){
      return this.fontSize;
    }
  }

  private Label(){
		this.setHeight(0.0);
    this.setColor(null);
    this.setLogo(null);
	}

	public Label(double height, Color color, Logo logo){
		this.setHeight(height);
    this.setColor(color);
    this.setLogo(logo);
	}

  public double getHeight(){
    return height;
  }
  public Color getColor(){
    return color;
  }
  public Logo getLogo(){
    return logo;
  }
}
