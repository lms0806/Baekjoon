import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			for(int j = a; j <= b; j++) {
				int[] num = new int[10];
				
				boolean istrue = true;
				for(char ch : Integer.toString(j).toCharArray()) {
					num[ch - '0']++;
					if(num[ch - '0'] == 2) {
						istrue = false;
						break;
					}
				}
				if(istrue) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
