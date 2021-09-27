import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[100001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[Integer.parseInt(st.nextToken())]++;
		}
		
		System.out.print(solve(num, n));
	}
	
	public static int solve(int[] num, int n) {
		for(int i = n; i >= 0; i--) {
			if(num[i] == i) {
				return i;
			}
		}
		return -1;
	}
}
