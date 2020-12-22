package fr.benmorant.softwarecraftsmanship.katas.leapyear;

import java.util.Scanner;

public class LeapYearApp {

  public static void main(String[] args) {
    LeapYearApp leapYearApp = new LeapYearApp();
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a year : ");
    int year = sc.nextInt();
    boolean response = leapYearApp.isLeapyear(year);
    System.out.println(response);
  }

//  public boolean isLeapyear(int year) {
//    return false;
//  }

//  public boolean isLeapyear(int year) {
//    if (year == 1996) {
//      return true;
//    }
//    return false;
//  }

//  public boolean isLeapyear(int year) {
//    if (year == 1996) {
//      return true;
//    }
//    return false;
//  }

//  public boolean isLeapyear(int year) {
//    if (year == 2000) {
//      return true;
//    }
//    return isTypicalLeapYear(year) && !isAtypicalCommonYear(year);
//  }

  public boolean isLeapyear(int year) {
    return isTypicalLeapYear(year) && (!isAtypicalCommonYear(year) || isAtypicalLeapYear(year));
  }

  private boolean isTypicalLeapYear(int year) {
    return year % 4 == 0;
  }

  private boolean isAtypicalCommonYear(int year) {
    return year % 100 == 0;
  }

  private boolean isAtypicalLeapYear(int year) {
    return year % 400 == 0;
  }

}
