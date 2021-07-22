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
			
			sb.append(Integer.parseInt(st.nextToken()) < Integer.parseInt(st.nextToken()) ? "NO" : "MMM").append(" BRAINS").append("\n");
		}
		System.out.print(sb);
	}
}
