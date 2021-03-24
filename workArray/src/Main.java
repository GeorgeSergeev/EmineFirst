public class Main { // main class

    public static void main(String[] args) {
        HelloWorld.main(args); // runs hello, world!

        int[] someArray = new int[10]; // list of 10 elements
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = (int) (Math.random() * 1000);
        }

        System.out.print("Array: "); // print array
        for (int element : someArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        WorkArrays myArray = new WorkArrays(someArray);
        System.out.println("Sum of elements: " + myArray.sum); // print sum of elements
        System.out.println("Min: " + myArray.min); // print min element
        System.out.println("Max: " + myArray.max); // print max element
    }
}