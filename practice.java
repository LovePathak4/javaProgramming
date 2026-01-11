// // Leet code problems

// // Question = Check if the number is palindrome or not (q= 9)


// // class practice {

// //     public static boolean isPalindrome(int x){
        
// //         int n=x;
// //         int revnum=0;
// //         if(n==1){
// //             return true;
// //         }
        
// //         while(n>0){
// //             int d=n%10;
// //             revnum=10*revnum+d;
// //             n=n/10;
// //         }
// //         if(revnum==x){
// //             return true;
// //         }else{
// //             return false;
// //         }
        
    
        
// //     }
// //     public static void main(String[] args) {
// //         System.out.println(isPalindrome(123));
// //     }
// // }










// //Question = Check if the number is the power of two or not(q=3)


// // class practice {
// //     public static boolean power(int n){
// //         if(n<1){
// //             return false;
// //         }
// //         else if(n==1){
// //             return true;
// //         }
// //         else{
        
// //         while(n%2==0){
// //             n=n/2;
// //         }
// //         if(n==1){
// //             return true;
// //         }else{
// //             return false;
// //         }
// //         }
// //     }
// //     public static void main(String[] args) {
// //         System.out.println(power(4));
        
// //     }
// // }









// class practice {
//     public int fib(int n) {
//         if(n==0){
//             return 0;
//         }
//         if(n==1){
//             return 1;
//         }
//         int firstTerm=0;
//         int secondTerm=1;

//         for(int i=0; i<n; i++){
//             int thirdTerm= firstTerm+ secondTerm;

//             firstTerm=secondTerm;
//             secondTerm=thirdTerm;

//         }
//         return firstTerm; 
//     }

//     public static void main(String[] args) {
//         fib(4);
//     }
// }