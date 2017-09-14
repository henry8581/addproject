import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	       Scanner input=new Scanner (System.in);
           int number1, number2 , sum;
           System .out.print("First:");
           number1=input.nextInt();
           System .out.print("twice:");
           number2=input.nextInt();
           sum=number1+number2;
           System .out.printf("%d+%d=%d", number1, number2,sum);
           input.close();




    }
}
