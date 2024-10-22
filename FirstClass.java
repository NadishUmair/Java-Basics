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


// ################# table Of  Number ####################

import java.util.*;

public class FirstClass {

    public static void main(String[] args){
        double pi= 3.14 ;
        Scanner sc =new Scanner(System.in);
        float radius=sc.nextFloat();
        double Area=pi * (radius*2);

        System.out.println("Area of circle:" + Area);

     sc.close();
    }
    
}