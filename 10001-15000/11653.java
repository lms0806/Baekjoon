import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		
		int count = 2;
		StringBuilder sb = new StringBuilder();
		while(a >= count) {
			if(a%count == 0) {
				a/=count;
				sb.append(count).append("\n");
			}
			else {
				count++;
			}
		}
		System.out.print(sb);
	}
}
