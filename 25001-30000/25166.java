import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static String solve(int s, int m) {
		int[] coin = new int[10];
		
		while(true) {
			int count = 0;
			for(int i = coin.length - 1; i >= 0; i--) {
				if(s >= Math.pow(2, i) && coin[i] == 0) {
					s -= Math.pow(2, i);
					coin[i]++;
					break;
				}
				count++;
			}
			
			if(count == coin.length) {
				break;
			}
		}
		
		return s == 0 ? "No thanks" : s - m == 0 ? "Thanks" : "Impossible";
	}
}
