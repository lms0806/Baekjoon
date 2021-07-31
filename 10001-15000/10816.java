import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[20000001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			num[Integer.parseInt(st.nextToken()) + 10000000]++;
		}
		
		size = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			sb.append(num[Integer.parseInt(st.nextToken()) + 10000000]).append(" ");
		}
		System.out.print(sb);
	}
}
