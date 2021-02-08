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
		int c = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a; i++) {
			int num = Integer.parseInt(br.readLine());
			if((b*b)+(c*c) >= num*num) {
				sb.append("DA").append("\n");
			}
			else {
				sb.append("NE").append("\n");
			}
		}
		System.out.print(sb);
	}
}
