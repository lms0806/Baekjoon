import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		
		System.out.print(solve(Integer.parseInt(a)) && solve(Integer.parseInt(st.nextToken()+a)) ? "Yes" : "No");
	}
	
	public static boolean solve(int a) {

		for(int i = 2; i < a/2; i++) {
			if(a%i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
