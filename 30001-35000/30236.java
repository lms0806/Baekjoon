import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t --> 0){
            int n = Integer.parseInt(br.readLine());

            int before = 0, answer = 1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(n --> 0){
                int num = Integer.parseInt(st.nextToken());

                if(before == answer){
                    answer++;
                }
                if(num == answer){
                    answer++;
                }

                before = answer;
            }
            sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
