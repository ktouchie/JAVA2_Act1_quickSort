import java.util.*;
class qsort {

	public static void main(String[] args) {
        
        int[] tab = {5,9,4,1,2,7,3,8,6,0};
        
        
    }
    
    public static void partition(int A[], int x, int y) {
        int p = A[x];
        int i = x;
        int k = (A.length-1);
        int temp;
        for (i<A.length; i++) {
            if (A[i]>p) {
                for (k>0; k--) {
                    if (A[k]<p) {
                        temp = A[k];
                        A[k] = A[i];
                        A[i] = temp;
                    }
                    System.out.println(Arrays.toString(tab))
                }
            }
        }
    }
    
}
