import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		while(true) {
			String s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			sb.append("Case ").append(count).append(": Sorting... done!").append("\n");
			count++;
		}
		System.out.print(sb);
	}
}
