package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        kyu
        N-Dimensional Vector Magnitude
        Java:

import java.util.Arrays;

        public class Kata {
            public static double magnitude(double[] vector) {
                return Math.sqrt(Arrays.stream(vector).map(x -> x * x).sum());
            }
        }

       ///////////////////////////////////
        7 kyu
        Stanton measure
        Java:

import static java.util.Arrays.stream;

        public class Kata {

            public static int stantonMeasure(int[] arr) {
                final int n = stream(arr).filter(e->e==1).sum();
                return (int)stream(arr).filter(e->e==n).count();
            }

        }

        ////////////////////////////////////////

        7 kyu
        Unlucky Days
        Java:

import java.time.*;
import java.util.Arrays;

        public class Kata {
            public static long unluckyDays(int year) {
                return Arrays.stream(Month.values())
                        .map(month -> LocalDate.of(year, month, 13))
                        .map(LocalDate::getDayOfWeek)
                        .filter(DayOfWeek.FRIDAY::equals)
                        .count();
            }
        }

       ////////////////////////////////////////

        7 kyu
        Shortest Word
        Java:

import java.util.stream.*;
        public class Kata {
            public static int findShort(String s) {
                return Stream.of(s.split(" "))
                        .mapToInt(String::length)
                        .min()
                        .getAsInt();
            }
        }

        //////////////////////////////////////////////

        8 kyu
        Beginner Series #2 Clock
        Java:

        public class Clock
        {
            public static int Past(int h, int m, int s)
            {
                return h * 3600000 + m * 60000 + s * 1000;
            }
        }

        //////////////////////////////////////////////

        8 kyu
        A wolf in sheep's clothing
        Java:

import java.util.*;

        public class ZywOo {

            public static String warnTheSheep(String[] array) {
                Collections.reverse(Arrays.asList(array));
                int pos = Arrays.asList(array).indexOf("wolf");
                return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
            }

        }

       ////////////////////////////////////////////

        8 kyu
        N-th Power
        Java:

        public class Kata {
            public static int nthPower(int[] array, int n) {
                if (n < 0 || n >= array.length) return -1;
                return (int) Math.pow(array[n], n);
            }
        }

        /////////////////////////////////////////

        8 kyu
        Twice as old
        Java:

import static java.lang.Math.abs;

        public class TwiceAsOld {

            public static int TwiceAsOld(int d, int s) {
                return abs(d-s-s);
            }

        }

        ///////////////////////////////

        8 kyu
        Basic subclasses - Adam and Eve
        Java:

        public class God {
            public static Human[] create(){
                return new Human[]{new Man(), new Woman()};
            }
        }
        class Human{
        }
        class Man extends Human{
        }
        class Woman extends Human{
        }

      ///////////////////////////////////

        8 kyu
        Swap Values
        Java:

        class Swapper{

            public Object[] arguments;

            public Swapper(final Object[] args){
                arguments=args;
            }

            public void swapValues() {
                Object temp = arguments[0];
                arguments[0] = arguments[1];
                arguments[1] = temp;
            }
        }

       /////////////////////////////////////////

        8 kyu
        Cat years, Dog years
        Java:

        public class Dinglemouse {
            public static int[] humanYearsCatYearsDogYears(final int y) {
                return new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};
            }
        }

        ///////////////////////////////////

        8 kyu
        Holiday VIII - Duty Free
        Java:

        public class Kata {

            public static int dutyFree(int normPrice, int discount, int hol) {

                return hol*100/(normPrice*discount);

            }

        }

      ///////////////////////////////////////////

        8 kyu
        To square(root) or not to square(root)
        Java:

        public class Kata
        {
            public static int[] squareOrSquareRoot(int[] array)
            {
                for(int i = 0; i < array.length; i++) {
                    if (Math.sqrt(array[i]) % 1 == 0) array[i] = (int) Math.sqrt(array[i]);
                    else array[i] = array[i] * array[i];
                }
                return array;
            }
        }

       /////////////////////////////////////////////////

        8 kyu
        101 Dalmatians - squash the bugs, not the dogs!
                Java:

        class ZywOo {
            static String howManyDalmatians(int number) {
                return number <= 10 ? "Hardly any" :
                        number <= 50 ? "More than a handful!" :
                                number == 101 ? "101 DALMATIANS!!!" : "Woah that's a lot of dogs!";
            }
        }

      ////////////////////////////////////////////

        8 kyu
        get character from ASCII Value
        Java:

        public class Ascii {
            public static char getChar(int c) {
                return (char)c;
            }
        }

      /////////////////////////////////////////

        8 kyu
                Plural
        Java:

        public class Plural{
            public static boolean isPlural(float f){
                return (f != 1 );
            }
        }

       /////////////////////////////////////////

        8 kyu
        Thinkful - Logic Drills: Traffic light
        Java:

        public class TrafficLights {

            public static String updateLight(String current) {
                switch (current) {
                    case "red": return "green";
                    case "yellow": return "red";
                    case "green": return "yellow";
                    default: throw new IllegalArgumentException();
                }
            }

        }

      ////////////////////////////////////////////////////////

        8 kyu
        No zeros for heros
        Java:

        public class NoBoring {
            public static int noBoringZeros(int n) {
                if (n == 0)
                    return n;

                while (n % 10 == 0)
                    n /= 10;

                return n;
            }
        }

       ////////////////////////////////////////////////////

        7 kyu
        Simple string matching
        JavaScript:

        function solve(a,b){
            a = a.replace("*", "\\S*");
            var re = new RegExp(a);
            return b.match(re) == b ? true : false
        }

        //////////////////////////////////////////////////////

        7 kyu
        Stones on the Table
        JavaScript:

        function solve(stones) {
        return stones.split('').reduce((totalRemove, stone, i) => {
            return i >= 1 && (stones[i - 1] === stone) ? ++totalRemove : totalRemove
        }, 0)
}

      ///////////////////////////////////////////////////////////

        8 kyu
        Can we divide it?
        JavaScript:

        let isDivideBy = (number, a, b) => {
            if (number % a === 0 && number % b === 0) {
                return true
            } else {
                return false
            }
        }

      //////////////////////////////////////////////////////////

        8 kyu
        Is he gonna survive?
        JavaScript:

        hero = (bullets, dragons) =>{
            if (bullets/2 >= dragons) {
                return true;
            }
            else {
                return false;
            }
        }

      //////////////////////////////////////////////

        8 kyu
        Generate range of integers
        JavaScript:

        function generateRange(min, max, step){
            let arr = [];
            for (let i=min; i<=max; i += step) {
                arr.push(i);
            }
            return arr;
        }

        ////////////////////////////////////////

        8 kyu
        Returning Strings
        Python:

        def greet(name):
        return "Hello, " + name + " how are you doing today?"

       //////////////////////////////////////////////////

        8 kyu
        Grasshopper - Summation
        Java:

        public class GrassHopper {

            public static int summation(int n) {

                return  n*(n+1)/2;
            }
        }

       /////////////////////////////////////////////////

        7 kyu
        Simple consecutive pairs
        Java:

import java.util.*;
        class Solution{
            public static int solve(int [] arr){
                int count = 0;
                for(int i=0; i<arr.length-1; i+=2){
                    if(Math.abs(arr[i]-arr[i+1])==1){
                        count++;
                    }
                }
                return count;
            }
        }

      //////////////////////////////////////////////////////

        8 kyu
        DNA to RNA Conversion
        Java:

        public class Bio {
            public String dnaToRna(String dna) {

                String rna = "";

                // For every letter in String called DNA
                for(int i = 0; i < dna.length(); i++) {

                    // get the letter at index i
                    char letter = dna.charAt(i);

                    // if letter != T,
                    //    add letter to rna
                    // else
                    //   add U
                    if(letter != 'T') {
                        rna += letter;
                    } else {
                        rna += 'U';
                    }

                }


                return rna;  // Do your magic!
            }
        }

       //////////////////////////////////////////////////////

        public class Bio {
            public String dnaToRna(String dna) {

                String rna = "";

                // For every letter in String called DNA
                for(int i = 0; i < dna.length(); i++) {

                    // get the letter at index i
                    char letter = dna.charAt(i);

                    // if letter != T,
                    //    add letter to rna
                    // else
                    //   add U
                    if(letter != 'T') {
                        rna += letter;
                    } else {
                        rna += 'U';
                    }

                }


                return rna;  // Do your magic!
            }
        }

      ///////////////////////////////////////

        7 kyu
        Complementary DNA
        Java:

        public class DnaStrand {
            public static String makeComplement(String dna) {

                if (dna == null || dna.isEmpty()) {
                    return dna;

                } else {
                    char[] chars = dna.toCharArray();
                    for (int i = 0; i < chars.length; ++i) {
                        char c = chars[i];
                        chars[i] = (c == 'A') ? 'T'
                                : (c == 'T') ? 'A'
                                : (c == 'C') ? 'G'
                                : (c == 'G') ? 'C'
                                : c;
                    }
                    return new String(chars);
                }
            }
        }

    ///////////////////////////////////////////

        8 kyu
        Convert a Number to a String!
                Java:

        class Kata {
            public static String numberToString(int num) {
                // Return a string of the number here!
                int div = 0;
                Boolean flag = false;

                if (num < 0) {
                    div = num * -1;
                    flag = true;
                }
                else {
                    div = num;
                }

                int rem = 0;
                StringBuilder st = new StringBuilder();

                while (div > 0) {
                    rem = div % 10;
                    div = div /10;
                    st.append(rem);
                    if (flag) { st.append("-"); }
                }

                return st.reverse().toString();
            }

        }






        ///////////////////////////
                Discuss

        7 kyu
        Extended weekends
        Java:


import static java.time.YearMonth.of;

        interface Solution {
            static String[] solve(int a, int b) {
                var search = new String[]{"", "", "0"};
                for (var date = of(a, 1); of(b + 1, 1).isAfter(date); date = date.plusMonths(1)) {
                    if (date.atDay(1).getDayOfWeek().getValue() == 5 && date.lengthOfMonth() > 30) {
                        search[search[0].isEmpty() ? 0 : 1] = date.getMonth().name();
                        search[2] = Integer.parseInt(search[2]) + 1 + "";
                    }
                }
                return search;
            }
        }




        2 months ago
        Refactor

import static java.time.YearMonth.of;

        interface Solution {
            static String[] solve(int a, int b) {
                var search = new String[]{"", "", "0"};
                for (var date = of(a, 1); of(b + 1, 1).isAfter(date); date = date.plusMonths(1)) {
                    if (date.atDay(1).getDayOfWeek().getValue() == 5 && date.lengthOfMonth() > 30) {
                        search[search[0].isEmpty() ? 0 : 1] = date.getMonth().name();
                        search[2] = Integer.parseInt(search[2]) + 1 + "";
                    }
                }
                return search;
            }
        }

       //////////////////////////////////////////////////////

        8 kyu
                Multiply
        Java:

        public class Multiply {
            public static Double multiply(Double a, Double b) {
                return a * b;
            }
        }
        */
    }
}
