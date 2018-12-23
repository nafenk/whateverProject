import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        System.out.println("finally i learned how to use github!! ");
        Scanner mspacman = new Scanner(System.in);

        System.out.println("hey whatsup!! ");
        String greetings = mspacman.nextLine();

        if (!greetings.equals("hi")) {
            System.out.println("dude don't be rude!");
        } else if (greetings.equals("hi")) {
            System.out.println("what are you doing?");
            String action = mspacman.nextLine();
            if (action.equals("studying"))
                System.out.println("you nerd, get a life haha just kidding, good job");
            else {
                System.out.println("stop procrastinating and start studying for exams");

            }

        }


    }
}

