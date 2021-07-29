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
			int count = 9;
			int a = 0, b = 0;
			while(count --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				a += Integer.parseInt(st.nextToken());
				b += Integer.parseInt(st.nextToken());
			}
			sb.append(a > b ? "Yonsei" : a == b ? "Draw" : "Korea").append("\n");
		}
		
		System.out.print(sb);
	}
}
