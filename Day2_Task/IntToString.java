import java.util.Scanner;
public class IntToString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String numToString = String.valueOf(num);

        System.out.print("Enter a number as string: ");
        String str = sc.next();
        int stringToNum = Integer.parseInt(str);

        System.out.println(String.format("Number that converted to String is %s",numToString));
        System.out.println(String.format("String that converted to Number is %d",stringToNum));
        
    }
}