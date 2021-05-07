import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		char[] ch = str.toCharArray();
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			char tmp = ch[a];
			ch[a] = ch[b];
			ch[b] = tmp;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < ch.length; i++) {
			sb.append(ch[i]);
		}
		System.out.print(ch);
	}
}
