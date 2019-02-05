/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        
        String greetings = name.nextLine();
        if(greetings.equals("Bob") || greetings.equals("Alice")) {
            System.out.println("Hello " + greetings);}
            else {
                System.out.println("You are not the Bob or Alice");}
        
    }
}
