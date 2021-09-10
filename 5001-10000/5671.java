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
				if(istrue(j)) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean istrue(int j) {
		int[] num = new int[10];
		while(j != 0) {
			num[j % 10]++;
			if(num[j % 10] == 2) {
				return false;
			}
			j /= 10;
		}
		return true;
	}
}
