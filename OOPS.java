import java.util.*;
// class FirstClass{
//     public static void main(String[] args){
//         System.out.println("hello world");
//         System.out.print("hello world\n");
//         System.out.print("hello world");
//     }
// }
// class FirstClass{
//     public static void main(String[] args){
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//         System.out.println("*****");
       
//     }
// }

// ############### loop ##################
// class FirstClass{
//     public static void main(String[] args){
//         var a=5; 
         
//       for(int i=1 ; i <= a; i++){
        
//         for(int j = 0;j < a - i; j++){
//             System.out.print(" ");
//         }
//         for(int k=1;k <= (2 * i-1);k++){
//             System.out.print("*");
//         }
//         System.out.println();
//       }
       
//     }
// }

// class FirstClass{
//     public static void main(String[] args){
//         var a=5; 
         
//       for(int i=1 ; i <= a; i++){
        
//         for(int j = 0;j < a - i; j++){
//             System.out.print(" ");
//         }
//         for(int k=1;k <=i;k++){
//             System.out.print("* ");
//         }
//         System.out.println();
//       }
       
//     }
// }


// ########### get input #############
// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         String name=sc.next();
//          System.out.println(name);

//     }
    
// }


// ################ sum of two numbers ###################

// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=a+b;
//         System.out.println(c);

//      sc.close();
//     }
    
// }



// ################## Area of circle #################
// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
//         double pi= 3.14 ;
//         Scanner sc =new Scanner(System.in);
//         float radius=sc.nextFloat();
//         double Area=pi * (radius*2);

//         System.out.println("Area of circle:" + Area);

//      sc.close();
//     }
    
// }


// ################# Table Of  Number ####################

// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
      
//         Scanner sc =new Scanner(System.in);
//         int number=sc.nextInt();
//          for(int i=1; i <= 10;i++){
//               System.out.println(number + "x" + i + "=" + (number * i));
//          }


//      sc.close();
//     }
    
// }




// !____________________calculater in java_____________________________!
// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
      
//         Scanner sc =new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         char operator=sc.next().charAt(0);
       
//         int result;
//         switch (operator) {
//             case '+':
//                 result = a+b;
//                 System.out.println("plus of two numbers" + result);
//                 break;
//             case '-':
//                 result = a+b;
//                 System.out.println("plus of two numbers" + result);
//                 break;
//             case '*':
//                 result = a*b;
//                 System.out.println("plus of two numbers" + result);
//                 break;
//             case '/':
//             if(b == 0){
//                System.out.println("error division by zero");
//             }else{
//                 result = a/b;
//                 System.out.println("plus of two numbers" + result);
//                 break;
//             }
               
//             case '%':
//                 result = a%b;
//                 System.out.println("plus of two numbers" + result);
//                 break;
        
//             default:
//                 break;
//         }


//      sc.close();
//     }
    
// }




// !________________ Print All Even Numbers till n _____________________________________________!


// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
      
//         Scanner sc =new Scanner(System.in);
//         int a=sc.nextInt();
    

//         for(int i=0;i<=a;i++){
//             if(i % 2 == 0){
//                 System.out.println(i);
//             }
//         }
       
//      sc.close();
//     }
    
// }





// !_______________________ Print Student Numbers _____________________!

// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
      
//         Scanner sc =new Scanner(System.in);
//         int userChoice;
//         do{
//              System.out.println("marks driven system");
//              userChoice =sc.nextInt();
//              if(userChoice == 1){
//                 System.out.println("inter marks");
//                 int marks;
//                 marks=sc.nextInt();
//               do{
//                 marks = sc.nextInt();
//                 if(marks >=90 ){
//                     System.out.println("This is Good");
//                 }else if(89 >= marks && marks >= 60){
//                     System.out.println("This is also good");
//                 }else if(59 >= marks && marks >= 0){
//                  System.out.println("This is Good as well");
//                 }else if(marks != -1){
//                     System.out.println("invalid value please enter value greater then 1");
//                 }
//               }while(marks != -1);
             
//             }
//         }while(userChoice !=0);
    
    
//      sc.close();
//     };
    
// }


//  !_________________________________ Patterns in java _____________________!

//    *********
//    *********
//    *********
//    *********
//    *********
// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
      
//         Scanner sc =new Scanner(System.in);
//         int n =sc.nextInt();
//         for(int i=0;i<n;i++){

//             for(int j=0;j<5;j++){

//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//      sc.close();
//     };
    
// }




// !________________ Hollo Pattern __________________________!

// ****
// *  *
// *  *
// ****

// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
      
//         Scanner sc =new Scanner(System.in);
//         int n =sc.nextInt();
//         int m =sc.nextInt();

//     for(int i=1;i<= n;i++){
           
//                 // Print 2 stars for the second and third lines
//                 for (int j = 1; j <= m; j++) {
//                 if(i == 1 || j == 1 || i == n || j == m){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//                 }

//             System.out.println();
//         }
//      sc.close();
//     };
    
// }




// !_____________ Pyramid _______________________!

// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
      
//         Scanner sc =new Scanner(System.in);
//         int n =sc.nextInt();
    

//     for(int i=1;i<= n;i++){
           
//                 // Print 2 stars for the second and third lines
//                 for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//                 }

//             System.out.println();
//         }
//      sc.close();
//     };
    
// }



// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
      
//         Scanner sc =new Scanner(System.in);
//         int n =sc.nextInt();
    

//     for(int i=n;i > 0;i--){
           
//         // System.out.println("*");
//                 // // Print 2 stars for the second and third lines
//                 for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//                 }

//             System.out.println();
//         }
//      sc.close();
//     };
    
// }



// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
      
//         Scanner sc =new Scanner(System.in);
//         int n =sc.nextInt();
    

//     for(int i=n;i > 0;i--){
           
//         // System.out.println("*");
//                 // // Print 2 stars for the second and third lines
//                 for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//                 }

//             System.out.println();
//         }
//      sc.close();
//     };
    
// }




// import java.util.*;

// public class FirstClass {

//     public static void main(String[] args){
      
//         Scanner sc =new Scanner(System.in);
//         int n =sc.nextInt();
    

//     for(int i=1;i <= n;i++){
           
//         // System.out.println("*");
//                 // // Print 2 stars for the second and third lines
//                 for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//                 }

//             System.out.println();
//         }
//      sc.close();
//     };
    
// }



// butterfly Pattern


// public class FirstClass {

//     public static void main(String[] args){
      
//        int n= 5;
//     for(int i=1;i<=n;i++){
//                 for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//                 }

//                 int sapces=2*(n-i);
//                 for(int j=1;j<=sapces;j++){
//                     System.out.print(" ");
//                 }

//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                     }
//                 System.out.println();
//                }
               
//               for(int i=n;i>=1;i--){
//                 for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//                 }

//                 int sapces=2*(n-i);
//                 for(int j=1;j<=sapces;j++){
//                     System.out.print(" ");
//                 }

//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                     }
//                 System.out.println();
//                }
 
//     };
    
// }


// Number Pyramid 
// public class FirstClass {

//     public static void main(String[] args){
      
//        int n= 5;
//     for(int i=1;i<=n;i++){
                  
        
//                 for(int k=1;k<=n-i;k++){
//                         System.out.print(" "); 
//                     }

//                     for(int k=1;k<=5;k++){
//                         System.out.print("*"); 
//                     }
//                     System.out.println();
             
             
//                 }
                      
//     };
    
// }


// Number Pyramid
// public class FirstClass {

//     public static void main(String[] args){
      
//        int n= 5;
//     for(int i=1;i<=5;i++){

//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }
//     }

//     }
    

// palaydromic pyramid

// public class FirstClass {

//     public static void main(String[] args){
      
//        int n= 5;
//     for(int i=1;i<=5;i++){

//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=i;j>=1;j--){
            
//             System.out.print(j);
//         }

//         for(int j=2;j<=i;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
//     }

//     }



// Diamond Pattern
    
// public class FirstClass {

//     public static void main(String[] args){
      
//        int n= 7;
//     for(int i=1;i<=n;i++){

//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j = 1; j <= 2 * i-1; j++) {
//             System.out.print("*" );
//         }
//         System.out.println(); 
//     }
//     // 2nd half
//     for(int i=n;i>=1;i--){

//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j = 1; j <= 2 * i-1; j++) {
//             System.out.print("*" );
//         }
//         System.out.println(); 
//     }
//     }

//     }
    



// Finctions And Methods in java
// import java.util.*;
// public class FirstClass {

//     public static void myname(String name){
//         System.out.println(name);
//          return;
//     }

//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String name=sc.next();
//         myname(name);
//     }
     
// }


// sum of two numbers

// import java.util.*;
// public class FirstClass {

//     public static void sum(int a,int b){
//         System.out.println(a+b);
//          return;
//     }

//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//        sum(a,b);
//     }
     
// }


// return sum
// import java.util.*;
// public class FirstClass {

//     public static int sum(int a,int b){
//         int sum=a+b;
//          return sum;
//     }

//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//        int sum=sum(a,b);
//        System.out.println("sum of two numbers"+ sum);
//     }
     
// }


// factorial of number
// import java.util.*;
// public class FirstClass {

//     public static int factorial(int a){
//         int num=1;
//         for(int i=1;i <= a;i++){
//             num *= i;
//         }
//         return num;
//     }

//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//        int factorial=factorial(a);
//        System.out.println("factorial of num"+ factorial);
//     }
     
// }


// Fibonacci

// import java.util.*;
// public class FirstClass {

//     public static void Fibonacci(){
//         int a=0; int b=1;
//         for(int i=1;i<=10;i++){
//             System.out.print(a + " ");
//             int next=a+b;
//             a=b;
//             b=next;
//         }
       
//     }

//     public static void main(String args[]){
//         // Scanner sc=new Scanner(System.in);
      
//          Fibonacci();
      
//     }
     
// }


//  class Pen {
//   String color;
//   String type;
   
//   Pen() {
//     System.out.println("use for writing");
// }
//   public void write(){
//     System.out.println("writing something");
//   }
//   public void printColor(){
//     System.out.println(this.color);
//   }
//  }


// public class OOPS{

//     public static void main(String args[]){
//         Pen pen1=new Pen();
//         pen1.color="blue";
//         Pen pen2=new Pen();
//         pen2.color="red";

//         pen1.write();
//         pen1.printColor();
//         pen2.printColor();
//     }
    
// }


//  class Pen {
//   String color;
//   String type;
//   Integer price;
   
//   Pen() {
//     System.out.println("use for writing");
// }
//   public void write(int price){
//     System.out.println(this.price);
//   }
//   public void write(String color){
//     System.out.println(this.color);
//   }
//  }


// public class OOPS{

//     public static void main(String args[]){
//         Pen pen1=new Pen();
//         pen1.color="blue";
//         Pen pen2=new Pen();
//         pen2.color="red";
//         pen1.price=24;

//         pen1.write(pen1.price);
//         pen1.write(pen1.color);
        
//     }
    
// }

// import java.util.*;
// public class OOPS{

//     public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       int size=sc.nextInt();
      
//       int marks[]=new int[size];
//       for(int i=0;i<size;i++){
//         marks[i]=sc.nextInt();
//       }
//       for(int i=marks.length-1;i>=0;i--){
//         System.out.println(marks[i]);
//       }

        
//     }
    
// }


// find x number

// import java.util.*;
// public class OOPS{

//     public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       int size=sc.nextInt();
//       sc.nextLine();
//       int takexnumber=sc.nextInt();
      
//       int numbers[]=new int[size];
//       for(int i=0;i<size;i++){
//         numbers[i]=sc.nextInt();
//       }

//       for(int i=0;i<size;i++){
//         if(takexnumber == numbers[i]){
//           System.out.println("found number here" + numbers[i]);
//         } 
//       }
      

        
//     }
    
// }


// 2 d Array
// import java.util.*;
// public class OOPS{

//     public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       int row=sc.nextInt();
//       int col=sc.nextInt();
//       int numbers[][] = new int[row][col];
      
//       for(int i=0;i<row;i++){
//         for(int j=0;j<col;j++){
//           numbers[i][j]=sc.nextInt();
//         }
//       }
      
//       for (int i=0;i<row;i++){
//         for (int j=0;j<col;j++){
//           System.out.print(numbers[i][j]+ " ");
//         }
//         System.out.println();
//       } 
//     }
    
// }


// find x number form 2 D array
// import java.util.*;
// public class OOPS{

//     public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       int row=sc.nextInt();
//       int col=sc.nextInt();
//       int numbers[][] = new int[row][col];
      
//       for(int i=0;i<row;i++){
//         for(int j=0;j<col;j++){
//           numbers[i][j]=sc.nextInt();
//         }
//       }
//        int x=sc.nextInt();
//       for (int i=0;i<row;i++){
//         for (int j=0;j<col;j++){
//           if(numbers[i][j] ==  x){

//             System.out.print("x found at location ("+i+","+j+")" );
//           }
//         }
    
//       } 
//     }
    
// }


// public class OOPS {


//   public static void main(String[] args) {
//     String name1="nadish umair was a student of bsit";
//     String name2="nadish";
    //  if(name1.compareTo(name2) ==0){
    //   System.out.println("same strings");
    //  }else{
    //   System.out.println("different string");
    //  }
       
    // String subStr= name1.substring(10,name1.length());
    // System.out.println(subStr);
    // for(int i=0;i<name.length();i++){
    //   // System.out.println("caracters" + " " + name.charAt(i));
    // }
//   }
// }


// public class OOPS {


//   public static void main(String[] args) {
//    StringBuilder name=new StringBuilder("Nadish");
//    System.out.println(name);
//    System.out.println(name.charAt(0));
//    name.setCharAt(0, 'I');
//    System.out.println(name);
//   name.insert(0,'h');
//   System.out.println(name);
//   name.delete(3, 5);
//   System.out.println(name);
//   name.append("m");
//   System.out.println(name);

//   }
// }

// public class OOPS {


//   public static void main(String[] args) {
//   String name="Nadish";
//    String reversed ="";
//    for(int i=name.length()-1;i>=0;i--){
//     reversed +=name.charAt(i);
//    }
// System.out.println(reversed);
//   }
// }

// public class OOPS {


//   public static void main(String[] args) {
//   StringBuilder name=new StringBuilder("Nadish");
  
//    for(int i=0;i<name.length()/2;i++){
//     System.out.println(i);
//     int front=i;
//     int back= name.length()-1-i;
//     char frontChar= name.charAt(front);
//     char backChar= name.charAt(back);
//     name.setCharAt(front, backChar);
//     name.setCharAt(back, frontChar);
//    }
//    System.out.println(name);

//   }
// }

// public class OOPS {


//   public static void main(String[] args) {
//   int num=5;
//    int pos=1;
//    int bitMask=1<<pos;

//    int newNum=bitMask | num;
//    System.out.println(newNum);

//   }
// }


//bubble sort
// public class OOPS {

// public static void printArray(int array[]){
//   for(int i=0;i<array.length;i++){
//     System.out.println(array[i]);
//   }

// };

//   public static void main(String[] args) {
//     // time complexity O(n^2)
//     int arr[] = {3, 4, 5, 8, 9, 2};
//     for (int i = 0; i < arr.length - 1; i++) {
//       System.out.println("Element: " + arr[i]);
//       for(int j=0;j<arr.length-i-1;j++){
//           if(arr[j] > arr[j+1]){
//             int temp=arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;
//           }
//       }
//     }
//     printArray(arr);
//   }
// }


//selection sort
public class OOPS {

public static void printArray(int array[]){
  for(int i=0;i<array.length;i++){
    System.out.println(array[i]);
  }

};
  public static void main(String args[]){
    int arr[]={2,4,5,6,9,3};
     for(int i=0;i<arr.length;i++){
      System.out.println("Element: " + arr[i]);
      int smallest=i;

      for(int j=i+1;j<arr.length;j++){
        System.out.println("ele" + arr[j]);
        if(arr[smallest]>arr[j]){
          smallest=j;

        }
      }
      System.out.println("arr" + arr[i]);
      int temp=arr[smallest];
      arr[smallest]=arr[i];
      arr[i]=temp;
   }
  printArray(arr);

  }
}