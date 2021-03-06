import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		int i = 0;
		StringBuilder sb = new StringBuilder();
		for(i = 0; i < num.length; i++) {
			if(i+1 != num[i]) {
				sb.append(i+1);
				break;
			}
			if(i == num.length - 1) {
				sb.append(num.length + 1);
			}
		}
		
		System.out.print(sb);
	}
}
