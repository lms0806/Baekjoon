import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
		
		String[][] str = new String[size][2];
		
		StringTokenizer st;
		for(int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			str[i][0] = st.nextToken();
			str[i][1] = st.nextToken();
		}
		
		Arrays.sort(str, (x,y) -> {
			return Integer.parseInt(x[0]) - Integer.parseInt(y[0]);
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			sb.append(str[i][0]).append(" ").append(str[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
