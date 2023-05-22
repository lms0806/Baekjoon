import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] alpha = new boolean[26];

        for(char c : br.readLine().toCharArray()){
            alpha[c - 'A'] = true;
        }

        System.out.print(alpha[1] && alpha[8] && alpha[12] && alpha[14] && alpha[18] ? "YES" : "NO");
    }
}
