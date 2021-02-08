import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		String strs1 = "";
		String strs2 = "";
		
		for(int i = str1.length()-1; i >= 0; i--) {
			strs1 += str1.charAt(i);
			strs2 += str2.charAt(i);
		}
		
		int num1 = Integer.parseInt(strs1);
		int num2 = Integer.parseInt(strs2);
		
		StringBuilder sb = new StringBuilder();
		if(num1 > num2) {
			sb.append(num1);
		}
		else {
			sb.append(num2);
		}
		System.out.print(sb);
	}
}
