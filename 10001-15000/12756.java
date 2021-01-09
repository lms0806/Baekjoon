import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] a = new int[2];
		int[] b = new int[2];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 2; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 2; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		while(true) {
			a[1] -= b[0];
			b[1] -= a[0];
			
			if(b[1] <= 0 && a[1] > 0) {
				System.out.println("PLAYER A");
				break;
			}
			else if(a[1] <= 0 && b[1] > 0) {
				System.out.println("PLAYER B");
				break;
			}
			else if(a[1] > 0 && a[1] > 0) {
				continue;
			}
			else {
				System.out.println("DRAW");
				break;
			}
		}
	}
}
