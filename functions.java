//public class functions {
    
// Binomial Coefficient

// public static int factorial(int n){
// int f=1;
// for(int i=1; i<=n; i++){
//     f=f*i;
    
// }
// return f;

// }

// public static int bincoeff(int n , int r){
//     int fact_n= factorial(n);
//     int fact_r= factorial(r);
//     int fact_nmr= factorial(n-r);

//     int bincoeff= fact_n/(fact_r*fact_nmr);
//     return bincoeff;

// }
// public static void main(String args[]){
// System.out.println(bincoeff(5,2));


// }


// }






//Question find the number is prime or not by boolean function 


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// class Main {
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//      for(int i=2; i<=math.sqrt(n); i++){
//          if (n%i==0){
//              return false;
//          }
//      }   
//       return true;  
        
//     }
    
    
    
    
    
    
    
    
    
    
    
//     public static void main(String[] args) {
//         System.out.println(isPrime(4));
//     }
// }








//question convert from binary to deciaml number



// class Main {
//     public static void binToDec(int binNum){
        
//         myNum=binNum;
//         int pow=0;
//         int decNum=0;
//         while(binNum>0){
//             int lastDigit=binNum%10;
//             decNum= decNum+(lastDigit*(int)Math.pow(2,pow));
//             pow++;
//             binNum= binNum/10;
//         }
//         System.out.println("Decimal of " + myNum +" =" +decNum);
        
    
//     }

    
//     public static void main(String[] args) {
//     binToDec(101);
//     }
// }





//question change the number from decimal to binary

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// class Main {
//     public static void DectoBin(int n){
        
        
//         int myNum=n;
//         int pow=0;
//         int DecNum=0;
        
//         while(n>0){
//             int rem=n%2;
//             DecNum=DecNum + (rem*(int)Math.pow(10, pow));
//             pow++;
//             n=n/2;
            
//         }
//         System.out.println("Binary of the "+myNum+"=" + DecNum);
//     }
    
//     public static void main(String[] args) {
//         DectoBin(78);
//     }
// }




//class Main {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int c= sc.nextInt();
//         int sum= a+b+c;
//         float average= sum/3.0f;
//         System.out.println(average);
//         }
// }








//question find the number is even or odd by the boolean 

// class Main {
    
//     public static boolean isEven(int n){
//         if(n%2==0){
//             return true;
//         }
//         return false;
        
       
        
//     }
    
//     public static void main(String[] args) {
//          System.out.println(isEven(72));
//     }
// }







//question print the star patern 


// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       System.out.println("Enter the number of lines");
//       int n=sc.nextInt();
      
      
//       for(int i=1; i<=n; i++){
//           for(int j=1; j<=i; j++){
//               System.out.print("* ");
              
//           }
//           System.out.println();
//       }
      
//     }
// }









//question print right angle with space and star (inverted)



// class Main {
//     public static void main(String[] args) {
//      int n=4;
     
//      for(int i=1; i<=n; i++){
//          for(int j=1; j<=n-i; j++);
//          System.out.print(" ");
         
//      }
//      for(int k=1; k<=i; k++){
//          System.out.print("*");
//      }
// System.out.print();
     
//     }
// }









// question print inverted half pyramid with numbers 


// class Main {
//     public static void inverted_half_pyr_winum(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
    
//     public static void main(String[] args) {
//         inverted_half_pyr_winum(5);
//     }
// }








// question print floyd's triangle
// class Main {
//     public static void Floyd_Triangle(int n){
//         int count=1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(count+" " );
//                 count++;
//             }
            
//             System.out.println();
//         }
//     }
    
//     public static void main(String[] args) {
//         Floyd_Triangle(5);
//     }
// }







// question (0-1)triangle pattern

// class Main {
//     public static void traingle_patt(int n){
       
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 if((i+j)%2==0 ){
//                     System.out.print("1");
//                 }
//                     else{
//                     System.out.print("0");
//                     }
              
//             }
            
//             System.out.println();
//         }
//     }
    
//     public static void main(String[] args) {
//       traingle_patt(5);
//     }
// }








//question = print the dimond pattern

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// class Main {
//     public static void DiaPatt(int n){
        
     
        
//         for(int i=1; i<=n; i++){
            
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int m=1; m<=2*i-1; m++){
//                 System.out.print("*");
                
//             }
            
//             System.out.println();
            
//         }
        
//         //second half
//         for(int i=n; i>=1; i--){
            
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int m=1; m<=2*i-1; m++){
//                 System.out.print("*");
                
//             }
            
//             System.out.println();
    
//         }
        
//     }
    
//      public static void main(String[] args) {
        
//     DiaPatt(4);
       
//     }
// }













