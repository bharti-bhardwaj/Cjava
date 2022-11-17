import java.util.Scanner;

public class bha_05_practiceSet_01 {
    public static void main(String[] args) {
        //Question 1
       // System.out.println("enter number");
         //int a =2;
        // int b =3;
         //int c =4;
         //int sum=a+ b+c;
        //System.out.println(sum);

        //Question 2   obtained_marks total_marks percentage
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter obtained marks");
        float obtained_marks =sc.nextFloat();

        System.out.println("Enter total marks");
        float total_marks =sc.nextFloat();

        float percentage =(float) (obtained_marks *100)/total_marks;
        System.out.println(percentage);




    }
}
