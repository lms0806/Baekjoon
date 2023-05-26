import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        System.out.print(solve(arr, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }

    public static String solve(int[] arr, int u, int d){
        char[] result = new char[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1 && u > 0){
                u--;
                result[i] = 'U';
            }
            else if(arr[i] == 2 && d > 0) {
                d--;
                result[i] = 'D';
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 3){
                if(u > 0){
                    u--;
                    result[i] = 'U';
                }
                else if(d > 0){
                    d--;
                    result[i] = 'D';
                }
                else{
                    return "NO";
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("YES\n");
        for(char c : result){
            if(c == '\u0000'){
                return "NO";
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
