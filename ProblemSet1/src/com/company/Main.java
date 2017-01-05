//Intent => Solve ProblemSet1 for Udacity:Intro to Java, Lesson1
//
//Write Java code to create a String variable called firstName, define it to be your first name
//as a String. Then define a variable called lastName and define it to be your last name as a
//String. Then define a variable called fullName and set it to be your first name followed by
//a space followed by your last name. Use the existing variables for your first and last name
//and String concatenation to define fullName. Finally, write code to print this text:
////Hello, my name is [full name].
////There are [number] letters in my name.
//Use String concatenation to create the first String to print using the fullName variable, and
//use the .length() command on firstName and lastName to calculate the number of letters
//

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here:[NS] => Lets play with Strings
        String firstName = "Neeraj";
        String lastName = "Sehgal";
        String fullName = firstName+" "+lastName;

        System.out.println("Hello, my name is "+fullName);
        System.out.println("There are "+fullName.length()+" letters in my name.");
    }
}
