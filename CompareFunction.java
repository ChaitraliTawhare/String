public class CompareFunction {
    public static void main(String[] args) {
        String str="chaitrali";
        String str2="chaitrali";
        String str3 = new String("chaitrali");

        //comparison using == operator;
        if(str==str2){
            System.out.println("string are identical");
        }
        else{
            System.out.println("strings are not identical");
        }
        // You cannot using "==" operator here because new keyword creates new string object so even though the content
        //is same.
//
// if(str==str3){
//    System.out.println("strings are identical");
//}
//else {
//    System.out.println("strings are not identical");
//}
        //for thid purpose java has function call .equal
        if(str.equals(str3)){
            System.out.println("strings are identical ");
        }
        else{
            System.out.println( "Strings are not identical");
        }
        
        }

    }


