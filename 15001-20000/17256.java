import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] a = new int[3];
		int[] b = new int[3];
		int[] c = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < 3; i++) {
			c[i] = i == 1 ? b[i] / a[i] : b[i] - a[2 - i];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			sb.append(c[i]).append(" ");
		}
        	System.out.print(sb);
	}
}
