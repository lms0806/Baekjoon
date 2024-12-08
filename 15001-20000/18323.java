import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n - 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n - 1; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] answer = new int[n];
        boolean[] check;
        for(int i = 1; i < arr[0]; i++) {
        	check = new boolean[5001];
        	answer[0] = i;
        	check[i] = true;
        	boolean flag = true;
        	
        	for(int j = 1; j < n; j++) {
        		answer[j] = arr[j - 1] - answer[j - 1];
        		if(answer[j] <= 0 || check[answer[j]]) {
        			flag = false;
        			break;
        		}
        		check[answer[j]] = true;
        	}
        	
        	if(flag) {
        		break;
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        for(int a : answer) {
        	sb.append(a).append(" ");
        }
        System.out.print(sb);
    }
}
