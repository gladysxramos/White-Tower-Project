import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    

    public static int searchList(ArrayList<Userinfo> userList, String targetUser, String targetPassword, int low, int high){
        if (low > high){
            return -1;
        }

        int mid = (low + high) / 2;
        
        // Check if username matches
        if (userList.get(mid).getUsername().equals(targetUser)) {
            // If username matches, check password
            if (userList.get(mid).getPassword().equals(targetPassword)) {
                return 1; // Both username and password match
            }
            return -1; // Username matches but password doesn't
        }
        
        // If username is lexicographically smaller, search left half
        if (userList.get(mid).getUsername().compareTo(targetUser) > 0) {
            return searchList(userList, targetUser, targetPassword, low, mid - 1);
        }
        
        // If username is lexicographically larger, search right half
        return searchList(userList, targetUser, targetPassword, mid + 1, high);
    }

    public static void login(ArrayList<Userinfo> userList){
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Enter your username: ");

        username = sc.next();
        System.out.println("Enter your password: ");
        password = sc.next();

        System.out.println("logging in...");

        int loggedIn = searchList(userList, username, password, 0, userList.size());
        
        if (loggedIn == -1){
            System.out.println("Username not found or password incorrect. Please try again.");
        } else {
            System.out.println("Welcome " + username);
        }
    }

    public static Userinfo signup(ArrayList<Userinfo> userList){
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        boolean usernameTaken;
        
        do {
            usernameTaken = false;
            System.out.println("Enter a username: ");
            username = sc.next();
            
            // Check if username already exists
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
        
        System.out.println("Thank you for signing up " + username);
        return new Userinfo(username, password);
    }

    public static void main(String[] args) {
        ArrayList<Userinfo> users = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int userInput;
        
        // add user data
        users.add(new Userinfo("gladys123", "CSATEST123"));
        users.add(new Userinfo("jared123", "CSATEST1234"));
        users.add(new Userinfo("nirja123", "helloMynameisNirja"));
        users.add(new Userinfo("sarah.hur", "ILOVEALDC"));

        while (running){
            try {
                System.out.println("Welcome to this program!");
                System.out.println("1) Log in \n2) Sign up");
                userInput = sc.nextInt();
                if (userInput < 1 || userInput > 2) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter either 1 or 2.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }

            if(userInput == 1){
                login(users);
                
            } else{
                Userinfo newUser = signup(users);
                users.add(newUser);
            }

            
        }
        
        

    }
}