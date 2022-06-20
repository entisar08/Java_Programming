package day23_arrayListandCollection;

public class test1 {

    public static void main(String[] args) {
        String str="group3project";
        int x= getNumber(str);
        System.out.println(x);
    }
    public static int getNumber(String str){
        str = str.toLowerCase();
        String temp = "";
        String output = "";
        for (char ch:str.toCharArray()){
            if (!temp.contains(ch+"")){
                temp+=ch;
            } else if (!output.contains(ch+"")){
                output +=ch;
            }
        }
        return output.length();
    }


}
