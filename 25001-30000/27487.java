import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	int n = Integer.parseInt(br.readLine());
        	
        	int[] arr = new int[n];
        	
        	int two_count = 0;
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int i = 0; i < n; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        		
        		if(arr[i] == 2) {
        			two_count++;
        		}
        	}
        	
        	if(two_count == 0) {
        		sb.append(1);
        	}
        	else if(two_count % 2 == 1) {
        		sb.append(-1);
        	}
        	else {
        		int num = 0;
        		for(int i = 0; i < n; i++) {
        			if(arr[i] == 2) {
        				num++;
        			}
        			
        			if(two_count / 2 == num) {
        				sb.append(i + 1);
        				break;
        			}
        		}
        	}
        	
        	sb.append("\n");
        }
        System.out.print(sb);
    }
}
