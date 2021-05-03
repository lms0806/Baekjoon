import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			sb.append("Data Set ").append(i+1).append(":");
			int count = Integer.parseInt(br.readLine());
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if(ch == 'c') {
					count++;
				}
				else if(ch == 'b') {
					count--;
				}
			}
			sb.append("\n").append(count).append("\n\n");
		}
		
		System.out.print(sb);
	}
}
