package algo.binarysearch;

public class binaryApp {

    public static void main(String[] args) {
        System.out.println(BinarySearch( new int[] {1,2,3,12,14,16}, 12));
    }

    public static int BinarySearch(int[] a, int x){
        int p = 0;
        int r = a.length;

        while(p<= r){
            int q = (p + r)/2;
            if(x == a[q]){
                return q;
            }else if(x > a[q]){
                r = q-1;
            }else{
                p = q+1;
            }

        }
        return -1;
    }

}

