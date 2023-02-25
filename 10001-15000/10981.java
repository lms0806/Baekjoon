import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		ArrayList<School> arr = new ArrayList<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			
			arr.add(new School(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(arr);
		
		HashSet<String> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.size(); i++) {
			if(set.contains(arr.get(i).school)) {
				continue;
			}
			
			set.add(arr.get(i).school);
			sb.append(arr.get(i).teamname).append("\n");
			
			if(set.size() == m) {
				break;
			}
		}
		System.out.print(sb);
	}
}

class School implements Comparable<School>{
	String school, teamname;
	int solve, penalty;
	
	public School(String school, String teamname, int solve, int penalty) {
		this.school = school;
		this.teamname = teamname;
		this.solve = solve;
		this.penalty = penalty;
	}

	@Override
	public int compareTo(School o) {
		if(this.solve == o.solve) {
			return this.penalty - o.penalty;
		}
		return o.solve - this.solve;
	}
}
