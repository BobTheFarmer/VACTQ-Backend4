package com.nighthawk.spring_portfolio.mvc.jokes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data  // Annotations to simplify writing code (ie constructors, setters)
@NoArgsConstructor
@AllArgsConstructor
@Entity // Annotation to simplify creating an entity, which is a lightweight persistence domain object. Typically, an entity represents a table in a relational database, and each entity instance corresponds to a row in that table.
public class Jokes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique=true)
    private String joke;



    // starting jokes
    public static String[] init() {
        final String[] jokesArray = {
            "public class HelloWorld {",
            "public static void main(String[] args) {",
            "System.out.println(\"Hello, World!\");",
            "int num1 = 10, num2 = 20, sum;",
            "sum = num1 + num2;",
            "System.out.println(\"Sum of these numbers: \" + sum);",
            "double num = -10.5;",
            "double result;",
            "result = Math.abs(num);",
            "System.out.println(\"The absolute value of \" + num + \" is: \" + result);",
            "int[] numbers = new int[10];",
            "for (int i = 0; i < numbers.length; i++) {",
            "numbers[i] = i + 1;",
            "System.out.println(numbers[i]);",
            "String str1 = \"Java\", str2 = \"Programming\";",
            "String str3 = str1.concat(str2);",
            "System.out.println(\"Resultant String: \" + str3);",
            "public class HelloWorld {",
            "public static void main(String[] args) {",
            "System.out.println(\"Hello, World!\");",
            "int num1 = 10, num2 = 20, sum;",
            "sum = num1 + num2;",
            "System.out.println(\"Sum of these numbers: \" + sum);",
            "int[] arr = new int[10];",
            "for(int i = 0; i < arr.length; i++) {",
            "arr[i] = i * 2;",
            "System.out.println(arr[i]);",
            "}",
            "String str = \"Hello World\";",
            "str = str.toUpperCase();",
            "System.out.println(str);",
            "try {",
            "File file = new File(\"file.txt\");",
            "Scanner scanner = new Scanner(file);",
            "} catch (FileNotFoundException e) {",
            "e.printStackTrace();",
            "public class HelloWorld {",
            "public static void main(String[] args) {",
            "System.out.println(\"Hello, World!\");",
            "int num1 = 10;",
            "double num2 = 15.5;",
            "char myChar = 'a';",
            "boolean myBoolean = true;",
            "String myString = \"Hello\";",
            "int[] myArray = new int[10];",
            "myArray[0] = 5;",
            "for (int i = 0; i < 10; i++) {",
            "System.out.println(i);",
            "if (num1 > num2) {",
            "System.out.println(\"num1 is larger\");",
            "} else {",
            "System.out.println(\"num2 is larger\");",
            "ArrayList<String> myList = new ArrayList<String>();",
            "myList.add(\"Hello\");",
            "myList.add(\"World\");",
            "for (String str : myList) {",
            "System.out.println(str);",
            "try {",
            "int result = num1 / 0;",
            "} catch (ArithmeticException e) {",
            "e.printStackTrace();",
            "} finally {",
            "System.out.println(\"Done\");",
            "public void myMethod() {",
            "System.out.println(\"My Method\");",
            "return;"
        };
        return jokesArray;
    }
}