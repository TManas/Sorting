import java.util.Scanner;
 
public class NewSort {
 
//code starts here
	
	
    void merge(int arr[], int l, int m, int r)
    {
     
        int n1 = m - l + 1;
        int n2 = r - m;
  
        
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        
        int i = 0, j = 0;
  
        
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 // this is the code for the github repo
       
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
  
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    
    public static void main(String args[])
    {
        int n;  
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the number of elements you want to store: ");  
        n=sc.nextInt();  
        int[] array = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {    
            array[i]=sc.nextInt();  
        }
  
        NewSort ob = new NewSort();
        ob.sort(array, 0, array.length - 1);
  
        System.out.println("\nSorted array");
        printArray(array);
        
// code ends here
    }
 
}