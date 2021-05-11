import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.print(a > b ? sum(a,b) : sum(b,a));
	}
	
	public static String sum(int a, int b) {
		String str = "";
		while(a != 0) {
			str = (a%10 + b%10) + str;
			a/=10;
			b/=10;
		}
		return str;
	}
}
