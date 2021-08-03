import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String[] arr = new String[size];
		for(int i = 0; i < size; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() == s2.length() ? s1.compareTo(s2) : s1.length() - s2.length();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append("\n");
		for(int i = 1; i < size; i++) {
			if(arr[i - 1].equals(arr[i])) {
				continue;
			}
			sb.append(arr[i]).append("\n");
		}
		System.out.print(sb);
	}
}
