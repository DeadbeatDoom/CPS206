package edu.jalc.inclass.dog;

public class Driver {

  public static void main(String...arg){

    Dog fido = new Dog("fido");

    Dog spot = new Dog("spot");

    System.out.println(fido.equals(spot));

    System.out.println(fido); //Calls toString()

    System.out.println(fido.hashCode());

    Dog.bark;
  }
}
