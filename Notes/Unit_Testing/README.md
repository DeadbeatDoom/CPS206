# Unit_Testing

~~~java

public class Car{
  drive(){
    startCar();
    putSeatbeltOn();
    putInGear();
    accelerate();
    turn();
    brake();
  }

  startCar(){
    checkSourceOfIgnition(){
      if(key).startKeyCar();   
      else startFobCar()
    }  
    startKeyCar(){
      put into ignition //imperative
      turn //imperative
      if(carb){
        press gas //imperative
      }  
    }
    startFobCar(){
      push button //imperative
    }
  }

  putSeatbeltOn();
  putInGear(){
    if(manual) shiftManual();
    else shiftAuto();
  }

  shiftManual(){
    pressClutch(){
      workClutch(true)
    }  
    movegearShift(gear);
    releaseClutch(){
      workClutch(false)
    }

    workClutch(boolean press){
      if(press){
        isClutchPress=true
      else  
        isClutchPress=false
      }
    }

    void testWorkClutch(){
      workClutch(true)
      assert (isClutchPress);
      workClutch(false)
      assert (isClutchPress);
    }  
  }
}

public class CarTest{
  test[Method]{
    //java -ea CarTest
  }
}
