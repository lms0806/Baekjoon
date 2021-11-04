import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] a = new int[3], c = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			int b = Integer.parseInt(st.nextToken());
			c[i] = i == 1 ? b / a[i] : b - a[2 - i];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int n : c) {
			sb.append(n).append(" ");
		}
        System.out.print(sb);
	}
}
