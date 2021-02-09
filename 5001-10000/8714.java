import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
        	StringBuilder sb = new StringBuilder();
		if(size-sum > sum) {
			sb.append(sum);
		}
		else {
			sb.append(size-sum);
		}
        	System.out.print(sb);
	}
}
