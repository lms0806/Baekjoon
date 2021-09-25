import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String s = "", str = "";
			while(!(str = br.readLine()).equals("")) {
				s += str;
			}
			
			double a = 0, b = 0;
			for(char ch : s.toCharArray()) {
				if(ch == '#') {
					a++;
				}
				b++;
			}
			
			a = Math.round((b - a) / b * 1000) / 10.0;
			sb.append("Efficiency ratio is ");
			if((int)a == a) {
				sb.append((int)a);
			}
			else {
				sb.append(a);
			}
			sb.append("%.").append("\n");
		}
		System.out.print(sb);
	}
}
