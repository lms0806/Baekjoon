import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		
		int temp = (n / 100) * 100;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 99; i++) {
			if(temp % f == 0) {
				if((temp%100) < 10) {
					sb.append("0" + temp%100);
				}
				else {
					sb.append(temp%100).append("\n");
				}
				break;
			}
			temp++;
		}
		System.out.print(sb);
	}
}
