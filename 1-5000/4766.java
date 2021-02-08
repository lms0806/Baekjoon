import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		double a, num;
		
		num = Double.parseDouble(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			a = Double.parseDouble(br.readLine());
			if(a == 999) {
				break;
			}
			
			sb.append(String.format("%.2f", a-num)).append("\n");
			num = a;
		}
		System.out.print(sb);
	}
}
