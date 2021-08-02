import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int size = Integer.parseInt(br.readLine());
			
			if(size == 0) {
				break;
			}
			
			String[] strs = new String[size];
			for(int i = 0; i < strs.length; i++) {
				strs[i] = br.readLine();
			}
			
			int flag = size % 2 == 1 ? 1 : 0;
			for(int i = 0; i < strs.length / 2; i++) {
				sb.append(strs[i]).append("\n").append(strs[strs.length / 2 + i + flag]).append("\n");
			}
			
			if(flag == 1) {
				sb.append(strs[strs.length / 2]).append("\n");
			}
		}
		System.out.print(sb);
	}
}
