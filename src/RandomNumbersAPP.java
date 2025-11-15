/*
RandomNumbersAPP.java
Application class to test RandomNumbers
*/

public class RandomNumbersAPP {
    public static void main(String[] args) {
        // obj
        RandomNumbers rn = new RandomNumbers();

        //process
        rn.generateNumbers();
        rn.computeSumAndMean();

        //output
        rn.printArray();
        System.out.println();
        System.out.println("Total sum of all generated numbers: "+rn.getSum());
        System.out.println("Average (mean) of generated numbers: " + rn.getMean());
    }
}
