public class newStringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("");
        for(char ch ='a';ch<='z';ch++){
            str.append(ch+ " ");
        }
        System.out.println(str);

    }

}
// stringbuilder is same as strings but strings are immutable and Stringbuilder is mutable
// means id you modify the string 'String' creates new string for that modification
//but stringBuilder modifies the same string and does not create new String;
//All functions of strings are used in Stringbuilder and stringbuilder also has 
//its own functions;