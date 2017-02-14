package edu.jalc.inclass.dog;

public class Dog{

  public String name;

  public Dog(String name){

    this.name = name;
  }

  public boolean equals(Object other){

    Dog dog = (Dog)other;

    return this.name.equals(dog.name);// && super.equals(other);
  }

  public int hashCode(){

    return super.hashCode() % 32;
  }

  public String toString(){

    return "My name is " + this.name;
  }

  public void bark(){
    System.out.println("woof");
  }
  /*public void bark(int numberOfTimes){
    for(int i = 0; i(numberOfTimes){
      this.bark();
    }
  }*/
}
