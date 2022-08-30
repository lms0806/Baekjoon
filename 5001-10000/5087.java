import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			String[] str = s.split(" ");
			
			int a = 0;
			for(int i = 0; i < str.length - 1; i++) {
				if(str[i].equals("A")) {
					a++;
				}
				else {
					a += Integer.parseInt(str[i]) % 2 == 0 ? -1 : 1;
				}
			}
			
			sb.append(a > 0 ? "Cheryl" : a == 0 ? "Draw" : "Tania").append("\n");
		}
		System.out.print(sb);
	}
}
