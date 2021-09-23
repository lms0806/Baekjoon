import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arr);
		
		int num = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> a = new ArrayList<>(), b = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.size(); i++) {
			for(int j = i + 1; j < arr.size(); j++) {
				if(arr.get(i) + arr.get(j) == num && !a.contains(arr.get(i)) && !b.contains(arr.get(j))) {
					sb.append(arr.get(i)).append(" ").append(arr.get(j)).append("\n");
					a.add(arr.get(i));
					b.add(arr.get(j));
				}
			}
		}
		sb.append(a.size());
		System.out.print(sb);
	}
}
