import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int start = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(t --> 0) {
			int go = Integer.parseInt(br.readLine());
			answer += Math.min(Math.abs(start - go), Math.min(360 - start + go, start + 360 - go));
			start = go;
		}
		System.out.print(answer);
	}
}
