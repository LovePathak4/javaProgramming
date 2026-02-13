public class sort {




//     //bubble sort
    

//     public static void bubbleSort(int arr[]){
//         int n=arr.length;

//         for(int i=0; i<n-1; i++){
//             for (int j=0; j<n-i-1; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;


//                 }
//             }
//         }

//     }

//     public static void PrintArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+ " ");      
//         }
//          System.out.println();
//     }


//     public static void main(String[] args) {
        
// int arr[]={5,4,1,3,2};

// bubbleSort(arr);
// PrintArr(arr);


//     }
    







//selection sort





    
//     public static void SelSort(int arr[]){
//         int n = arr.length;
//         for(int i = 0; i < n-1; i++){
//             int min = i; // assume i is the smallest
//             for(int j = i+1; j < n; j++){
//                 if(arr[j] < arr[min]){
//                     min = j; // update min index
//                 }
//             }
//             // swap arr[i] and arr[min]
//             int temp = arr[i];
//             arr[i] = arr[min];
//             arr[min] = temp;
//         }
//     }
    
//     public static void PrintSel(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
    
//     public static void main(String[] args) {
//         int arr[] = {5,4,6,1,7};
//         SelSort(arr);
//         PrintSel(arr);
//     }
// }












    public static void Mergesort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid= si+(ei-si)/2;
        Mergesort(arr, si , mid);
        Mergesort(arr, mid+1, ei);
        merge(arr, si , mid , ei);
    }
    
    
     public static void merge(int []arr, int si,int mid,  int ei){
           int[] temp=new int[ei-si+1];
            int i=si;
            int j=mid+1;
            int k=0;
            while(i<=mid &&j<=ei){
                if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++;
                }
                else{
                    temp[k]=arr[j];
                    j++;
                }
                k++;
                
                while(i<=mid){
                    temp[k++]=arr[i++];
                }
                while(j<=ei){
                    temp[k++]=arr[j++];
                }
            }
            
            for( k=0 , i=si; k<temp.length; k++, i++){
                arr[i]=temp[k];
            }
        }
        public static void printarr( int [] arr){
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        }
        
        
    public static void main(String[] args) {
        int [] arr={20,10,50,40};
    Mergesort(arr, 0, arr.length-1);
        printarr(arr);
        //System.out.println("Try programiz.pro");
    }
}





























