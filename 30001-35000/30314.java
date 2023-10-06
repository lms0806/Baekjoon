import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        String a = br.readLine(), b = br.readLine();

        int answer = 0;
        for(int i = 0; i < a.length(); i++){
            char ca = a.charAt(i), cb = b.charAt(i);

            int num = 0;
            if(ca < cb){
                num = Math.min(ca - 'A' + 'Z' - cb + 1,cb - ca);
            }
            else{
                num = Math.min('Z' - ca + cb - 'A' + 1, ca - cb);
            }
            answer += num;
        }
        System.out.print(answer);
    }
}
