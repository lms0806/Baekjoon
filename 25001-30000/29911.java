import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n], sum = new int[n];
        
        for(int i = 0; i < n; i++) {
        	arr[i] = sum[i] = Integer.parseInt(br.readLine());
        	
        	if(i > 0) {
        		sum[i] += sum[i - 1];
        	}
        }
        
        int answer = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
        	int a = sum[n - 1] - sum[i];
        	int b = sum[i];
        	
        	int num = a > b ? a - b : b - a;
        	
        	if(num >= 0 && min > num) {
        		min = num;
        		answer = i + 1;
        	}
        }
        System.out.print(answer);
    }
}
