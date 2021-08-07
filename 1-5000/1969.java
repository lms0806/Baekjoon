import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken()), size1 = Integer.parseInt(st.nextToken());
		
		String[] str = new String[size];
		
		for(int i = 0; i < size; i++) {
			str[i] = br.readLine();
		}
		
		int[][] num = new int[size1][26];
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size1; i++) {
			for(int j = 0; j < size; j++) {
				num[i][str[j].charAt(i) - 'A']++;
			}
		}
		
		int count = 0;
		for(int i = 0; i < size1; i++) {
			int max = 0, n = 0;
			for(int j = 0; j < 26; j++) {
				if(max < num[i][j]){
					max = num[i][j];
					n = j;
				}
			}
			count += size - max;
			sb.append((char)(n + 'A'));
		}
		System.out.print(sb + "\n" + count);
	}
}
