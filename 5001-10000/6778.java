import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		StringBuilder sb  = new StringBuilder();
		if(a >= 3 && b <= 4) {
			sb.append("TroyMartian").append("\n");
		}
		if(a <= 6 && b >= 2) {
			sb.append("VladSaturnian").append("\n");
		}
		if(a <= 2 && b <= 3) {
			sb.append("GraemeMercurian").append("\n");
		}
		System.out.print(sb);
	}
}
