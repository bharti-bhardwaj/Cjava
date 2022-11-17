import java.util.Scanner;
public class bha_05_takingInput {
    public static void main(String[] args) {  //main click enter
        System.out.println("Taking Input from the user");  //enter sout and then click enter
        Scanner sc =new Scanner(System.in); //creating a object of Scanner class
                                            //System.in means reading input from the keyboard
        System.out.println("Enter no 1");
        //int a =sc.nextInt();   //taking a integer value it's a method of Scanner class
        float f1 =sc.nextFloat();
        System.out.println("Enter no 2");
        //int b =sc.nextInt();
        float f2 =sc.nextFloat();
       // int sum = a+b;
        float sum =f1+f2;
        System.out.println("The sum these number is :");
        System.out.println(sum);


        boolean b1 = sc.hasNext();
        System.out.println(b1);

        String str =sc.nextLine();
        System.out.println(str);

    }
}
