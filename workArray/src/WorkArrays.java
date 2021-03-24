public class WorkArrays {

    int[] myArray; // list of some integers
    int sum; // sum of elements myArray
    int min; // min element in myArray
    int max; // max element in myArray

    public WorkArrays(int[] array) { // constructor
        this.myArray = array;
        this.sum = sumArray();
        this.max = maxElem();
        this.min = minElem();
    }

    public int sumArray() { // returns sum of elements
        int sum = 0;
        for (int element : myArray) {
            sum = sum + element;
        }
        return sum;
    }

    public int minElem() { // returns min element
        min = myArray[0];
        for (int element : myArray) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public int maxElem() { // returns max element
        max = myArray[0];
        for (int element : myArray) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }


}