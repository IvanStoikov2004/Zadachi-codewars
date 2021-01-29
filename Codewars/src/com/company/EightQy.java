package com.company;

public class EightQy {

    public static void main(String[] args) {
	// write your code here



/*
        8 kyu
        Subtract the Sum
        Java:

        public class Kata {
            public static String subtractSum (int n) {
                return "apple";
            }
        }

      /////////////////////////////

        8 kyu
        Simple Fun #1: Seats in Theater
        Java:

        public class Kata {

            public static int seatsInTheater(int nCols, int nRows, int col, int row) {

                return (nCols-col+1)*(nRows-row);

            }

        }

       //////////////////////////////////////////////////////

        8 kyu
        Circles in Polygons
        Java:

        public class Polygon {

            private final double diameter;

            public Polygon(int sides, int sideLength) {
                this.diameter = sideLength / Math.tan(Math.toRadians(180d/sides));
            }

            public double circleDiameter(){
                return this.diameter;
            }

        }

     ///////////////////////////////////////
        8 kyu
        Triple Trouble
        Java:

        public class Kata {
            public static String tripleTrouble(String s1, String s2, String s3) {
                StringBuilder sb = new StringBuilder(s1.length()*3);
                for (int i=0; i<s1.length(); i++) {
                    sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
                }
                return sb.toString();
            }
        }

     /////////////////////////////////////////

        8 kyu
        Get Nth Even Number
        Java:

        public class Num {
            public static int nthEven(int n) {
                return (n-1)*2;
            }
        }

      ///////////////////////////////////////////////

        8 kyu
        Count Odd Numbers below n
        Java:

        public class Kata {

            public static int oddCount(int n){

                return n/2;
            }

        }

   ////////////////////////////////////////

        public class Kata {

            public static int oddCount(int n){

                return n/2;
            }

        }

       /////////////////////////////////////////////////
        8 kyu
        Area of a Square
        Java:

import java.math.BigDecimal;
        public class Geometry{
            public static double squareArea(double A){

                return new BigDecimal(Math.pow((A*2/Math.PI),2))
                        .setScale(2, BigDecimal.ROUND_DOWN)
                        .doubleValue();
            }
        }

        //////////////////////////////////
        8 kyu
Calculate BMI
Java:

public class Calculate {
  public static String bmi(double weight, double height) {

      double bmi = weight / (height * height);

      if ( bmi <= 18.5) return "Underweight";
      if ( bmi <= 25) return "Normal";
      if ( bmi <= 30) return "Overweight";
      return "Obese";

  }
}

   ///////////////////////

8 kyu
Sum Mixed Array
Java:

import java.util.List;

public class MixedSum {

  public int sum(List<?> mixed) {
    return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
  }

}

   ////////////////////////////////

8 kyu
Sentence Smash
Java:

public class SmashWords {
  public static String smash(String... words) {
    return String.join(" ", words);
  }
}

  ///////////////////

8 kyu
Volume of a Cuboid
Java:

public class Kata {

  public static double getVolumeOfCuboid(final double length, final double width, final double height) {
    return length * width * height;
  }

}

  //////////////////

8 kyu
How good are you really?
Java:

import java.util.Arrays;

class Kata {
    static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}

  ///////////////////////////////

8 kyu
MakeUpperCase
Java:

class Upper{
  public static String MakeUpperCase(String str){
    return str.toUpperCase();
  }
}

   ////////////////////////////////////

8 kyu
Reversed Words
Java:

import java.util.*;

public class ReverseWords{

 public static String reverseWords(String str){
     //write your code here...
     List Words = Arrays.asList(str.split(" "));
     Collections.reverse(Words);
     return String.join(" ", Words);
 }
}

   ////////////////////

8 kyu
Sum without highest and lowest number
Java:

public class Kata
{
  public static int sum(int[] numbers)
  {
    if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
    int min,max,sum;
    sum = min = max = numbers[0];
    for (int i = 1; i < numbers.length; i++)
    {
      sum += numbers[i];
      if (numbers[i] < min) min = numbers[i];
      if (numbers[i] > max) max = numbers[i];
    }
    return sum - min - max;
  }
}

   ////////////////////////////////

8 kyu
Are You Playing Banjo?
Java:

public class Banjo
{
  public static String areYouPlayingBanjo(String name)
  {
    if( name.toUpperCase().startsWith("R") )
      return name + " plays banjo";
    else
      return name + " does not play banjo";
  }
}

    3 weeks ago
    Refactor

8 kyu
Count of positives / sum of negatives
Java:

public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
       if (input == null || input.length == 0) return new int[] {};
       int count = 0,sum = 0;
       for (int i : input) {
         if (i > 0) count ++;
         if (i < 0) sum += i;
       }
       return new int[] {count,sum};
    }
}

    3 weeks ago
    Refactor

8 kyu
My head is at the wrong end!
Java:

public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    return new String[] {arr[2], arr[1], arr[0]};
  }
}

    3 weeks ago
    Refactor

8 kyu
Welcome!
Java:

import java.util.HashMap;

public class Welcome {
  public static String greet(String language){
    HashMap<String, String> greeting = new HashMap<>();
    greeting.put("english", "Welcome");
    greeting.put("czech", "Vitejte");
    greeting.put("danish", "Velkomst");
    greeting.put("dutch", "Welkom");
    greeting.put("estonian", "Tere tulemast");
    greeting.put("finnish", "Tervetuloa");
    greeting.put("flemish", "Welgekomen");
    greeting.put("french", "Bienvenue");
    greeting.put("german", "Willkommen");
    greeting.put("irish", "Failte");
    greeting.put("italian", "Benvenuto");
    greeting.put("latvian", "Gaidits");
    greeting.put("lithuanian", "Laukiamas");
    greeting.put("polish", "Witamy");
    greeting.put("spanish", "Bienvenido");
    greeting.put("swedish", "Valkommen");
    greeting.put("welsh", "Croeso");

    if (greeting.containsKey(language)) {
      return greeting.get(language);
    }
    return greeting.get("english");
   }
}

    3 weeks ago
    Refactor

8 kyu
Function 3 - multiplying two numbers
Java:

public class Kata {
    public static int multiply(int num1, int num2) {
        return num1*num2;
    }
}

    3 weeks ago
    Refactor

8 kyu
altERnaTIng cAsE <=> ALTerNAtiNG CaSe
Java:

public class StringUtils {
    public static String toAlternativeString(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
}

    3 weeks ago
    Refactor

8 kyu
Third Angle of a Triangle
Java:

public class ThirdAngle {

    public static int otherAngle(int angle1, int angle2) {
        return 180 - (angle1 + angle2);
    }
}

    3 weeks ago
    Refactor

8 kyu
Transportation on vacation
Java:

public class Kata {
  private static final int COST_PER_DAY = 40;

  public static int rentalCarCost(int d) {
    if (d < 3)       return d * COST_PER_DAY;
    else if (d >= 7) return d * COST_PER_DAY - 50;
    else             return d * COST_PER_DAY - 20;
  }
}

    3 weeks ago
    Refactor

public class Kata {
  private static final int COST_PER_DAY = 40;

  public static int rentalCarCost(int d) {
    if (d < 3)       return d * COST_PER_DAY;
    else if (d >= 7) return d * COST_PER_DAY - 50;
    else             return d * COST_PER_DAY - 20;
  }
}

    3 weeks ago
    Refactor

8 kyu
Will you make it?
Java:

class Kata {
  static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    return distanceToPump <= mpg * fuelLeft;
  }
}

    3 weeks ago
    Refactor

8 kyu
Beginner - Reduce but Grow
Java:

public class Kata{

  public static int grow(int[] x){
    int result = 1;
    for (int a : x) {
      result *= a;
    }
    return result;
  }
}

    3 weeks ago
    Refactor

8 kyu
Get the mean of an array
Java:

public class School{

  public static int getAverage(int[] marks){
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }

    return sum / marks.length;
  }

}

    3 weeks ago
    Refactor

8 kyu
Find Maximum and Minimum Values of a List
Java:

import java.util.Arrays;

public class Kata {

  public int min(int[] list) {
    return Arrays.stream(list).min().getAsInt();
  }

  public int max(int[] list) {
    return Arrays.stream(list).max().getAsInt();
  }
}

    3 weeks ago
    Refactor

8 kyu
Total amount of points
Java:

public class TotalPoints {

    public static int points(String[] games) {
        int sum = 0;

        for (String s : games) {
          char x = s.charAt(0),
               y = s.charAt(2);

          sum += x > y ? 3 : x == y ? 1 : 0;
        }

        return sum;
    }
}

    3 weeks ago
    Refactor

8 kyu
You only need one - Beginner
Java:

import java.util.Arrays;

public class Solution {

    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

}

    3 weeks ago
    Refactor

8 kyu
Fake Binary
Java:

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}

    3 weeks ago
    Refactor

8 kyu
Do I get a bonus?
Java:

public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    return "\u00A3" + (bonus ? 10 : 1) * salary;
  }
}

    3 weeks ago
    Refactor

8 kyu
Convert boolean values to strings 'Yes' or 'No'.
Java:

class YesOrNo
{
  public static String boolToWord(boolean b)
  {
    return b ? "Yes" : "No";
  }

}

    4 weeks ago
    Refactor

8 kyu
Number toString
Java:

public class ToString {
  public static final String a = Integer.toString(123);
}

    4 weeks ago
    Refactor

8 kyu
Is it even?
Java:

public class Number {

  public boolean isEven(double n) {
    return n % 2 == 0;
  }
}


*/



























    }
}
