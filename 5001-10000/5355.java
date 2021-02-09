import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			String[] str = br.readLine().split(" ");
			
			double num = Double.parseDouble(str[0]);
			
			for(int j = 1; j < str.length; j++) {
				if(str[j].equals("@")) {
					num*=3;
				}
				else if(str[j].equals("%")) {
					num+=5;
				}
				else {
					num-=7;
				}
			}
			sb.append(String.format("%.2f", num)).append("\n");
		}
		System.out.print(sb);
	}
}
