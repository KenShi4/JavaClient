/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author informatica
 */
class Menu{
public static void main(String args[]){
System.out.println("Scegli il comando: ");
System.out.println("a: Get all Employees");
System.out.println("b: Get Employee");
System.out.println("c: Create Employee");
System.out.println("d: Delete Employee");
System.out.println("e: Patch Employee");
System.out.println("f: Update Employee");
System.out.println("?: Display");
System.out.println("q: Quit");
Scanner scan = new Scanner(System.in);
String choice = scan.nextLine();
do {
switch (choice){
    case "a":
     Get.Get();
        break;
    case "b":
     
        break;
    case "c":
        System.out.println("Id: ");
        int input1 = scan.nextInt();   
        System.out.println("First Name: ");
        scan.next();
        String input2 = scan.nextLine();
        System.out.println("Last Name: ");
         scan.next();
        String input3 = scan.nextLine();
         scan.next();
        System.out.println("Email: ");  
        String input4 = scan.nextLine();
         scan.next();
        System.out.println("Phone: ");
         scan.next();
        String input5 = scan.nextLine();
    String input = "{\"employeeId\":"+input1+",\n" +
"  \"firstName\": \"Kenta\",\n" +
"  \"lastName\": \"Shikata\",\n" +
"  \"email\": \"shikatakenta@gmail.com\",\n" +
"  \"phone\": \"222\"\n" +
"}";
        System.out.println(input);
        Post.Create(input);
        break;




    case "d":
 
        break;
    case "e":

        break;
    case "f":

        break;
    case "?":
            System.out.println("Command Options: ");
            System.out.println("a: Geek's Name");
            System.out.println("b: Num Questions Asked");
            System.out.println("c: All Numbers Are the Same");
            System.out.println("d: Sum Between Two Integers");
            System.out.println("e: Repeat the String");
            System.out.println("f: It is Palindrome");
            System.out.println("?: Display");
            System.out.println("q: Quit");
            break;
        }  }while (choice != "q");

}
}