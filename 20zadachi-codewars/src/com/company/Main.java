package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here









/*
        public class CompleteThePattern {
            public static String pattern ( int n) {
                if (n < 1) {
                    return "";
                }

                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= n; i++) {
                    for (int j = n; j >= i; j--) {
                        sb.append(j);
                    }
                    if (i < n)
                        sb.append('\n');
                }
                return sb.toString();
            }
        }
////////////////////////////////////////

        7 kyu
        Thinking & Testing: A and B?
                Java:

        class ThinkingAndTesting {
            static int testAB(int a, int b) {
                return a | b;
            }
        }

       ////////////////////////////////////

        7 kyu
                Covfefe
        Java:

        class Covfefe {
            static String covfefe(final String tweet) {
                return tweet.contains("coverage") ?
                        tweet.replace("coverage", "covfefe") :
                        tweet + " covfefe";
            }
        }

      ////////////////////////////////////////////////////

        7 kyu
        Determine if the poker hand is flush
        Java:

import java.util.Arrays;

        public class Kata{
            public static boolean CheckIfFlush(String[] cards){
                final char target = cards[0].charAt(cards[0].length()-1);
                return Arrays.stream(cards)
                        .allMatch( s -> s.charAt(s.length()-1) == target );
            }
        }

      ////////////////////////////////////////////////////////

        7 kyu
        Simple Fun #63: Shape Area
        Java:

        public class Kata {
            public static int shapeArea(int n) {

                int fieldsOnLongDiagonals = n*n;
                int fieldsOnShortDiagonals = (n-1) * (n-1);
                return fieldsOnLongDiagonals + fieldsOnShortDiagonals;

            }
        }

     /////////////////////////////////////////////////////

        7 kyu
        Thinking & Testing : True or False
        Java:

        public class ThinkingAndTesting {

            public static int testTrueFalse(int n) {
                return Integer.bitCount(n);
            }
        }

       ///////////////////////////////////////////////////////////////////////////////

        7 kyu
        Simple Fun #41: Elections Winners
        Java:

        class ElectionWinners {
            static int find(final int[] votes, final int k) {
                int winners = 0;

                for(int i = 0; i < votes.length; i++) {
                    int max = votes[i] + k;
                    boolean isMax = true;
                    for(int j = 0; j < votes.length; j++)
                        if(max <= votes[j] && j != i) {
                            isMax = false;
                            break;
                        }
                    if(isMax)
                        winners++;
                }

                return winners;
            }
        }

     ///////////////////////////////////////////

        7 kyu
        Waiting room
        Java:

        public class Kata {
            public static int lastChair(int n) {
                return n - 1;
            }
        }

       ///////////////////////////////////////////////

        7 kyu
        You Can't Code Under Pressure #2
        Java:

        public class Counter {
            private int num = 0;

            public void increment() {
                num++;
            }

            public int check() {
                return num;
            }
        }

       //////////////////////////////////////////////////////

        7 kyu
        Laxative Shot Roulette
        Java:

        public class Kata {

            public static double getChance(int n, int x, int a) {

                double prob = 1;
                for(int i = 0; i < a; i++){
                    prob *= (double)(n-x-i) / (n-i);
                }

                return Math.round(prob*100.0)/100.0;
            }
        }

     ////////////////////////////////////////////////////////////////
        7 kyu
        Guess the Sequence
        Java:

import java.util.stream.IntStream;

        class JomoPipi {
            static int[] sequence(int x) {
                return IntStream.rangeClosed(1, x).mapToObj(Integer::toString).sorted().mapToInt(Integer::parseInt).toArray();
            }
        }

     ///////////////////////////////////////////////////////////////////////

        7 kyu
        Drying Potatoes
        Java:

        class Potatoes {

            public static int potatoes(int p0, int w0, int p1) {
                return w0 * (100 - p0) / (100 - p1);
            }
        }

        ///////////////////////////////////////////////////////

        7 kyu
        Green Glass Door
        Java:


        public class GreenGlassDoor {

            boolean stepThroughWith(String s) {
                return s.matches(".*(\\w)\\1.*");
            }

        }

        ////////////////////////////////////////////////////////

        7 kyu
        MOD 256 without the MOD operator
        Java:

        public class Kata
        {
            public static int mod256WithoutMod(int number) {
                return number - ((int) number / 256) * 256;
            }
        }

     //////////////////////////////////////////////////////////////////

        public class Kata
        {
            public static int mod256WithoutMod(int number) {
                return number - ((int) number / 256) * 256;
            }
        }

      /////////////////////////////////////////////////////////////////////////////

        7 kyu
        Suitcase packing
        Java:

        public class MrSquare {
            public static boolean fit_in(int a, int b, int m, int n) {
                return (a + b) <= Math.max(m, n)
                        && Math.max(a, b) <= Math.min(n, m);
            }
        }

       /////////////////////////////////////////////////////////////////////

        7 kyu
        Number of Rectangles in a Grid
        Java:


        public class Solution {

            public static int numberOfRectangles(int m, int n) {
                return n*m*(n+1)*(m+1)/4;
            }

        }

       ////////////////////////////////////////////////////////////////

        7 kyu
                Friends
        Java:

        public class Friends {
            public static int friends(int n) {
                int friend = 0;
                int max = 2;
                while (n > max) {
                    friend++;
                    max *= 2;
                }
                return friend;
            }
        }

      ///////////////////////////////////////////////////////////////////////
        7 kyu
        Nth power rules them all!
                Java:

import java.util.Arrays;

        public class Kata {
            public static int modifiedSum(int[] array, int power) {
                return Arrays.stream(array).map(x -> (int)Math.pow(x, power) - x).sum();
            }
        }

        ////////////////////////////////////////////////////////

        7 kyu
        Simple Fun #37: House Numbers Sum
        Java:

import static java.util.stream.IntStream.of;

        class Kata {
            static int houseNumbersSum(int[] arr) {
                return of(arr).takeWhile(i -> i > 0).sum();
            }
        }


        */
    }
}
