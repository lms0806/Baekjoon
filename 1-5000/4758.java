import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double speed = Double.parseDouble(st.nextToken());
			int weight = Integer.parseInt(st.nextToken()), strength = Integer.parseInt(st.nextToken());
			
			if(speed == 0.0 && weight == 0 && strength == 0) {
				break;
			}
			
			int count = 0;
			if(speed <= 4.5 && weight >= 150 && strength >= 200) {
				count++;
				sb.append("Wide Receiver ");
			}
			if(speed <= 6.0 && weight >= 300 && strength >= 500) {
				count++;
				sb.append("Lineman ");
			}
			if(speed <= 5.0 && weight >= 200 && strength >= 300) {
				count++;
				sb.append("Quarterback ");
			}
			
			if(count == 0) {
				sb.append("No positions");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
