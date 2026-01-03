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





    
    public static void SelSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int min = i; // assume i is the smallest
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j; // update min index
                }
            }
            // swap arr[i] and arr[min]
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
    public static void PrintSel(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {5,4,6,1,7};
        SelSort(arr);
        PrintSel(arr);
    }
}





























