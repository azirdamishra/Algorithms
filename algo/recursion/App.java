package algo.recursion;

public class App {
    public static void main(String[] args) {
       // System.out.println(recursiveLinearSearch(12, new int[] {13, 14,15,17,21,12,56}, 0));

        System.out.println(recursiveBinarySearch( new int[] {1,2,3,12,14,16}, 0, 5, 12));
        // the input array of BINARY SEARCH must be SORTED
    }
    //the output line at the top is printed first
    // the output line before the returning the final index is the one that invokes the elseif


//    public static void reduceByOne(int n){
//        if(n>= 0){  //base case
//            reduceByOne(n-1);
//        }
//
//        System.out.println("Completed call: " + n);
//    }

    public static int recursiveLinearSearch(int x, int [] a, int i){
        //i is the starting index of the array
        if (i >= a.length){ //x was not found in the array
            return -1;
        }else if(a[i] == x){
            return i;
        }else{
            System.out.println(" index at:" + i);
            return recursiveLinearSearch(x, a, i+ 1);
        }
    }

    public static int recursiveBinarySearch(int [] a, int p, int r, int x){
        System.out.println(" range of array " + p+ " ... " + r);
        if(p > r){
            return -1;
        }
        int q = (p + r)/2;

        if(a[q] == x){
            return q;
        }else if(a[q]> r){
            return recursiveBinarySearch(a, p, q-1, x);
        }else{
            return recursiveBinarySearch(a, q+1, r, x);
        }
    }
}
