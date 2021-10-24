import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		double answer = 0;
		for(int i = l; i < n - h; i++) {
			answer += num[i];
		}
		System.out.print((double)(answer / (n - l - h)));
	}
}
