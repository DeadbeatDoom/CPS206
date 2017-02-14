package edu.jalc.inclass.bottle.sodabottlelabel;

class SodaBottleLabel{

  private final double height;

  private SodaBottleLabel(){
		this.setHeight(0.0);
    this.setColor(null);
    this.setLogo(null);
	}

	public SodaBottleLabel(double height, Color color, Logo logo){
		this.setHeight(height);
    this.setColor(color);
    this.setLogo(logo);
	}

  public SodaBottleLabel setHeight(double height){
    this.height = height;
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
