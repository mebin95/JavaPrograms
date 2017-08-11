

public class Basic {

    public static void main(String[] args) {

        System.out.println("1. Hello World!");

        String hello = "2. Hello World!";

        System.out.println(hello);

        printString("3. Hello World!");

        System.out.println(returnHello());

        System.out.println(addTwoNumbers(1,5));

        System.out.println(addTwoNumbersVer2(1,5, false));

        System.out.println(addTwoNumbersVer3(4, 4, true));

        iteration();

        iterationVer2();

        iterationArray();

        iterationArray2();

    }

    static void printString(String output) {
        System.out.println(output);
    }

    static String returnHello() {
        return "4. Hello World!";
    }

    static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    static int addTwoNumbersVer2(int a, int b, boolean operation) {

        if(operation) {
            return a + b;
        } else {
            return a * b;
        }

    }

    static int addTwoNumbersVer3(int a, int b, boolean operation) {
        if(a == 0) {
            return b;
        } else if(b == 0) {
            return a;
        } else if(operation){
            return a + b;
        } else {
            return a * b;
        }
    }

    static void iteration()  {
        for (int i=0; i<10; i++) {
            System.out.println("Iterations: " + addTwoNumbersVer3(i, 5, true));
        }
    }

    static void iterationVer2()  {
        int[] testArray = {0,2,4,6,8,10,12,14,16,18};
        for (int i=0; i<10; i++) {
            System.out.println("Array: " + addTwoNumbersVer3(testArray[i], 5, false));
        }
    }

    static void iterationArray() {
        int[] testArray = {0,2,4,6,8,10,12,14,16,18};
        for (int i = 0; i < testArray.length; i++) {
            System.out.println("Array Iteration: " + testArray[i]);
        }
    }

    static void iterationArray2() {
        int[] testArray = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println(testArray[i] = i);
        }

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = testArray[i] * 10;
            System.out.println("Array Iteration 2: " + testArray[i]);
        }

    }





}
