package algo.insertionSort;

public class App {
    public static void main(String[] args) {

        int[] newArray = insertionSort(new int[]{9,8,99,21,34,5,3,19});
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");

        }
    }

// variable element contains the data we wish to bring from the unsorted to the sorted subarray
        public static int [] insertionSort(int[] a){
            for (int i = 1; i < a.length; i++) {
                int element = a[i];
                int j = i - 1;
                while (j >= 0 && a[j] > element) {
                    a[j + 1] = a[j];
//                    a[j] = element;
                    j--;
                }

                a[j+1] = element;
// whether you write the code this way or as written in line 20 the output is the same
            }

            return a;
        }
    }

