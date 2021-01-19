import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		boolean[] num = new boolean[2000001];
		
		for(int i = 0; i < size; i++) {
			num[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = num.length-1; i >= 0; i--) {
			if(num[i]) {
				sb.append(i - 1000000).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
