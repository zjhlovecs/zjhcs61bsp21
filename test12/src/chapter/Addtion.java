package chapter;
import java.util.Scanner;
public class Addtion {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        int number1,number2,sum;
        System.out.println("input first number:");
        number1=input.nextInt();
        System.out.println("input second number:");
        number2=input.nextInt();
        sum=number1+number2;
        System.out.println(sum);


    }

}
