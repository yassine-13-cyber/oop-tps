import java.util.Random;
public class first {
    public static void main(String[] args) {
    //  task 1 Declare and initialize variables
    String name ="yassine";
    String date_of_born = "06/06/2005";
    int age = 19;
    double  weight = 60  ;
    Random random = new Random();

    // Print variables
    System.out.println("My name is : " + name);
    System.out.println("Born on : " + date_of_born );
    System.out.println("I have " + age + " Years old ");
    System.out.println("i weight " + weight +"Kg" );

   // task 2 calculate the avrage of 3 number 
    int num1 = random.nextInt(100);
    int num2 = random.nextInt(100);
    int num3 = random.nextInt(100);
    int average = (num1 + num2 + num3) / 3; // Casting double to int
    System.out.println("average: " + average);
  // task 3 find the value 
  System.out.println((101 + 0) / 3);
  System.out.println(true && false);

  System.out.println(3.0e-6 * 10000000.1);

  System.out.println(true && true);

  System.out.println(((false && false ) || (true && true)));

  System.out.println((false || false) && (true && true));
  // even or odd  task 4 
  int num = 3;//random.nextInt(100);
  if ((num % 2)== 0) {
    System.out.println("number is even ");
  }else{
    System.out.println("the number is odd ");
  }
  //task 5
  int i =10;
  int n = i++%5;
  //post increment 
  System.out.println("i :"+ i++ +" n :"+n);
  //prefix increment
  System.out.println("i :"+ i++ +" n :"+n);
  boolean isfound =true ;
  System.out.println(!isfound);
  //task 6
  // Declare variables of all the primitive data types
  boolean booleanValue = false; // Default value
  byte byteValue = 0;           // Default value
  short shortValue = 0;         // Default value
  int intValue = 0;             // Default value
  long longValue = 0L;          // Default value
  float floatValue = 0.0f;      // Default value
  double doubleValue = 0.0d;    // Default value
  char charValue = '\u0000';    // Default value (null character)

  // Print the default values of each primitive type
  System.out.println("Default value of boolean: " + booleanValue);
  System.out.println("Default value of byte: " + byteValue);
  System.out.println("Default value of short: " + shortValue);
  System.out.println("Default value of int: " + intValue);
  System.out.println("Default value of long: " + longValue);
  System.out.println("Default value of float: " + floatValue);
  System.out.println("Default value of double: " + doubleValue);
  System.out.println("Default value of char: " + (int)charValue);
//task 7 
    }
    }
    