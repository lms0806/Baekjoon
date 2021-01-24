import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[30];
		for(int i = 0; i < 28; i++) {
			num[Integer.parseInt(br.readLine())-1]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 30; i++) {
			if(num[i] == 0) {
				sb.append(i+1).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
