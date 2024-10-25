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

import java.util.*;

public class FirstClass {

    public static void main(String[] args){
      
        Scanner sc =new Scanner(System.in);
        int userChoice;
        do{
             System.out.println("marks driven system");
             userChoice =sc.nextInt();
             if(userChoice == 1){
                System.out.println("inter marks");
                int marks;
                marks=sc.nextInt();
              do{
                marks = sc.nextInt();
                if(marks >=90 ){
                    System.out.println("This is Good");
                }else if(89 >= marks && marks >= 60){
                    System.out.println("This is also good");
                }else if(59 >= marks && marks >= 0){
                 System.out.println("This is Good as well");
                }else if(marks != -1){
                    System.out.println("invalid value please enter value greater then 1");
                }
              }while(marks != -1);
             
            }
        }while(userChoice !=0);
    
    
     sc.close();
    };
    
}
