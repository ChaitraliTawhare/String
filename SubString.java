import java.util.*;
public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str= sc.nextLine();
        System.out.print("give starting and ending index respectively : ");
        int start=sc.nextInt();
        int end=sc.nextInt(); 
        substring(str, start, end);       
    }
    // in java there is an inbuild function for printing substring :

    // str.substring(starting index,ending index)

    //user defined function:
    public static void substring(String str,int start,int end){
        for(int i=start;i<end;i++){
            System.out.print(str.charAt(i)+ " ");
        }
        

    }

}
