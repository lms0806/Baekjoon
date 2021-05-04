import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		char[][] ch = new char[size][size];
		
		for(int i = 0; i < size; i++) {
			ch[i] = br.readLine().toCharArray();
		}
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if(num == 1) {
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					sb.append(ch[i][j]);
				}
				sb.append("\n");
			}
		}
		else if(num == 2) {
			for(int i = 0; i < size; i++) {
				for(int j = size-1; j >= 0; j--) {
					sb.append(ch[i][j]);
				}
				sb.append("\n");
			}
		}
		else {
			for(int i = size-1; i >= 0; i--) {
				for(int j = 0; j < size; j++) {
					sb.append(ch[i][j]);
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
