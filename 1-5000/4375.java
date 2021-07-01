import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null) {
			int n = Integer.parseInt(str.trim());
			
			int tmp = 1, count = 1;
			while(true) {
				if(tmp % n == 0) {
					break;
				}
				tmp = (tmp * 10 + 1) % n;
				count++;
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}
