public class AlphanumericCharString {
    public static void main(String args[]){
        String str="ap53k6w3";
        System.out.println(numberSum(str));

    }
    public static int numberSum(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
           char ch =str.charAt(i);
            
                if(Character.isDigit(ch)){
                    sum=sum+Character.getNumericValue(ch);
                }

            

        }
        return sum;
        
    }

}
