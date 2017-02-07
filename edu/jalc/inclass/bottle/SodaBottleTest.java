package edu.jalc.inclass.bottle;

class SodaBottleTest{
  public static void testGetCapacity(){
    //expects 20.0
    SodaBottle sb = new SodaBottle();
    assert(sb.getCapacity()==20.0);
  }
  public static void main(String[] args){
    testGetCapacity();
  }
}
