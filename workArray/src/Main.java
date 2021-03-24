public class Main {

    public static void main(String[] args) {
        HelloWorld.main(args);

        int[] someArray = new int[10];
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = (int) (Math.random() * 1000);
        }

        System.out.print("Array: ");
        for (int element : someArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        WorkArrays myArray = new WorkArrays(someArray);
        System.out.println("Sum of elements: " + myArray.sum);
        System.out.println("Min: " + myArray.min);
        System.out.println("Max: " + myArray.max);
    }
}