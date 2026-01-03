


//Question = Check wheather the array is sorted or not .

// public class Recursion {
//        public static boolean IsSorted(int arr[], int i){
//         if(i==arr.length-1){
//             return true;
//         }
//         if(arr[i]>arr[i+1]){
//             return false;
//         }
        
//         return IsSorted(arr, i+1);
       
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4};
//        System.out.print(IsSorted(arr, 0));
        
//     }
// }









//Question = Write a Function to find the first Occurance of an element in  an Array


// public class Recursion {
//     public static int FirstOccurance(int arr[], int key, int i){
//         if(i==arr.length){
//             return -1;
//         }
//         if(arr[i]==key){
//             return i;
//         }
        
//         return FirstOccurance( arr, key, i+1);
//     }
    
//     public static void main(String[] args) {
//     int arr[]= {8,3,6,9,5,10,3,5,2};
//     System.out.print(FirstOccurance(arr,5,0));
//     }
// }









// Question=Write a function to find the last occurance of an element in arraay.

// public class Recursion {

    
//     public static int LastOcc(int arr[], int key, int i){
//         if(i<0){
//             return -1;
//         }
//         if(arr[i]==key){
//             return i;
//         }
//         return LastOcc(arr,key,i-1);
//     }
    
//     public static void main(String[] args) {
        
//         int arr[]={8,3,6,9,5,10,3,5,2};
//         int key=5;
//         int i=arr.length-1;
//         System.out.println("Last occurrence of " + key + " is at index: " + LastOcc(arr, key, i));
//     }
// }









//Question= Write a function to find the power of number(x,n)


// public class Recursion {
//     public static int Power(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         // int nm1= Power(x, n-1);
//         // int nx=x*nm1;
//         // return nx;
        
//         return x*Power(x, n-1);
//     }
//     public static void main(String[] args) {
//         System.out.print(Power(2, 10));
//     }
// }










//Question = Tower of Hanoi


// import java.util.*;

// public class Recursion
// {
// 	static void towerOfHanoi( int n, char A, char C, char B)
// 	{
// 		 if(n==0)
// 		 {
// 		 	 return;
// 		 }
		 
// 		 towerOfHanoi( n-1, A,B,C);
// 		 System.out.println( A+" to "+C);
// 		 towerOfHanoi( n-1, B,C,A);
// 	}
// 	public static void main (String[] args) 
// 	{
// 		 towerOfHanoi( 3, 'A', 'C', 'B');
// 	}
// }