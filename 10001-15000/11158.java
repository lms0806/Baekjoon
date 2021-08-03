import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String[] s = br.readLine().split(" ");
			
			int answer = 0;
			for(int i = 0; i < s.length; i++) {
				if(i < s.length - 1 && (s[i].equals("would") || s[i].equals("should")) && s[i + 1].equals("of")){
					answer++;
				}
				else if(s[i].equals("u") || s[i].equals("ur") || s[i].contains("lol") || s[i].equals("haha")) {
					answer++;
				}
			}
			sb.append(answer * 10).append("\n");
		}
		System.out.print(sb);
	}
}
