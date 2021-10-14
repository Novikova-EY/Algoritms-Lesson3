package findLost;

public class findLostPositionInArray {
    public static void main(String[] args) {

        final int size = 16;
        int[] myArray = new int[size];
        int randomPosition = 5;
        makeDequeWithLostPosition(myArray, size, randomPosition);
        System.out.println("Lost position = " + findInDequeLostPosition(myArray));

    }

    private static int[] makeDequeWithLostPosition(int myArray[], int size, int randomPosition) {
        if (size != 0) {
            for (int i = 0; i < randomPosition - 1; i++) {
                myArray[i] = i + 1;
            }
            for (int i = randomPosition - 1; i < size; i++) {
                myArray[i] = i + 2;
            }
        } else {
            myArray = null;
        }
        return myArray;
    }

    public static int findInDequeLostPosition(int myArray[]) {
        int totalCount = myArray.length + 1;
        int expectedSum = totalCount * (totalCount + 1) / 2;
        int actualSum = 0;
        for (int i : myArray) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
}
