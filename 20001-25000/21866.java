import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String str) {
		StringTokenizer st = new StringTokenizer(str);
		
		int num = 100;
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(i%2 == 0 && i != 0) {
				num += 100;
			}
			sum += n;
			if(n > num) {
				return "hacker";
			}
		}
		return sum < 100 ? "none" : "draw";
	}
}
