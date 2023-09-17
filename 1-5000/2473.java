import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        long[] arr = new long[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	arr[i] = Long.parseLong(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        long[] answer = new long[3];
        answer[0] = arr[0];
        answer[1] = arr[1];
        answer[2] = arr[2];
        
        long min = Math.abs(arr[0] + arr[1] + arr[2]);
        for(int i = 0; i < n; i++) {
        	int s = 0, e = n - 1;
        	while(s < e) {
        		if(s == i) {
        			s++;
        		}
        		else if(e == i) {
        			e--;
        		}
        		else {
        			long sum = arr[s] + arr[i] + arr[e];
        			
        			if(Math.abs(sum) < min) {
        				min = Math.abs(sum);
        				answer[0] = arr[s];
        				answer[1] = arr[i];
        				answer[2] = arr[e];
        			}
        			if(sum < 0) {
        				s++;
        			}
        			else if(sum > 0) {
        				e--;
        			}
        			else {
        				break;
        			}
        		}
        	}
        }
        
        Arrays.sort(answer);
        
        StringBuilder sb = new StringBuilder();
        for(long a : answer) {
        	sb.append(a).append(" ");
        }
        System.out.print(sb);
    }
}
