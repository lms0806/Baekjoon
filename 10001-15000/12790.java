import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		int[] a = new int[4];
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 4; j++) {
				a[j] = Integer.parseInt(st.nextToken());
			}
			for(int j = 0; j < 4; j++) {
				a[j] += Integer.parseInt(st.nextToken());
			}
			
			if(a[0] < 1) {
				a[0] = 1;
			}
			if(a[1] < 1) {
				a[1] = 1;
			}
			if(a[2] < 0) {
				a[2] = 0;
			}
			
			sb.append(a[0] + 5*a[1] + 2*a[2] + 2*a[3]).append("\n");
		}
		System.out.print(sb);
	}
}
