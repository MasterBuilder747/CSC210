package Week15;

public class Review {

    Object o = new Object();

    /*
    -cumulative
    -writing code is usually pseudo code unless stated
    -what does this code do?
    -do you understand the statements? Are you organized in your thought process?
    -constructor: 1) allocates heap space 2) initializes the object (variables that are in the heap)
        -memory left uninitialized is a security risk, know default values (boolean = false, reference = null, all other = 0))
    -byte, short, int, long, float, double, boolean, char, reference(object/array)
    -while and do/while must have its counter variable initialize before starting
    -use an if statement to fix a do while loop
    -no graphics, javaFX
    -heap (new) vs stack (primitive)
    -2d arrays are arrays of array data types
    -array indexes are 0 to length-1
    -cache, RAM, ROM
    -GC: when a reference is changed, the GC takes the other references from the other objects out
    -JVM vs the compiler:
        -compiler: syntax, code generation, "compile time", grammar teacher, converts code into bytecode
        -JVM: Code interpretation, code execution, "run time", allows for portability
    -public: accessible in all classes, packages
    -private: only inside the class
    -blank: accessed anywhere inside the package, must import the class if outside the package
    -static: variable/function can be called without calling the class
    -dot operator!
    -exceptions occur in the runtime

     */

    /*

    w1: hello world
    w2: scanner, double division
    w3: primitive types, algebra (+, -, /, *, %, -=, +=), rounding
    w4: exception handling (try/catch/finally), logic operators (<, >, =, ||, |, &, &&), random number class/math.random()
    w5: switch, while, for, do/while, ++x, loops have a scope (variables must be declared inside)
    w6: making a game(craps), functions, recursion (calling the function inside itself)
    w7: arrays, fibonacci class
    w8: exception types, throws, throw new, ternary operator(loop)String state = i == 5?"i = 5":"i = 0";, review for midterm
    w9: 2d arrays, populating arrays in loops, memory
    w10: GC, Classes vs arrays, getters, setters, toString(), private/public/protected(not on final), constructors
    w11: blackjack game dev, static/non-static, this.
    w12: other class usage
    w14: graphics (not on final)

    */

    static int x = 5; //availability depends on access modifier again

    public static void main(String[] args) {

        //ragged arrays
        int[][] a = new int[2][0];
        a[0] = new int[2];
        a[1] = new int[3];

        for (int i = 0; i < a.length; i ++) {
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = j;
            }
        }


    }

}
