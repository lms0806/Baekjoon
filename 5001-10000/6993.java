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
			String str = st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			sb.append("Shifting ").append(str).append(" by ").append(n).append(" positions gives us: ").append(str.substring(str.length()-n)).append(str.substring(0,str.length()-n)).append("\n");
		}
		System.out.print(sb);
	}
}
