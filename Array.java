
 import java.util.Scanner;

//  class Array {

// public static void main(String[] args) {
    

// int marks[]= new int[100];
//         Scanner sc=new Scanner(System.in);
        
//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();
        
//         System.out.println("phy"+ marks[0]);
//         System.out.println("chem"+ marks[1]);
//         System.out.println("maths"+ marks[2]);
        
//         //update marks
//         marks[2]=100;
//         System.out.println("maths"+ marks[2]);


// sc.close();

// }

// }










 //  Question =fint the largest number in a given array

// class Array {
   
    
//     public static int GetLargest(int numbers[]){
//         int largest=Integer.MIN_VALUE;
//         for(int i=0; i<numbers.length; i++){
//             if(largest<numbers[i]){
//                 largest=numbers[i];
//             }
//         }
//         return largest;
        
//     }
    
//     public static void main(String[] args) {
//         int numbers[]={1,2,6,3,5};
        
//         System.out.println("largest" +" "+ GetLargest(numbers));
//     }
// }










// Question = Binary Search algorithm


// class Array {
//     public static int BinSearch(int numbers[], int key){
//         int start=0; 
//         int end=numbers.length-1;
        
//         while(start<=end){
//             int mid= (start+end)/2;
//             if(numbers[mid]==key){
//                 return mid;
//             }
//             if(numbers[mid]<key){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//         }
//         return -1;
//     }
    
    
    
//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10,12,14};
//         int key=14;
//         System.out.println(" Your key is at " + BinSearch(numbers ,  key));
//     }
// }









// Question =Reverse an array


// class Array {
//    public static void ReverseArray(int numbers[]){
//        int first=0; 
//        int last=numbers.length-1;
       
//        while(first<last){
//            //swap
//            int temp=numbers[first];
//            numbers[first]=numbers[last];
//            numbers[last]=temp;
//             first++;
//             last--;
//        }
//    }
   
//    public static void PrintArray(int numbers[]){
//    for(int i=0; i<numbers.length; i++){
//         System.out.print(numbers[i]+ " ");
//    }
//    }
    
//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10,12,14};
//         //int key=14;
//         ReverseArray( numbers);
//         PrintArray(numbers);
        
//     }
// }









// Question = Print Pairs of an array



// class Array {
//     public static void PrintPairs(int numbers[]){
//         for(int i=0; i<numbers.length; i++){
//             int curr= numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//          System.out.print("(" + curr + "," + numbers[j] + ") ");
//             }
//             System.out.println();
//         }
//     }
    
//     public static void main(String[] args) {
//         int numbers[]= { 2,4, 6,8,10};
//         PrintPairs(numbers);
//     }
    
// }










//Question = Kadan's Algorithm (Print the Max Subarray Sum)



// class Array {
    
//     public static void Kadans(int number[]){
//         int ms= Integer.MIN_VALUE;
//         int cs=0;
//         for(int i=0; i<number.length; i++){
//             cs=cs+number[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(cs,ms);
//         }
//         System.out.println("Our Max Subarray sum  is :" + ms);
//     }

//     public static void main(String[] args) {
//         int number[]= { -2, -3, 4, -1, -2, 1, 5, -3 };
        
//         Kadans(number);
// }
// }










//Question = To Calculate Rain Trapped Water 



// class Array {
//     public static int TrapRainWater(int height[]){
//         int n=height.length;
//         //left max Array
//         int LeftMax[]=new int[n];
//         LeftMax[0]=height[0];
//         for(int i=1; i<n; i++){
//             LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
//         }
//         // Right max Array
//         int RightMax[]= new int[n];
//         RightMax[n-1]=height[n-1];
//         for( int i=n-2; i>=0; i--){
//             RightMax[i]=Math.max(height[i], RightMax[i+1]);
//         }
//         //for calculate water 
//         int TrappedWater=0;
//         for(int i=0; i<n; i++){
//             int WaterLevel=Math.min(LeftMax[i], RightMax[i]);
//             TrappedWater+=WaterLevel-height[i];
//         }
        
//         return TrappedWater;
//     }

//     public static void main(String[] args) {
       
//        int height[]={4,2,0,6,3,2,5};
//        System.out.println(TrapRainWater(height));
       
//     }
// }