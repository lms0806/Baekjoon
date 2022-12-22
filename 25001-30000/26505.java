import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int arr1[] = {0, 0, 5, 7, 13, 23, 17, 19, 23, 37, 61, 67, 61, 71, 47};
		int arr2[] = {0, 0, 3, 7, 11, 13, 17, 29, 23, 43, 41, 73, 59, 47, 89};


		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append("N = ").append(a).append(" FORTUNATE = ").append(arr1[a]).append(" LESS = ").append(arr2[a]).append("\n");
		}
		System.out.print(sb);
	}
}
