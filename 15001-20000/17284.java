import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static Integer[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = 5000;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			num -= n == 1 ? 500 : n == 2 ? 800 : 1000;
		}
		System.out.print(num);
	}
}
