import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(size --> 0) {
			String s = br.readLine().toLowerCase();
			answer += s.contains("rose") || s.contains("pink") ? 1 : 0;
		}
		System.out.print(answer != 0 ? answer : "I must watch Star Wars with my daughter");
	}
}
