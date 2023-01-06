import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
        	int num = Integer.parseInt(br.readLine());
        	arr[num - 1] = i + 1;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int a : arr) {
        	sb.append(a).append("\n");
        }
        System.out.print(sb);
    }
}
