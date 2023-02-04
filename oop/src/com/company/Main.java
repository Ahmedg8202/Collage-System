package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Person> a = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;

        do {


               System.out.println("\n\n=====================================================================");
               System.out.println("                      FACULTY MANAGEMENT SYSTEM                      ");
               System.out.println("=====================================================================");
               System.out.println("==================");
               System.out.println("  MAIN MENU");
               System.out.println("==================");
               System.out.println("1. ADD A PERSON");
               System.out.println("2. EDIT PERSON'S INFORMATION");
               System.out.println("3. SEARCH FOR A PERSON");
               System.out.println("4. DELETE A PERSON");
               System.out.println("5. DISPLAY PERSON'S INFORMATION");
               System.out.println("6. EXIT");
               System.out.println("Select Your Option (1-6): ");
               ch = sc.next().charAt(0);


            switch (ch) {
                case '1':
                    try {
                        System.out.println("1. ADD A STUDENT");
                        System.out.println("2. ADD AN ADMINISTRATOR");
                        System.out.println("3. ADD AN INSTRUCTOR");
                        System.out.println("4. ADD A TECHNICAL");
                        System.out.println("5. ADD A WORKER");
                        System.out.println("Select Your Option (1-5): ");
                        ch = sc.next().charAt(0);
                    } catch (Exception e) {
                        System.out.println("Your Code have a logical error");
                    }
                    switch (ch) {
                        case '1':
                            try {
                                Person s = new Student();
                                s.add();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;
                        case '2':
                            try {
                                Employee a = new Administrator();
                                a.add();
                                break;
                            }
                            catch (Exception e) {

                                 System.out.println("Your Code have a logical error");
                            }
                            break;
                        case '3':
                            try {
                                Employee t = new Instructor();
                                t.add();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;
                        case '4':
                            try {
                                Employee c = new Technical();
                                c.add();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;
                        case '5':
                            try {
                                Employee w = new Worker();
                                w.add();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;


                    }
                    break;
                case '2':
                    try {
                        System.out.println("1. EDIT FOR STUDENT'S INFORMATION");
                        System.out.println("2. EDIT FOR ADMINISTRATOR'S INFORMATION");
                        System.out.println("3. EDIT FOR INSTRUCTOR'S INFORMATION");
                        System.out.println("4. EDIT FOR TECHNICIAN'S INFORMATION");
                        System.out.println("5. EDIT FOR WORKER'S INFORMATION");
                        System.out.println("Select Your Option (1-5): ");
                        ch = sc.next().charAt(0);
                    } catch (Exception e) {
                        System.out.println("Your Code have a logical error");
                    }
                    switch (ch) {
                        case '1':
                            try {
                                Person s = new Student();
                                s.edit();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '2':
                            try {
                                Employee a = new Administrator();
                                a.edit();
                                break;
                            }
                            catch (Exception e) {

                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '3':
                            try {
                                Employee t = new Instructor();
                                t.edit();
                                break;
                            } catch (Exception e) {

                                System.out.println("Your Code have a logical error");
                            }

                            break;

                        case '4':
                            try {
                                Employee c = new Technical();
                                c.edit();
                                break;
                            } catch (Exception e) {

                                System.out.println("Your Code have a logical error");
                            }

                            break;

                        case '5':
                            try {
                                Employee w = new Worker();
                                w.edit();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }

                            break;

                    }
                    break;

                case '3':
                    try {
                        System.out.println("1. SEARCH FOR STUDENT");
                        System.out.println("2. SEARCH FOR ADMINISTRATOR");
                        System.out.println("3. SEARCH FOR INSTRUCTOR");
                        System.out.println("4. SEARCH FOR TECHNICIAN");
                        System.out.println("5. SEARCH FOR WORKER");
                        System.out.println("Select Your Option (1-5): ");
                        ch = sc.next().charAt(0);
                    } catch (Exception e) {
                        System.out.println("Your Code have a logical error");
                    }
                    switch (ch) {
                        case '1':
                            try {
                                Person s = new Student();
                                s.search();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '2':
                            try {
                                Employee a = new Administrator();
                                a.search();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '3':
                            try {
                                Employee t = new Instructor();
                                t.search();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '4':
                            try {
                                Employee c = new Technical();
                                c.search();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '5':
                            try {
                                Employee w = new Worker();
                                w.search();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                    }
                    break;

                case '4':
                    try {
                        System.out.println("1. DELETE A STUDENT");
                        System.out.println("2. DELETE AN ADMINISTRATOR");
                        System.out.println("3. DELETE AN INSTRUCTOR");
                        System.out.println("4. DELETE A TECHNICAL");
                        System.out.println("5. DELETE A WORKER");
                        System.out.println("Select Your Option (1-5): ");
                        ch = sc.next().charAt(0);
                    } catch (Exception e) {
                        System.out.println("Your Code have a logical error");
                    }
                    switch (ch) {
                        case '1':
                            try {
                                Person s = new Student();
                                s.delete();
                                break;
                            } catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '2':
                            try {
                                Employee a = new Administrator();
                                a.delete();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '3':
                            try {
                                Employee t = new Instructor();
                                t.delete();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '4':
                            try {
                                Employee c = new Technical();
                                c.delete();
                                break;
                            }
                            catch (Exception e) {
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                        case '5':
                            try {

                                Employee w = new Worker();
                                w.delete();
                                break;
                            }
                            catch (Exception e){
                                System.out.println("Your Code have a logical error");
                            }
                            break;

                    }
                    break;
                case '5':
                    try {
                        for (int i = 0; i < Person.a.size(); i++) {
                            Person.a.get(i).display();
                            System.out.println();
                        }
                    }
                    catch (Exception e) {

                        System.out.println("Your Code have a logical error");
                    }
                    break;

                case '6':
                    break;
                default:
                    System.out.println("SORRY,INVALID OPTION.....SELECT OPTION AGAIN");


            }
        } while (ch != '6');
        sc.close();
    }
}
