package edu.jalc.inclass.bottle;

class SodaBottle{

  private double capacity;
    private SodaBottle(){
      setCapacity(0);
    }
    SodaBottle(double capacity){
      setCapacity(capacity);
    }
    void setCapacity(double capacity){
      this.capacity = capacity;
    }
  //private final double height;
  //private final double circumference;
  //private boolean isEmpty;
}
