import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			int a= Integer.parseInt(br.readLine());
			
			String[][] answer = new String[a][a];
			
			for(int j = 0; j < a; j++) {
				for(int k = 0; k < a; k++) {
					if(j == 0 || k == 0 || j == a-1 || k == a-1) {
						answer[j][k] = "#";
					}
					else {
						answer[j][k] = "J";
					}
					sb.append(answer[j][k]);
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
