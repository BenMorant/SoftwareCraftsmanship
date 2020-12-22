package fr.benmorant.softwarecraftsmanship.katas.fizzbuzz;

import java.util.Scanner;

public class FizzBuzzApp {

  public static final String FIZZ = "Fizz";

  public static final String BUZZ = "Buzz";

  public static void main(String[] args) {
    FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number : ");
    int input = sc.nextInt();
    String response = fizzBuzzApp.fizzBuzz(input);
    System.out.println(response);
  }

//  public String fizzBuzz (int input) {
//    return null;
//
//  }


//  public String fizzBuzz (int input) {
//    String result = null;
//    result = String.valueOf(input);
//    return result;
//
//  }

//    public String fizzBuzz (int input) {
//    String result = null;
//    result = String.valueOf(input);
//      if (input == 3) {
//        return FIZZ;
//  }
//    return result;
//
//  }

//  public String fizzBuzz (int input) {
//    String result = null;
//    result = String.valueOf(input);
//    if (isDivisibleBy3(input)) {
//      return FIZZ;
//    }
//    return result;
//  }

//  public String fizzBuzz (int input) {
//    String result = null;
//    result = String.valueOf(input);
//    if (isDivisibleBy3(input)) {
//      return FIZZ;
//      }
//    if (isDivisibleBy5(input)) {
//      return BUZZ;
//    }
//    return result;
//  }


  public String fizzBuzz (int input) {
    String result = null;
    result = String.valueOf(input);
    if (isDivisibleBy3(input) && isDivisibleBy5(input)) {
      return FIZZ + BUZZ;
    }
    if (isDivisibleBy3(input)) {
      return FIZZ;
    }
    if (isDivisibleBy5(input)) {
      return BUZZ;
    }
    return result;
  }

  private boolean isDivisibleBy3(int input) {
    return input % 3 == 0;
  }

  private boolean isDivisibleBy5(int input) {
    return input % 5 == 0;
  }

}
