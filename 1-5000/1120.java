import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken(), b = st.nextToken();
		
		int num = a.length();
		for(int i = 0; i < b.length() - a.length() + 1; i++) {
			int temp = 0;
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(j) != b.charAt(j + i)) {
					temp++;
				}
			}
			num = Math.min(num, temp);
		}
		System.out.print(num);
	}
}
