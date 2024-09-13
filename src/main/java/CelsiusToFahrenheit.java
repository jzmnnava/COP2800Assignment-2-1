//This program converts Celsius to Fahrenhiet in a double value 

import java.util.Scanner;

public class CelsiusToFahrenheit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//Input value 
    System.out.print("Enter a degree in Celsius: ");
    double celsius = input.nextDouble();

//Convert Celsius to Fahrenheit  
    double fahrenheit = (9/5.0) * celsius + 32;
    System.out.println(celsius + " Celsius " + "is " + fahrenheit + " Fahrenhiet");
  }  
}
