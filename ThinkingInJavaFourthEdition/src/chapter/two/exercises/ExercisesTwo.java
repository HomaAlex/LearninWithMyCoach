package chapter.two.exercises;

class Letter {
    char c;
}

public class ExercisesTwo {
    static void f(Letter y) {
        y.c = 'z';
    }
    public static void main(String[] args) {

// Exercise 1:   (1) Write a program that uses the “short” and normal form of print statement.
        System.out.print("Hello");
// Exercise 2:  (1) Create a class containing a float and use it to demonstrate aliasing.

        class Alias {

            float t;

            Alias(float t) {
                this.t = t;
            }
        }
        Alias alias = new Alias(3);
        Alias alias1 = new Alias(4);

        System.out.println("1: alias: " + alias.t + ", alias1: " + alias1.t);
        alias = alias1;
        System.out.println("2: alias: " + alias.t + ", alias1: " + alias1.t);
        alias.t = 9;
        System.out.println("3: alias: " + alias.t + ", alias1: " + alias1.t);

// Exercise 3:  (1) Create a class containing a float and use it to demonstrate aliasing during method calls.

        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);

// Exercise 4:  (2) Write a program that calculates velocity using a constant distance and a constant time.

        class Velocity {
            Velocity() {
                System.out.println(4/4);
            }
        }

        Velocity velocity = new Velocity();

// Exercise 5:  (2) Create a class called Dog containing two Strings: name and says. In main( ), create two dog objects
//      with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). Then display their names and what they
//      say.

// Exercise 6:  (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object. Test for comparison
//      using == and equals( ) for all references.

// Exercise 7:  (3) Write a program that simulates coin-flipping.

// Exercise 8:  (2) Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the
//      results.

// Exercise 9:  (1) Display the largest and smallest numbers for both float and double exponential notation.

// Exercise 10:    (3) Write a program with two constant values, one with alternating binary ones and zeroes, with a
//      zero in the least-significant digit, and the second, also alternating, with a one in the least-significant digit
//      (hint: It’s easiest to use hexadecimal constants for this). Take these two values and combine them in all
//      possible ways using the bitwise operators, and display the results using Integer.toBinaryString( ).

// Exercise 11:    (3) Start with a number that has a binary one in the most significant position (hint: Use a
//      hexadecimal constant). Using the signed right-shift operator, right shift it all the way through all of its
//      binary positions, each time displaying the result using Integer.toBinaryString( ).

// Exercise 12:    (3) Start with a number that is all binary ones. Left shift it, then use the unsigned right-shift
//      operator to right shift through all of its binary positions, each time displaying the result using
//      Integer.toBinaryString( ).

// Exercise 13:    (1) Write a method that displays char values in binary form. Demonstrate it using several different
//      characters.

// Exercise 14:    (3) Write a method that takes two String arguments and uses all the boolean comparisons to compare
//      the two Strings and print the results. For the == and !=, also perform the equals( ) test. In main( ), call
//      your method with some different String objects.


    }
}