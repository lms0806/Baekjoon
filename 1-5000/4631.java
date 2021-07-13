import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		while(true) {
			int size = Integer.parseInt(br.readLine());
			
			if(size == 0) {
				break;
			}
			
			sb.append("SET ").append(count).append("\n");
			
			String[] str = new String[size];
			
			for(int i = 0; i < size; i++) {
				str[i] = br.readLine();
			}
			
			for(int i = 0; i < size; i+=2) {
				sb.append(str[i]).append("\n");
				str[i] = "";
			}
			
			for(int i = size - 1; i >= 0; i--) {
				if(!str[i].equals("")) {
					sb.append(str[i]).append("\n");
				}
			}
			count++;
		}
		System.out.print(sb);
	}
}
