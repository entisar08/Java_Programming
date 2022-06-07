package day14_forLoop;

public class rasktest {
    public static void main(String[] args) {
        String text = "asdfaghfkk";
        String result = "";
        for (int i = 0; i < text.length()-1; i++) {
            if (!result.contains(text.charAt(i)+"")){
                result += text.charAt(i);
            }
        }
        System.out.println(result);
    }
}
