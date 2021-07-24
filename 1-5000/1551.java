import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), size = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<>(), arr2 = new ArrayList<>();
		
		String[] str = br.readLine().split(",");
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(str[i]));
		}
		
		while(size --> 0) {
			for(int i = 0; i < arr.size() - 1; i++) {
				arr2.add(arr.get(i + 1) - arr.get(i));
			}
		
			arr.clear();
			
			for(int num : arr2) {
				arr.add(num);
			}
			
			arr2.clear();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.size(); i++) {
			sb.append(arr.get(i)).append(i < arr.size() - 1 ? "," : "");
		}
		System.out.print(sb);
	}
}
