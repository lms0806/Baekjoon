import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			int sum = 0;
			String[] str = br.readLine().split(",");
			for(int j = 0; j < str.length; j++) {
				sum += Integer.parseInt(str[j]);
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
