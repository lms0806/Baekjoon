import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int count = 0;
			int[] num = new int[10];
			
			for(char ch : br.readLine().toCharArray()) {
				num[ch - '0']++;
			}
			
			for(int n : num) {
				if(n != 0) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}
