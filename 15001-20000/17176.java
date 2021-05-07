import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[53];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[Integer.parseInt(st.nextToken())]++;
		}
		
		String str = br.readLine();
		
		int[] result = new int[53];
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ' ') {
				result[0]++;
			}
			else if(ch >= 'A' && ch <= 'Z') {
				result[ch - 'A' + 1]++;
			}
			else {
				result[ch - 'a' + 27]++;
			}
		}
		
		boolean b = true;
		for(int i = 0; i < num.length; i++) {
			if(num[i] != result[i]) {
				b = false;
				break;
			}
		}
		
		System.out.print(b ? "y" : "n");
	}
}
