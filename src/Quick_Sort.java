public class Quick_Sort {
    public static void quickSort(int[] sortArr, int low, int high) {

        if (sortArr.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }
}
