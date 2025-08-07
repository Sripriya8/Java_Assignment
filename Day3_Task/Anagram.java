import java.util.Scanner;
public class Anagram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1: ");
        String str1 = sc.nextLine().toLowerCase().replaceAll("\\s","");
        System.out.print("Enter String2: ");
        String str2 = sc.nextLine().toLowerCase().replaceAll("\\s","");

        int arr[] = new int[26];
        if(str1.length() != str2.length()){
            System.out.println("Given strings are not Anagram");
        }
        else{
            boolean flag = true;
            for(int i=0; i<str1.length(); i++){
                int index1 = -1;
                int index2 = -1;
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                
                index1 = ch1-'a';
                index2 = ch2-'a';

                if(index1>=0 && index1<26)   arr[index1]++;
                if(index2>=0 && index2<26)   arr[index2]--;
            }
            for(int i=0;i<26;i++){
                if(arr[i] != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Given strings are Anagram");
            }
            else{
                System.out.println("Given strings are not Anagram");
            }
        }
    }
}