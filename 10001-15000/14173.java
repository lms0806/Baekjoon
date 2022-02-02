import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine() + " " + br.readLine();
		
		int[] a1 = new int[4], a2 = new int[4];
		
		StringTokenizer st = new StringTokenizer(s);
		for(int i = 0; i < 4; i++) {
			a1[i] = Integer.parseInt(st.nextToken());
			a2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		int x = a1[3] - a1[0];
		int y = a2[3] - a2[0];
		
		System.out.print(x > y ? x * x : y * y);
	}
}
