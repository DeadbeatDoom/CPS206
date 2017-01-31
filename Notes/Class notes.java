import java.io.*;
import java.util.*;
public class List{
  public static void main (string[] args){
    ArrayList <string> list = new ArrayList();
    System.out.println(list.size());
    list.add("Bryan Marchal");
    System.out.println(list.size());
    list.add(0, "Marchal");
    System.out.println(list);
    System.out.println(list.contains("Kulis"));//F
    System.out.println(list.contains("Marchal"));//T?F

  }
}


// <E extends shape> Sets upper bound
// findAverage A rec()
// (?superInteger) Sets lower bound
// (E extends Comparable(?super E)) Sets upper and lower bounds

//
