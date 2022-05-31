import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 1;
        StringBuilder sb = new StringBuilder();
        while(true) {
        	int t = Integer.parseInt(br.readLine());
        	
        	if(t == 0) {
        		break;
        	}
        	
        	int[] arr = new int[t];
        	int sum = 0;
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int i = 0; i < t; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        		sum += arr[i];
        	}
        	
        	sum /= t;
        	
        	int answer = 0;
        	for(int i = 0; i < t; i++) {
        		if(arr[i] > sum) {
        			answer += (arr[i] - sum);
        		}
        	}
        	sb.append("Set #").append(count).append("\n");
        	sb.append("The minimum number of moves is ").append(answer).append(".\n\n");
        	count++;
        }
        System.out.print(sb);
    }
}
