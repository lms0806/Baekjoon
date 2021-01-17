import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		String[] strs = br.readLine().split("");
		
		for(int i = 0; i < strs.length; i++) {
			System.out.print(num[strs[i].charAt(0) - 'A'] + " ");
		}
		
	}
}
