import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] a = new int[10], b = new int[10];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 10; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 10; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int aa = 0, bb = 0;
		for(int i = 0; i < 10; i++) {
			if(a[i] > b[i]) {
				aa++;
			}
			else if(a[i] < b[i]) {
				bb++;
			}
		}
		
		System.out.print(aa > bb ? "A" : aa == bb ? "D" : "B");
	}
}
