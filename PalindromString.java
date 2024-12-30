import java.util.*;
public class PalindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //string as input
        System.out.print("Enter a String:");
        String  str=sc.next();

        //function call
        if(checkPalindrom(str)){
            System.out.println("given string is palindrom");
        }
        else{
            System.out.println("given string is not palindrom");
        }

    }
    public static boolean checkPalindrom(String str){
        int start=0;
        int end = str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;

            }
            return true;
        }

    

    }


