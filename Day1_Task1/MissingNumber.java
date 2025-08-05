public class MissingNumber{
    public static void main(String args[]){
        int arr[] = {1,2,3,5,6,7};
        int missingNumber = 0;
        for(int i=0;i<arr.length;i++){
            missingNumber ^= (arr[i]^(i+1));
        }
        missingNumber ^= arr.length+1;

        System.out.println("Missing Number is "+ missingNumber);
    }
}