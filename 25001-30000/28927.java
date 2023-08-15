import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] a = new int[2];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			a[i] = Integer.parseInt(st.nextToken()) * 3 + Integer.parseInt(st.nextToken()) * 20 + Integer.parseInt(st.nextToken()) * 120;
		}
		
		System.out.print(a[0] > a[1] ? "Max" : a[0] == a[1] ? "Draw" : "Mel");
	}
}
