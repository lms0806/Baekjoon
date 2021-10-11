import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());

		ArrayList<Student> arr = new ArrayList<>();
		int[] students = new int[101];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int s = Integer.parseInt(st.nextToken());

			if (students[s] > 0) {
				students[s]++;
				for (Student a : arr) {
					if (a.num == s) {
						a.total++;
						break;
					}
				}
			} 
			else {
				if (arr.size() >= n) {
					Collections.sort(arr);
					students[arr.get(0).num] = 0;
					arr.remove(0);
				}
				arr.add(new Student(s, 1, i));
				students[s] = 1;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 101; i++) {
			if(students[i] != 0) {
				sb.append(i).append(" ");
			}
		}
		System.out.print(sb);
	}
}

class Student implements Comparable<Student> {
	int num, total, time;

	public Student(int num, int total, int time) {
		this.num = num;
		this.total = total;
		this.time = time;
	}

	@Override
	public int compareTo(Student o) {
		if (this.total == o.total) {
			return this.time - o.time;
		} else if (this.total < o.total) {
			return -1;
		}
		return 1;
	}
}
