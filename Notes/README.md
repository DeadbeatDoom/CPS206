# Example
This is an Example

## Stuff

### Things


Iterator<String> iterator = list.iterator();

while(iterator.hasNext()){

  System.out.println(iterator.next());

}

.sort()

.compareTo


# 2D ArrayList?

ArrayList<ArrayList<String>> list = new ArrayList<>();

  list.get() //zero

  list.get(0) //null

  list.add(new ArrayList<>());

    list.size() //one

    list.size(0) //zero

  ArrayList<String> listZero = list.get(0);

    listZero.size();

ArrayList<String>[] lists = new ArrayList[1000000];

  list[999].size(); //zero

  lists.size();

# Hashing

String[]names = new String[17];

names["anthony".hashCode()%17]="anthony";

names[hashTag.hashCode()%17]=post;

ArrayList<String>[]names = new String[17];

int friday = "#Friday".hashCode % names.length;

names[friday] = new ArrayList<>();

names[friday].add (post);

=names[friday];

# Mapping

java.util.hashmap

class hashmap<key,value>

HashMap<Integer,String> numbers = new HashMap<>();
  numbers.put(1,"one");
  .
  .
  .
    numbers.get(1)
1- "one"
2- "two"
3- "three"

## Testable

public final static - creates a constant
Static - only creates a single reference
Singletons
SUP - Single Use Purpose
DRY - Don't Repeat Yourself
closed/open principle
Builder Pattern

if(maze.spot open(up)){move(up)} YES
if(maze[+1][.]).... NO

setAttached (boolean attach) NO
attach()
detach()YES

# SUP
Bottle{
  String typeOfLiquid; NO
  Content[] contents YES
}

Book{
  String title;
  Preface preface;
  Chapter[] chapters;
}

## Private Classes

public class Dog {
  private Dogcollar dogCollar = new DogCollar();
# Private Inner Class
  private class DogCollar {    
  }
}

public class Dog {
  private String name;
  public Dog(String name){
    this.name = name
  }
}
Dog fido = new Dog("Fido");
Dog spot = new Dog("Spot");
Dog maxwell = new Dog("Maxwell");

public static void main(...) NO
Dog.main

public final static String NAME;
