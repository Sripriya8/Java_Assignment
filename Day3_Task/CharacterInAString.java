import java.util.Scanner;
public class CharacterInAString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "Hello, world!";
        System.out.print("Enter Character to check whether it is in the String or not : ");
        char ch = sc.next().charAt(0);
        boolean isFound = false;
        for(char x:str.toCharArray()){
            if(x==ch){
                isFound = true;
                System.out.println(String.format("Yes, the given character '%c' is in the String '%s'.",ch,str));
                break;
            }
        }
        if(!isFound){
            System.out.println(String.format("No, the given character '%c' is not in the String '%s'.",ch,str));
        }
    }
}