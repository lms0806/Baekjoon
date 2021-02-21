import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>(size);
		for(int i = 0; i < size; i++) {
			arr.add(br.readLine());
		}
		
		Collections.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.get(0)).append("\n");
		for(int i = 1; i < arr.size(); i++) {
			if(arr.get(i-1).equals(arr.get(i))) {
				continue;
			}
			sb.append(arr.get(i)).append("\n");
		}
		System.out.print(sb);
	}
}
