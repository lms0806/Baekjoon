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
			
			int[] num = new int[8];
			for(int i = 0; i < str.length()-2; i++) {
				String s = str.substring(i,i+3);
				if(s.equals("TTT")) {
					num[0]++;
				}
				else if(s.equals("TTH")) {
					num[1]++;
				}
				else if(s.equals("THT")) {
					num[2]++;
				}
				else if(s.equals("THH")) {
					num[3]++;
				}
				else if(s.equals("HTT")) {
					num[4]++;
				}
				else if(s.equals("HTH")) {
					num[5]++;
				}
				else if(s.equals("HHT")) {
					num[6]++;
				}
				else if(s.equals("HHH")) {
					num[7]++;
				}
			}
			
			for(int i = 0; i < num.length; i++) {
				sb.append(num[i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
