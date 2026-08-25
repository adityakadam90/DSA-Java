import java.lang.reflect.Array;
import java.util.Arrays;

public class anagramStr{
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "act";
        char ch [] = s1.toCharArray();
        Arrays.sort(ch);
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch2);
        if(Arrays.equals(ch,ch2)){
            System.out.println("anagrams");
        }else {
            System.out.println("not anagrams.");
        }
    }
}