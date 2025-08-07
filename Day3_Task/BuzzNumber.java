import java.util.Scanner;
public class BuzzNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if((num%7 == 0) || (num%10 == 7)){
            System.out.println(String.format("Given number %d is a Buzz number",num));
        }
        else{
            System.out.println(String.format("Given number %d is not a Buzz number",num));
        }
        
    }
}