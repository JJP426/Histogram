// CSCI 1933 Lab 03
import java.util.Scanner;
    private int lowerbound;
    private int upperbound;
    private int[] hist;

    public Histogram(int lowerbound, int upperbound) {
        // Make sure lowerbound isn't greater than upper bound
        if(lowerbound > upperbound){
            int tempValue = lowerbound; //Keep it in a temporary location until swapping

        }
        lowerbound = lowerbound;
        upperbound = upperbound;
        hist = new int[(upperbound - lowerbound)+ 1];
    }

    public boolean add(int n) {
        // Check that n is within the upper and lower bounds
        if (n >= lowerbound && n <= upperbound){
        // Add n to the array
        hist[n - lowerbound]++;
        //Return true
            return true;
        }
        // If n is not within the bounds, return false!
        else {
            System.out.println(n + " is not in the range");
        }    }
    

public class HistogramApp {
    public static void main(String[] args) {
        // ------- Your code here -------
    }
}