// conditiopnal statements
import java.util.*;
public class main {

    public static void main(String[] args) {

        // System.out.println("i am avinash");
        // System.out.println("hello world");
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.println("*****");

        // int a = 10;
        // int b =25;
        // System.out.println(b-a);

        // String name = "avinash";
        // System.out.println(name);

        // double price = 2.05;
        // System.out.println(price);


        // Scanner sc = new Scanner(System.in);
        // // String name = sc.nextLine();

        // // System.out.println(name);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = a+b;
        // System.out.println(sum);


        Scanner hello = new Scanner(System.in);

//         int age = hello.nextInt();

//         if(age>=18){
//             System.out.println("adult");
//         }
//        else{
//         System.out.println("child");
//        } 


//     }
// // 

int firstNumber = hello.nextInt();
int secondNumber = hello.nextInt();
int thirdNumber = hello.nextInt();
if(firstNumber>secondNumber && firstNumber>thirdNumber){
    System.out.println(firstNumber +" is a big number");
}
else if(secondNumber>firstNumber && secondNumber>thirdNumber){
    System.out.println(secondNumber +" is a big number");
}
else{
    System.out.println(thirdNumber +" is a big number");
}

int num = hello.nextInt();
 if(num%2==0){
    System.out.println("even");
 }
 else{
    System.out.println("odd");
 }

// int a = hello.nextInt();
// int b = hello.nextInt();
//  if (a>b) {
//     System.out.println(a + " is a greater than "+ b);  
//  }
//  else{
//     if (a==b) {
//         System.out.println(a + " is a equal to " +b); 
//     }
//     else{
//         System.out.println(a + " is a less than "+b );
//     }
//  }

// int button = hello.nextInt();

// switch (button) {
//     case 1:
//         System.out.println("Hello");
//         break;
//     case 2:
//         System.out.println("Namaste");
//         break;    
//     case 3:
//         System.out.println("Bonjour");
//         break;
//     default:
//     System.out.println("Invailid button");
//         break;
// }



// int a = hello.nextInt();
// int b = hello.nextInt();

// int sum = a+b;
// System.out.println(sum);

// int diff = a-b;
// System.out.println(diff);

// int mult = a*b;
// System.out.println(mult);

// int div = a/b;
// System.out.println(div);

// int remian = a%b;
// System.out.println(remian);



// int monthNum = hello.nextInt();

// switch (monthNum) {
//     case 1:
//         System.out.println("January");
//         break;
//     case 2:
//         System.out.println("February");
//         break;
//     case 3:
//         System.out.println("March");
//         break;
//  case 4:
//         System.out.println("April");
//         break;
//     case 5:
//         System.out.println("May");
//         break;
//     case 6:
//         System.out.println("June");
//         break;
//     case 7:
//         System.out.println("July");
//         break;
//     case 8:
//         System.out.println("August");
//         break;
//     case 9:
//         System.out.println("September");
//         break;
//     case 10:
//         System.out.println("October");
//         break;
//     case 11:
//         System.out.println("November");
//         break;
//     case 12:
//         System.out.println("December");
//         break;
//     default:
//     System.out.println("Invailid Number");
//         break;   
// }




    }
}