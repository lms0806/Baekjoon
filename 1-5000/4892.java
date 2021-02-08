import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a, i = 1;
		String str = "";
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			a = Integer.parseInt(br.readLine());
			
			if(a == 0) {
				break;
			}
			
			if(a % 2 == 0) {
				str = "even";
			}
			else {
				str = "odd";
				a--;
			}
			a/=2;
			
			sb.append(i).append(". ").append(str).append(" ").append(a).append("\n");
			i++;
		}
		System.out.print(sb);
	}
}
