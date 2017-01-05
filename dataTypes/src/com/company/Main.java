//Intent => Print min-max values of various Java datatypes

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here:[NS] => lets find ranges for Java data types
        // 1. Integer
        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;

        // Print Integer range
        System.out.println("Integer Range: "+ minIntValue + " => " + maxIntValue);

        // 2. Long
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        System.out.println("Long Range: "+ minLongValue + " => " + maxLongValue);

        // 3. Double
        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;

        System.out.println("Double Range: "+ minDoubleValue + " => " + maxDoubleValue);
    }
}
