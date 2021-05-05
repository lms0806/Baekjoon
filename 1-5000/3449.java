import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			String a = br.readLine();
			String b = br.readLine();
			
			int answer = 0;
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(j) != b.charAt(j)) {
					answer++;
				}
			}
			
			sb.append("Hamming distance is ").append(answer).append(".\n");
		}
		System.out.print(sb);
	}
}
