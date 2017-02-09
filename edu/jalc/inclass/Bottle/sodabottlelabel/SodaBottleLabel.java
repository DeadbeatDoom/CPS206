package edu.jalc.inclass.label;

private class Label{

  private double height;
  private double width;
  private class color{


  }

  public Label(){
		this.setHeight(0.0);
	}
	public Label(double height){
		this.setHeight(height);
	}
  public double getHeight(){
    return this.height; }
	public Label setHeight(double height){
		this.height = height;
		return this;
	}

  public Label(){
		this.setWidth(0.0);
	}
	public Label(double width){
		this.setWidth(width);
	}
	public double getWidth(){
    return this.width;
  }

	public Label setWidth(double width){
		this.width = width;
		return this;
	}
}
