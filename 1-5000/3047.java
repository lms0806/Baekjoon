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
		
		String str = br.readLine();
		
        StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			sb.append(num[str.charAt(i) - 'A']).append(" ");
		}
        System.out.print(sb);
	}
}
