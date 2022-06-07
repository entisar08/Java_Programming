package day15_whileLoop;

public class countJava3 {
    public static void main(String[] args) {

        String sentence = "My favorite programming language is Java, I love jAva, JAVA java java is cool";
        sentence = sentence.toLowerCase();
        int l=sentence.length();
        String ysen=sentence.replace("java","umran");
        int l1 =ysen.length();
        int frequencyJava=l1-l;
        System.out.println(frequencyJava);
    }
}
