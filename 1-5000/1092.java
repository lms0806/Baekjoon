import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> crain = new ArrayList<>(), box = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			crain.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			box.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(crain, Collections.reverseOrder());
		Collections.sort(box, Collections.reverseOrder());
		
		System.out.print(solve(crain, box));
	}
	
	public static int solve(ArrayList<Integer> crain, ArrayList<Integer> box) {
		if(box.get(0) > crain.get(0)) {
			return -1;
		}
		
		int answer = 0;
		while(!box.isEmpty()) {
			int idx = 0;
			for(int i = 0; i < crain.size();) {
				if(idx == box.size()) {
					break;
				}
				
				if(crain.get(i) >= box.get(idx)) {
					box.remove(idx);
					i++;
				}
				else {
					idx++;
				}
			}
			answer++;
		}
		return answer;
	}
}
