package findWithin;

public class FindArray {

    public static int findArray(int[] array, int[] subArray) {
        int startIndex = -1;
        boolean firstElementFound = false;
        int subArrayIndex = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == subArray[subArrayIndex]) {
                if (!firstElementFound) {
                    firstElementFound = true;
                    startIndex = i;
                }
                if (subArray.length - 1 == subArrayIndex) {
                    break;
                }
                subArrayIndex++;
                continue;
            } else {
                firstElementFound = false;
                startIndex = -1;
                subArrayIndex = 0;
            }
            if (subArray.length - 1 == subArrayIndex) {
                break;
            }
        }
        return startIndex;
    }
}
