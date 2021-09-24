import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] n = new int[7];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 7; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(n);
		
		System.out.print(n[0] + " " + n[1] + " " + (n[6] - n[0] - n[1]));
	}
}
