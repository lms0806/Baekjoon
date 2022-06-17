import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		int answer = 0;
		String[] str = {"he", "him", "she", "her"};
		for(String s : br.readLine().split(" ")) {
			for(int i = 0; i < str.length; i++) {
				if(s.equals(str[i])) {
					answer++;
					break;
				}
			}
		}
		System.out.print(answer);
	}
}
