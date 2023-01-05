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
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	st = new StringTokenizer(br.readLine());
        	int choice = Integer.parseInt(st.nextToken());
        	int l = Integer.parseInt(st.nextToken()) - 1, r = Integer.parseInt(st.nextToken());
        	
        	if(choice == 1) {
        		for(int i = l; i < r; i++) {
        			arr[i] = arr[i] * arr[i] % 2010;
        		}
        	}
        	else {
        		int sum = 0;
        		for(int i = l; i < r; i++) {
        			sum += arr[i];
        		}
        		sb.append(sum).append("\n");
        	}
        }
        System.out.print(sb);
    }
}
