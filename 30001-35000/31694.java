import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int suma = 0, sumb = 0;
	static int[] counta = new int[11], countb = new int[11];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			
			suma += a;
			counta[a]++;
		}
		
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int b = Integer.parseInt(st.nextToken());
			
			sumb += b;
			countb[b]++;
		}
		
		System.out.print(solve());
	}
	
	public static String solve() {
		if(suma > sumb) {
			return "Algosia";
		}
		else if(suma < sumb) {
			return "Bajtek";
		}
		
		for(int i = 10; i > 0; i--) {
			if(counta[i] > countb[i]) {
				return "Algosia";
			}
			else if(counta[i] < countb[i]) {
				return "Bajtek";
			}
		}
		
		return "remis";
	}
}
