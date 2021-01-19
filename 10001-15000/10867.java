import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		boolean[] num = new boolean[2001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[Integer.parseInt(st.nextToken()) + 1000] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num.length; i++) {
			if(num[i]) {
				sb.append(i - 1000).append(" ");
			}
		}
		
		System.out.println(sb);
	}
}
