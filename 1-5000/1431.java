import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length()) {
					return -1;
				}
				else if(o1.length() == o2.length()){
					int a = sum(o1), b = sum(o2);
					
					return a == b ? o1.compareTo(o2) : Integer.compare(a, b);
				}
				return 1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
		
	}
	
	public static int sum(String s) {
		int sum = 0;
		for(char c : s.toCharArray()) {
			if(c >= '0' && c <= '9') {
				sum += c - '0';
			}
		}
		return sum;
	}
}
