import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			String a = br.readLine();
			
			String str = Integer.toString(Integer.parseInt(a)*Integer.parseInt(a));
			
			int count = 0;
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(a.length()-j-1) == str.charAt(str.length()-j-1)){
					count++;
				}
			}
			
			if(count == a.length()) {
				sb.append("YES").append("\n");
			}
			else {
				sb.append("NO").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
