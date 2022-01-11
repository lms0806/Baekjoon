import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int sum = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		
		System.out.print(sum);
	}
	
	public static void solve(int a, int b) {
		int num = 1, count = 0;
		while(true) {
			for(int i = 1; i <= num; i++) {
				count++;
				if(count >= a && count <= b) {
					sum += num;
				}
				if(count > b) {
					return;
				}
			}
			num++;
		}
	}
}
