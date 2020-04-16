package findWithin;

import static findWithin.FindArray.findArray;

public class Main {
    public static void main(String[] args) {
        int[] biggerArray = new int[]{14, 77, 1, 6, 7, 158, 678};
        int[] smallerArray = new int[]{1, 6, 7, 158};
        int foundIndex = findArray(biggerArray, smallerArray);
        System.out.println(foundIndex);
    }
}
