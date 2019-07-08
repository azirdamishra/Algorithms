package algo.quickSort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int [] inputArray = {12, 81, 74,43, 1098, 0, 8, 92, 17, 753, 912, 0, 6, 4};
        quickSort(inputArray, 0 , inputArray.length-1);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void quickSort(int [] inputArray, int start, int end){
        if(start< end){
            int q = Partition(inputArray,start, end);
            quickSort(inputArray, start, q - 1);
            quickSort(inputArray, q +1, end);
        }
    }

    public static int Partition(int [] inputArray, int start, int end){
//        end = inputArray.length - 1;
        int pivot = inputArray[end];
        int i = start - 1;
        for(int j = start; j < end; j++){
            if(inputArray[j] <= pivot){
                i++;
                int temp  = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }
        int temo = inputArray[i + 1];
        inputArray[i+1] = inputArray[end];
        inputArray[end] = temo;
        return i+1;
    }

}
