import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine().trim());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			int size1 = Integer.parseInt(br.readLine().trim());
			
			int count = 0;
			ArrayList<String> arr = new ArrayList<>();
			while(size1 --> 0) {
				String s = br.readLine();
				arr.add(s);
				if(arr.size() > 1 && arr.get(arr.size() - 2).compareTo(arr.get(arr.size() - 1)) > 0) {
					Collections.sort(arr);
					count++;
				}
			}
			sb.append("Case #").append(i).append(": ").append(count).append("\n");
		}
		System.out.print(sb);
	}
}
