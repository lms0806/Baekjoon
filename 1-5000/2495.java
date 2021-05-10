import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			String str = br.readLine();
			
			int num = 0,count = 0;
			boolean istrue = false;
			for(int j = 0; j < str.length()-1; j++) {
				if(str.charAt(j) == str.charAt(j+1)) {
					count++;
					if(!istrue) {
						istrue = true;
					}
					num = Math.max(num, count+1);
				}
				else {
					count = 0;
				}
			}
			
			sb.append(!istrue ? 1 : num).append("\n");
		}
		System.out.print(sb);
	}
}
