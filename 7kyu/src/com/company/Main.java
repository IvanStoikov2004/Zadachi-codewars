package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here



/*
        7 kyu
        Complete The Pattern #2
        Java:

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

      ///////////////////////////////////////////////////////////
        7 kyu
        Thinking & Testing: A and B?
                Java:

        class ThinkingAndTesting {
            static int testAB(int a, int b) {
                return a | b;
            }
        }

      /////////////////////////////////////////////////////////////////
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

        ////////////////////////////////////////////////////////////////////

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
////////////////////////////////////////////////////////////////

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

       /////////////////////////////////////////////////////////////////////

        7 kyu
        Thinking & Testing : True or False
        Java:

        public class ThinkingAndTesting {

            public static int testTrueFalse(int n) {
                return Integer.bitCount(n);
            }
        }

      /////////////////////////////////////////////////////

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

       /////////////////////////////////////////////////////////////////////

        7 kyu
        Waiting room
        Java:

        public class Kata {
            public static int lastChair(int n) {
                return n - 1;
            }
        }



*/


















    }
}
