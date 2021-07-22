import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		double answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			String s = st.nextToken();
			
			answer += s.equals("0") ? 2 : (1 / Double.parseDouble(s));
		}
		System.out.print(answer);
	}
}
