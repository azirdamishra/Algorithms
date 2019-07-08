package algo.selectionSort;

public class App {
    public static void main(String[] args) {

        int [] newArray = selectionSort(new int[] { 8, 3, 27, 19, 2, 16});
        for(int i = 0 ; i < newArray.length  ; i++){
            System.out.print(newArray[i] + " ");
        }
    }

    public static int [] selectionSort(int [] a){
        for(int i = 0; i< a.length ; i++){
            int min = i ;
            int j;
            for( j = i + 1; j < a.length; j++){
                if (a[min] > a[j]){
                    min = j;
                }
            }
            int n = a[i];
            a[i] = a[min];
            a[min] = n;

        }
        return a;
    }
}
