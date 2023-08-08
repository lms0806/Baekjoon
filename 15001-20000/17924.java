import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[1001];

        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        for(int t = 0; t < size; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

            min = Math.max(min, a);
            max = Math.min(max, b);

            for(int i = a; i <= b; i++){
                arr[i]++;
            }
        }

        String answer = "edward is right";
        for(int i = min; i <= max; i++){
            if(arr[i] == size){
                answer = "gunilla has a point";
                break;
            }
        }
        System.out.print(answer);
    }
}
