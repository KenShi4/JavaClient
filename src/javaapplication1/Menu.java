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
class Menu
{
    
    public static void main(String args[])
    {
        String choice = "-1";
        
        do
        {
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
            choice = scan.nextLine();

            switch (choice)
            {
                case "a":
                 Methods.Get();
                    break;
                case "b":
                Methods.GetId();
                    break;
                case "c":
                Methods.Create();
                    break;

                case "d":
                Methods.Delete();
                    break;
                case "e":
                //Methods.Update();
                    break;
                case "f":
                Methods.Update();
                    break;
                case "?":
                    System.out.println("Scegli il comando: ");
                    System.out.println("a: Get all Employees");
                    System.out.println("b: Get Employee");
                    System.out.println("c: Create Employee");
                    System.out.println("d: Delete Employee");
                    System.out.println("e: Patch Employee");
                    System.out.println("f: Update Employee");
                    System.out.println("?: Display");
                    System.out.println("q: Quit");
                    break;
            }
        }while (!choice.equals("q"));
    }
}