import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        int auto_num=random.nextInt(100)+1;
        int chance=0;

        boolean gas=false;
        System.out.println("Wlcome to Number Guessing Game !");
        System.out.println("i have a number in range of  100 try to guess");
        while(!gas){
            System.out.println("enter your number");
            int userinp = sc.nextInt();
            chance++;
            if(userinp==auto_num){
                System.out.println("congratulation , you goted ");
                gas=true;

            }
            // else System.out.println(auto_num);
            else if(userinp>auto_num){
                System.out.println("no .. your num is bigger");
            }
            else
            {
                System.out.println("your number is lower");
            }

            

        }
        sc.close();
    }
}
