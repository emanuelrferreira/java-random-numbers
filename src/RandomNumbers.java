/*
RandomNumbers.java
Mini program to generate random integers, sum them and calculate the mean
*/

import java.util.Random;

public class RandomNumbers {
    
    // vars

    private int[] numbers;
    private int sum;
    private double mean;

    // constructor
    public RandomNumbers(){
        // create an array with 10 positions as an example
        numbers= new int[10];
        sum=0;
        mean=0.0;
    }

    // fill the array with random values between 1 and 100
    public void generateNumbers(){
        Random rand = new Random();
        for(int i=0; i<numbers.length; i++){
            numbers[i]=rand.nextInt(100)+1; // 1 to 100
        }
    }

    // method to compute sum and mean
    public void computeSumAndMean(){
        sum=0;

        //loop through the array to compute the total sum
        for(int i=0; i<numbers.length; i++){
            sum+=numbers[i];
        }

        mean=(double) sum/numbers.length;
    }

    //getters

    public int getSum(){
        return sum;
    }

    public double getMean(){
        return mean;
    }

    public int[] getNumbers(){
        return numbers;
    }

    // uti method to print the array
    public void printArray(){
        System.out.print("Random numbers generated: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
