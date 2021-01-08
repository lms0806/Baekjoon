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
			if(i == 1) {
				c[i] = b[i] / a[i];
			}
			else {
				c[i] = b[i] - a[2-i];
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
