import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n], num = new int[9];
		int answer = 1, currentLen = 1, count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
            if (i > 0 && arr[i] == arr[i - 1]) {
                currentLen++;
            } else {
            	answer = Math.max(answer, currentLen);
            	currentLen = 1;
            }

            num[arr[i]]++;
            if (i > 3) {
            	num[arr[i - 4]]--;
            }

            if (i >= 3 && num[1] == 1 && num[2] == 1 && num[4] == 1 && num[8] == 1) {
            	count++;
            }
        }
        System.out.print(Math.max(answer, currentLen) + " " + count);
	}
}
