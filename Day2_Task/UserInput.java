import java.util.Scanner;
import java.lang.*;
public class UserInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter strings");
        String strArray[] = new String[size];
        for(int i=0;i<size;i++){
            strArray[i] = sc.next();
        }
        System.out.print("Enter string to check whether it is in the array or not: ");
        String str = sc.next();
        boolean isFound = false;

        for(int i=0;i<size;i++){
            if(strArray[i].equals(str)){
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println(String.format("Given String %s is in the array.", str));
        }
        else{
             System.out.println(String.format("Given String %s is not in the array.", str));
        }

    }
}