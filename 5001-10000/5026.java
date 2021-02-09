import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			String str = br.readLine();
			if(str.equals("P=NP")) {
				sb.append("skipped");
			}
			else {
				String[] strs = str.split("\\+");
				int answer = Integer.parseInt(strs[0]) + Integer.parseInt(strs[1]);
				sb.append(answer);
			}
            		sb.append("\n");
		}
		System.out.print(sb);
	}
}
