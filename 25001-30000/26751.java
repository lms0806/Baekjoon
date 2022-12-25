import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.print(print(arr));
	}
	
	public static String print(int[] arr) {
		if(arr[0] == 0) {
			if(arr[1] == 0) {
				return arr[2] + "00";
			}
			return arr[1] + "0" + arr[2];
		}
		return arr[0] + "" + arr[1] + "" + arr[2];
	}
}
