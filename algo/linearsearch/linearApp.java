package algo.linearsearch;

public class linearApp {
    public static void main(String[] args) {
        // write your code here
    }

    public static int linearSearch(int[] a, int x){
        for(int i = 0; i< a.length; i++){
            if(a[i] == x){
                return i;
            }
        }
        return -1;
    }
}
