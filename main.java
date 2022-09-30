import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        StringBuffer strBuffer = new StringBuffer(str);
        String[] words = str.split("\\s*(\\s)\\s*");
        int count = 0;
        String result = null;
        for(String word : words){
            result = word.replaceAll("[^a-zA-Z]", "");
            if(result.equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}