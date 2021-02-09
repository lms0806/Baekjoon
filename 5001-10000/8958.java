import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int number = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < number; i++) {
			String str = br.readLine();
			int[] num = new int[str.length()];
			int sum = 0;
			int count = 1;
			
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'O') {
					num[j] += count;
					count++;
				}
				else {
					count = 1;
				}
			}
			
			for(int j = 0; j < num.length; j++) {
				sum += num[j];
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
