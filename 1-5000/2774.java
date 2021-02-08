import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			int count = 0;
			int[] num = new int[10];
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				num[str.charAt(j)-'0']++;
			}
			
			for(int j = 0; j < num.length; j++) {
				if(num[j] != 0) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}
