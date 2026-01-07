import java.util.Scanner;

public class basiccc {
    public static void whichWeekDay(int day) {
        switch (day) {
            case 0:
            System.out.println("Sunday");
            break;
            case 1:
                System.out.println("Monaday");
            break;
            case 2:
                System.out.println("Tuesday");
            break;
            case 8:
                System.out.println("Invalid");
            break;
        
            default:
                break;
        }
        }
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Case");
            int InputCase = sc.nextInt();
            whichWeekDay(InputCase);

        }
}