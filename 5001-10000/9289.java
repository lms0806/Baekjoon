import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append("Case ").append(i).append(": ");
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				for(int j = 0; j < str.length; j++) {
					if(s.equals(str[j])) {
						sb.append((char)(j + 'A'));
						break;
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
