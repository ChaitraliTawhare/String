public class LargestString {
    public static void main(String args[]){
        String str1="Apple";
        String str2="Banana";
        String str[]={"Apple","Banana","grapes","mango"};

        if(str1.compareToIgnoreCase(str2) ==0){
            System.out.println("strings are same or identical");
        }
        else if(str1.compareToIgnoreCase(str2)<0){
            System.out.println("Largest String is : "+str2);
        }
        else{
            System.out.println("largest string is :"+str1);
        }

        System.out.println(largest(str));

    }

    // if there is String array the following approch is used to find out largest:
    public static String largest(String[] str3){
        String largest=str3[0];
        for (int i=1;i<str3.length;i++){
            if(largest.compareToIgnoreCase(str3[i])<0){
                largest=str3[i];

            }
            

        }
        return largest;
    }
}
