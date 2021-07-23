import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static Integer[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			num[Integer.parseInt(st.nextToken()) - 1]++;
		}
		
		for(int i = 0; i < n; i++) {
			if(num[i] == 0) {
				System.out.print(i + 1);
				break;
			}
		}
	}
}
