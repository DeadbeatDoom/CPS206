import java.io.*;
import java.util.*;
public class Example {
  public static void main(String[] args){
    ArrayList <String> list = new ArrayList <String> ();
    System.out.println(list.size());
    list.add("Bryan Marchal");
    System.out.println(list.size());
    list.add(0, "Marchal");
    System.out.println(list);
    System.out.println(list.contains("Kulis"));//F
    System.out.println(list.contains("Marchal"));//T?F
    String firstName = list.get(1);
    System.out.println(firstName);
  }
}


// <E extends shape> Sets upper bound
// findAverage A rec()
// (?superInteger) Sets lower bound
// (E extends Comparable(?super E)) Sets upper and lower bounds
//
//
