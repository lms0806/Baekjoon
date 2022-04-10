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
			
			sb.append(String.format("%.2f", Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}
}
