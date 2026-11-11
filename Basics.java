import java.util.Arrays;

class CodeRunner {
    public void run() {
        //runs all methods in the Basics class
                //varibale delcaration
        int num1 = 10;
        //System.out.println("The value of num1 is: " + num1);

        //const in java
        final double PI = 3.14;
        //System.out.println("The value of PI is: " + PI);

        /***** String in Java ******/
        String language = "Java";
        int size = language.length();
        boolean isEmpty = language.isEmpty();

        //split function
        String framework = "Spring Boot, React, Angular";
        String[] strArray = framework.split(","); //split function splits a string

        //join function
        String joinedString = String.join(" ", strArray); //join function joins an array
        //print function
        
        // equals() vs == operator
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("JS");
        String str4 = new String("JS");

        boolean result1 = false;
        boolean result2 = false;
        result1 = str1 == str2;
        result2 = str1.equals(str2);

        boolean result3 = false;
        boolean result4 = false;
        result3 = str3 == str4;
        result4 = str3.equals(str4);

        //contains
        str1.contains("J"); // returns true if the string contains the specified character or substring
        str1.replace("J", "j"); // replaces the specified character or substring with another character or substring
        str1.toUpperCase(); // converts the string to uppercase
        str1.toLowerCase(); // converts the string to lowercase 
        str1.charAt(1); // returns the character at the specified index
        
        //System.out.println(Arrays.toString(strArray)); // to print an array in a readable format
        System.out.println(result3);
        System.out.println(result4);
    }
}

public class Basics {
    public static void main(String[] args) {
        System.out.println("***** JAVA BASICS *****");

        //Instantiate the class
        CodeRunner codeRunner = new CodeRunner();
        codeRunner.run();
   
    }
}   

