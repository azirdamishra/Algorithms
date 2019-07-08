package algo.mergeSort;

public class MergeSort {

    public static void sort(int inputArray[]) {
        sort(inputArray, 0, inputArray.length - 1);
    }

    public static void sort(int inputArray[], int start, int end) {
        if (end <= start) {
            return;// we're done traversing the array
        }

        int mid = (start + end) / 2;
        sort(inputArray, start, mid);
        sort(inputArray, mid + 1, end);
        merge(inputArray, start, mid, end);
    }

    public static void merge(int inputArray[], int start, int mid, int end) {
        // start and end are the beginning and ending indices of the given array
        int[] tempArray = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (inputArray[i] < inputArray[j]) {
                tempArray[k] = inputArray[i];
                i++;
                k++;
            } else {
                tempArray[k] = inputArray[j];
                j++;
                k++;
            }
        }
        // When it gets to here, it means that the above loop has completed
        //so both the left and right side of the subarray can be considered sorted

        if (i <= mid) {
            while (i <= mid) { //consider right side done being sorted completely and put
                // into the temporary array. Left side must already be sorted and
                //is being put into the temp array here
                tempArray[k] = inputArray[i];
                i++;
                k++;
            }
        } else if (j <= end) {
            //consider left side done being sorted completely and put
            // into the temporary array. right side must already be sorted and
            //is being put into the temp array here
            while (j <= end) {
                tempArray[k] = inputArray[j];
                j++;
                k++;
            }
        }

        //copy over the temp array into the empty slots of the input
        for(int p = 0; p< tempArray.length; p++){
            inputArray[start + p] = tempArray[p];

        }
//        System.out.println(tempArray.length);
//        System.out.println(inputArray.length);
    }
}
