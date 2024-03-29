import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		int[] num = new int[10001];
		
		while(t --> 0) {
			num[Integer.parseInt(br.readLine())]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num.length; i++) {
			if(num[i] != 0) {
				sb.append((i + "\n").repeat(num[i]));
			}
		}
		System.out.print(sb);
	}
}
