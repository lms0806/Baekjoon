import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		String[] str = new String[size];
		
		for(int i = 0; i < size; i++) {
			str[i] = br.readLine();
		}
		
		Arrays.sort(str);
		
		System.out.println(str[num-1]);	
	}
}
