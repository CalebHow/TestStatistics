package com.pluralsight;
import java.util.Arrays;


public class Statistics {
    public static void main(String[] args) {
    int total = 0;
    int [] Scores = {3859, 1677, 2123, 2635, 4467, 3981, 1714, 3656, 2232, 4792};
    Arrays.sort(Scores);

    System.out.println(Arrays.toString(Scores));
        for (int score : Scores) {

            System.out.println(score + " ");
            total += score;
        }
        System.out.println(total);
                int average = total / Scores.length;
                System.out.println("the average of these scores is: " + average);
                int highScore = Scores[Scores.length - 1];
                System.out.println("The highest score is: " + highScore);
                int lowestScore = Scores[0];
                System.out.println("The lowest score is: " + lowestScore);
                }


                }
