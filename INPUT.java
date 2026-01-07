import java.util.Scanner;

class INPUT {
    public static void studentGrade(int marks) {
        if (marks >= 90 ){
            System.out.println("Grade A");
        }
        else if(marks>=70){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks");
        int inputMarks = sc.nextInt();

        studentGrade(inputMarks);
        sc.close();
    }
}