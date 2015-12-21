import java.util.*;
class qsort {

	public static void main(String[] args) {
        
        int[] tab = {5,9,4,1,2,7,3,8,6,0};
        partition(tab, 0, (tab.length-1));
        
        
    }
    
    public static void partition(int A[], int start, int end) {
        int i = start;  //first position of the array
        int k = end;    //last position of the array
        
        if ((k-i)<=0) {} //check that there are at least two elements in the array
        
        else {
            
            int pivot = A[start]; //declare pivot as first element of array
            
            while (k>i) {
                
                while (A[i]<=pivot && i<= end && k>i) {  //look for first number greater than pivot (L to R)
                    i++;
                }
                while (A[k]>pivot && k>=start && k>=i) {  //look for first number less than pivot (R to L)
                    k--;
                }
                if (k>i) {
                    swap(A, i, k);
                }
            }
        }
        
    }
    
    public static void swap(int array[], int p, int q) {
        int temp = array[p];
        array[p] = array[q];
        array[q] = temp;
    }

    
}
