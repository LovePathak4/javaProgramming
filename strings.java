// public class strings {

//     public static void main(String args[]){
        
//        String firstname="Lokesh";
//        String lastname="pathak";
//        String Fullname=firstname+" "+lastname;
//        System.out.println(Fullname.charAt(1));
//     }
// }









//Question 1= Check if a string is Palindrome "racecar" , "noon", "madam"


// public class strings {
//     public static boolean isPalindrome(String str){
//         for(int i=0; i<str.length()/2; i++){
//             int n=str.length();
//             if(str.charAt(i)!=str.charAt(n-i-1)){
//                 // not a palindrome
//                 return false;
//             }
//         }
//         return true;
//         }
//     public static void main(String[] args) {
//        String str="racecar";
//        String str1="noen";
//        System.out.println(isPalindrome(str));
//        System.out.println(isPalindrome(str1));
//     }
// }









//Question 2 = Given a route containing 4 directions (e,w,n,s) find the 
//shortest path to reach destionation 

// public class strings {
    
        
//         public static double GetshortPath(String path){
//             int x=0; int y=0;
//             for(int i=0; i<path.length(); i++){
//                 char dir=path.charAt(i);
//                 if(dir=='s'){
//                     y--;
//                 }else if(dir=='n'){
//                     y++;
//                 }
//                 else if(dir=='e'){
//                     x--;
//                 }
//                 else if(dir=='w'){
//                     x++;
//                 }
//             }
//             float x2= x*x;
//             float y2= y*y;
//             return Math.sqrt(x2+y2);
//         }
        
//     public static void main(String[] args) {
//       String path="wneenesennnn";
//       System.out.println(GetshortPath(path));
      
//     }
// }









//Question 3 = print a substring 
// public class strings {
//     public static String sub(String str, int si, int ei){
//         String DupString=" ";
//         for(int i=si; i<=ei; i++){
//             DupString+=str.charAt(i);
            
//         }
//         return DupString;
//     }

//     public static void main(String[] args) {
//      String str="HelloWorld";
//      System.out.println(sub(str, 0, 5));

//     // str.substring(4,6);(java inbuilt function for substring)
//      System.out.print(str.substring(2,6));
//     }
// }











// Question 4 = For a given set of strings print the largest string "apple ", "mango", "banana"
//Lexicographic (dictionary arrangement of the words )

// public class strings {
//     public static void main(String[] args) {
//         String fruits[]={"apple","mango","banana"};
//         String largest=fruits[0];
//         for(int i=1; i<fruits.length; i++){
//         if(largest.compareTo(fruits[i])<0){
//             largest=fruits[i];
//         }
//     }
//     System.out.println(largest);
// }
// }










//Question 5 = For a given string convert each the first letter of each word to uppercase

public class strings {
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder(" ");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
       String str="hi i am lokesh pathak";
       System.out.println(toUpperCase(str));
       
    }
}