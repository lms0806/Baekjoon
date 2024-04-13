import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		for(int i = 100; i < 1000; i++) {
			for(int j = 100; j < 1000; j++) {
				if(i % 111 == 0 && j % 111 == 0) {
					continue;
				}
				
				if(solve(i, j)) {
					sb.append(i).append(" / ").append(j).append(" = ").append(i / 10).append(" / ").append(j % 100).append("\n");
				}
			}
		}
		System.out.print(sb);
	}
	
	public static boolean solve(int i, int j) {
		return (i * (j % 100) == i / 10 * j) && (i % 10 == j / 100);
	}
}
