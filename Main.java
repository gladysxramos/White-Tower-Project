/*=============================================================================
 |   Assignment:  White Tower Project
 |       Author:  Gladys Ramos
 |      Partner:  Jared Gonzalez
 |
 |  Course Name:  AP Computer Science Principles 
 |   Instructor:  Jonathan Virak 
 |     Due Date:  Friday, May 23, 2025 at 11:59 PM PST 
 |
 |  Description:  For our White Tower Project, we decided to tackle the issue of getting food for CAMS Students. 
 |
 |     Language:  [ Java version 8]
 |                
 *===========================================================================*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    
    // method that uses binary sort and recurssion to search for the users account, created using existing code from CSA JAVA course
    public static int searchList(ArrayList<Userinfo> userList, String targetUser, String targetPassword, int low, int high){
        // sorts the list lexigraphically before continuing
        userList.sort((a, b) -> a.getUsername().compareTo(b.getUsername()));
        
        if (low > high){
            return -1;
        }

        int mid = (low + high) / 2;
        
        if (userList.get(mid).getUsername().equals(targetUser)) {
            if (userList.get(mid).getPassword().equals(targetPassword)) {
                return mid; 
            }
            return -1; 
        }
        
        if (userList.get(mid).getUsername().compareTo(targetUser) > 0) {
            return searchList(userList, targetUser, targetPassword, low, mid - 1);
        }
        
        return searchList(userList, targetUser, targetPassword, mid + 1, high);
    }

    // login function where the user enters their username and password
    public static int login(ArrayList<Userinfo> userList){
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Enter your username: ");

        username = sc.next();
        System.out.println("Enter your password: ");
        password = sc.next();

        System.out.println();
        System.out.println("logging in...");
        System.out.println();
        // checks if the user exists by calling the searchList method
        int userIndex = searchList(userList, username, password, 0, userList.size() - 1);
        
        // returns output depending on if the user was found 
        if (userIndex == -1){
            System.out.println("Username not found or password incorrect. Please try again.");
        } else {
            System.out.println("Welcome " + username);
        }
        return userIndex;
    }


    // sign up function where the user can create their own account and password
    public static Userinfo signup(ArrayList<Userinfo> userList){
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        boolean usernameTaken;
        
        // use a do while loop so the user can enter something at least once
        do {
            usernameTaken = false;
            System.out.println("Enter a username: ");
            username = sc.next();
            
            // check if username already exists
            for (Userinfo user : userList) {
                if (user.getUsername().equals(username)) {
                    System.out.println("Username already taken. Please try a different username.");
                    usernameTaken = true;
                    break;
                }
            }
        } while (usernameTaken);
        

        System.out.println("Enter a password: ");
        password = sc.next();
        
        System.out.println();
        System.out.println("Thank you for signing up " + username);
        System.out.println();
        System.out.println("Please continue to the log in menu and log into your new account!");
        System.out.println();
        // return a new Userinfo object
        return new Userinfo(username, password);
    }

    public static void main(String[] args) {
    
        ArrayList<Userinfo> users = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int userInput;
        
        // create initial user data base
        users.add(new Userinfo("gladys123", "CSATEST123"));
        users.add(new Userinfo("jared123", "CSATEST1234"));
        users.add(new Userinfo("nirja123", "helloMynameisNirja"));
        users.add(new Userinfo("sarah.hur", "ILOVEALDC"));

        System.out.println("Welcome to this program!");
        System.out.println("This program is designed to provide CAMS students with food spots in the area!");
        System.out.println("Please choose to either log in or sign up");
        
        while (running){
            // have the user make initial selection using a try and except
            try {
                
                System.out.println("1. Log in");
                System.out.println("2. Sign up");
                userInput = sc.nextInt();
                System.out.println();
                if (userInput < 1 || userInput > 2) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter either 1 or 2.");
                System.out.println();
                sc.nextLine(); 
                continue;
            }

            // log in or sign up the user
            if(userInput == 1){
                int userIndex = login(users);
                if(userIndex != -1) {
                    // populate the lists
                    users.get(userIndex).populateLists();
                    users.get(userIndex).populateCorresponding();
          
                    while (running){
                        // print the lists
                        System.out.println();
                        System.out.println(users.get(userIndex));
                        System.out.println();
                        
                        // have user select a resturant to view
                        int selection = 0;
                        while (selection < 1 || selection > 10) {
                            try {
                                System.out.println("Please enter a number between 1 and 10: ");
                                System.out.println();
                                selection = sc.nextInt();
                                
                                if (selection < 1 || selection > 10) {
                                    throw new Exception();
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input! Please enter a valid number.");
                                System.out.println();
                                sc.nextLine(); 
                            }
                        }
               
                        ArrayList<Object> selectedPair = users.get(userIndex).getCorrespondingAreas().get(selection - 1);
                        Cuisine selectedFood = (Cuisine) selectedPair.get(0);
                        BusRoutes selectedBus = (BusRoutes) selectedPair.get(1);
                        System.out.println();
                        System.out.println("\nSelected Food Spot: " + selectedFood.getRestaurant());
                        System.out.println("Corresponding Bus Route: " + selectedBus.getBusName());
                        System.out.println();
    
                        // ask if they want to see more information
                        selection = 0;
                        while (selection < 1 || selection > 3) {
                            try {
                                System.out.println("\nWould you like to view more information on the restaurant, the bus route, or exit this program?");
                                System.out.println();
                                System.out.println("1. View bus information");
                                System.out.println("2. View restaurant information");
                                System.out.println("3. Exit");
                                System.out.println();
                                System.out.print("Enter your choice (1-3): ");
                                selection = sc.nextInt();
                                
                                if (selection < 1 || selection > 3) {
                                    throw new Exception();
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input! Please enter a valid number.");
                                sc.nextLine(); 
                            }
                        }

                        // use a switch case since more than 2 choices
                        switch (selection) {
                            case 1 -> {
                                System.out.println();
                                System.out.println("\nBus Route Information:");
                                System.out.println();
                                System.out.println("Route: " + selectedBus.getBusName());
                                System.out.println("Distance: " + selectedBus.getDistance() + " miles");
                            }
                            case 2 -> {
                                System.out.println();
                                System.out.println("\nRestaurant Information:");
                                System.out.println();
                                System.out.println("Name: " + selectedFood.getRestaurant());
                                System.out.println("Distance: " + selectedFood.getDistance() + " miles");
                                System.out.println("Cuisine: " + ((Cuisine) selectedFood).getTypeOfFood());
                            }
                            case 3 -> {
                                System.out.println("Thank you for using our program!");
                                 
                            }
                        }

                        // check if the user chose to exit or not
                        if (selection != 3){
                            selection = 0;
                            while (selection < 1 || selection > 2) {
                                try {
                                    System.out.println();
                                    System.out.println("Would you like to continue looking at food spots or exit the program?");
                                    System.out.println();
                                    System.out.println("1. Continue");
                                    System.out.println("2. Exit");
                                    System.out.println();
                                    System.out.print("Enter your choice (1 or 2): ");
                                    selection = sc.nextInt();
                                    
                                    if (selection < 1 || selection > 3) {
                                        throw new Exception();
                                    }
                                } catch (Exception e) {
                                    System.out.println("Invalid input! Please enter a valid number.");
                                    sc.nextLine(); 
                                }
                            }
    
                            if (selection == 2){
                                System.out.println("Thank you for using our program!");
                                running = false;
                            }
                        } else {
                            running = false;
                        }

                       
                    }
                }
                
            } else{
                Userinfo newUser = signup(users);
                users.add(newUser);
            }

           
        }
        
        

    }
}