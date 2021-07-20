import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		while(true) {
			int size = Integer.parseInt(br.readLine());
			
			if(size == 0) {
				break;
			}
			
			String[] str = new String[size];
			for(int i = 0; i < str.length; i++) {
				str[i] = br.readLine();
			}
			
			int[] num = new int[size];
			for(int i = 0; i < size * 2 - 1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				num[Integer.parseInt(st.nextToken()) - 1]++;
			}
			
			sb.append(count).append(" ");
			for(int i = 0; i < size; i++) {
				if(num[i] != 2) {
					sb.append(str[i]).append("\n");
					break;
				}
			}
			count++;
		}
		System.out.print(sb);
	}
}
