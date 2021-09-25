import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(str);
			
			double r = Double.parseDouble(st.nextToken()), s = Double.parseDouble("0" + st.nextToken());
			
			sb.append((int)(Math.sqrt((r * (s + 0.16)) / 0.067) + 0.5)).append("\n");
		}
		System.out.print(sb);
	}
}
