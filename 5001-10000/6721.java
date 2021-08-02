import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			StringBuilder a = new StringBuilder(st.nextToken()).reverse(), b = new StringBuilder(st.nextToken()).reverse();
			
			int n = Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
			StringBuilder c = new StringBuilder(Integer.toString(n)).reverse();
			
			sb.append(Integer.parseInt(c.toString())).append("\n");
		}
		System.out.print(sb);
	}
}
