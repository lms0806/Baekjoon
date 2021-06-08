import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String str = br.readLine();
			
			int answer = 0;
			for(int i = str.length() - 1; i >= 0; i--) {
				int num = Character.getNumericValue(str.charAt(i));
				if(i % 2 != 0) {
					answer += num;
				}
				else {
					num *= 2;
					if(num >= 10) {
						answer += num / 10 + num % 10;
					}
					else {
						answer += num;
					}
				}
			}
			sb.append(answer%10 == 0 ? "T" : "F").append("\n");
		}
		System.out.print(sb);
	}
}
