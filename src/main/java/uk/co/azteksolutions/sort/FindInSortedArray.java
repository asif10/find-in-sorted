package uk.co.azteksolutions.sort;

/**
 * @author Asif Akhtar
 * 08/05/2020 00:27
 */
public class FindInSortedArray {
    public int findPosition(int[] array, int find) {
        int algo = 0;
        int position = -1;
        for (int x = 0; x < array.length; x++) {
            algo++;
            if (array[x] == find) {
                position = x;
                break;
            }
        }
        System.out.println("algo: " + algo);
        return position;
    }

    public int findPositionUsingMidRange(int[] array, int find) {
        int algo = 0;
        int position = -1;
        int midPosition = array[array.length / 2];

        if (find > midPosition) {
            for (int x = midPosition; x < array.length; x++) {
                algo++;
                if (array[x] == find) {
                    position = x;
                    break;
                }
            }
        } else {
            for (int x = 0; x < midPosition; x++) {
                algo++;
                if (array[x] == find) {
                    position = x;
                    break;
                }
            }
        }
        System.out.println("algo: " + algo);
        return position;
    }
}
