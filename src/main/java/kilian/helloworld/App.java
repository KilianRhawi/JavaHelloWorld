package kilian.helloworld;

/**
 * Hello world!
 *
 */
public class App {

    // =========================================================

    // example 4: parsing strings to integers, string format and exception handling

    public static void main(String[] args) {

        // make sure there are exactly two input args
        if (args.length != 2) { 
            System.out.println("Input needs to be exactly 2 integers!");
            System.exit(-1);
        }

        int a;
        int b;

        // convert args to integers
        try {

            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

        } catch (Exception ex) {

            System.out.println("Wrong number format! Please put two valid integers!");
            return;
        }

        // add the integers and print it to console
        System.out.println(String.format("%d + %d = %d", a, b, (a + b)));
    }

    // =========================================================

    // example 3: arrays and for loop

    // public static void main(String[] args) {

    //     printArgs(args);
    // }

    // private static void printArgs(String[] args) {

    //     System.out.println("args length: " + args.length);

    //     for (int i = 0; i < args.length; i++)
    //     {
    //         System.out.println("arg" + i + ": " + args[i]);
    //     }
    // }

    // =========================================================

    // example 2: subfunction

    // public static void main(String[] args) {

    //     parseArgs(args);
    // }

    // private static void parseArgs(String[] args) {

    //     System.out.println("Hello World!");
    //     System.out.println("args length: " + args.length);

    //     if (args.length >= 1) {
    //         System.out.println("first arg: " + args[0]);
    //     }

    //     if (args.length >= 2) {
    //         System.out.println("second arg: " + args[1]);
    //     }
    // }

    // =========================================================

    // example 1: main function and command-line args

    // public static void main(String[] args) {

    //     System.out.println("Hello World!");
    //     System.out.println("args length: " + args.length);

    //     if (args.length >= 1) {
    //         System.out.println("first arg: " + args[0]);
    //     }

    //     if (args.length >= 2) {
    //         System.out.println("second arg: " + args[1]);
    //     }
    // }
}
