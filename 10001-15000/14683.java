import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[][] a = new int[2][2];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			a[i][0] = Integer.parseInt(st.nextToken());
			a[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int size = Integer.parseInt(br.readLine());
		int num = Math.abs(a[0][0] - a[1][0]) + Math.abs(a[0][1] - a[1][1]);
		
		System.out.print(size >= num && (size - num) % 2 == 0 ? "Y" : "N");
	}
}
