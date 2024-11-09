package com.jh.iht.java.basics.dda;

public class DPackagingExample {

    // Simple method to demonstrate a Java program that could be packaged
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        DPackagingExample example = new DPackagingExample();
        System.out.println(example.greet("World"));
    }
    /*#### **Packaging Instructions**

            1. **Compile the Java files**:
            - Open a terminal/command prompt and navigate to the directory containing the Java file(s).
            - Compile the files using the following command:
            ```bash
    javac PackagingExample.java
     ```

             2. **Create a manifest file** (`manifest.txt`):
    Create a file named `manifest.txt` with the following content:
            ```
    Main-Class: PackagingExample
   ```

           3. **Package the class files into a JAR file**:
            - In the terminal, run the following command:
            ```bash
    jar cfm PackagingExample.jar manifest.txt PackagingExample.class
     ```

             4. **Running the JAR file**:
            - After creating the JAR, you can run it with:
            ```bash
    java -jar PackagingExample.jar
     ```

             #### **JUnit Test Case (PackagingExampleTest.java)**

    JUnit tests are not applicable for packaging because JUnit tests focus on code functionality. However, you can verify that the application works by testing the class methods as shown earlier.
*/
}