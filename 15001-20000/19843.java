import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());

        boolean[] check = new boolean[120];

        while(n --> 0){
            st = new StringTokenizer(br.readLine());
            int start = time(st.nextToken()) + Integer.parseInt(st.nextToken());
            int end = time(st.nextToken()) + Integer.parseInt(st.nextToken());

            for(int i = start; i < end; i++){
                check[i] = true;
            }
        }

        int answer = 0;
        for(boolean c : check){
            answer += c ? 1 : 0;
        }

        System.out.print(t - answer > 48 ? -1 : Math.max(t - answer, 0));
    }

    public static int time(String s){
        return s.equals("Mon") ? 0 : s.equals("Tue") ? 24 : s.equals("Wed") ? 48 : s.equals("Thu") ? 72 : 96;
    }
}
