import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int a = 0, b = 0;
		for(int i = 0; i < num; i++) {
			if(str.charAt(i) == 'A') {
				a++;
			}
			else {
				b++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(a > b) {
			sb.append("A");
		}
		else if(a == b) {
			sb.append("Tie");
		}
		else {
			sb.append("B");
		}
		System.out.print(sb);
	}
}
