import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int max = 0;
		int x = 0, y = 0;
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				int a = Integer.parseInt(st.nextToken());
				if(a > max) {
					max = a;
					x = i;
					y = j;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(max).append("\n").append(x+1).append(" ").append(y+1);
		System.out.print(sb);
	}
}
