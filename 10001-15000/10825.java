import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

class Student{
	String name;
	int kor, eng, math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Student> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		arr.sort(new Comparator<Student>() {
			@Override
			public int compare(Student a, Student b) {
				if(a.kor != b.kor) {
					return b.kor - a.kor;
				}
				else if(a.eng != b.eng){
					return a.eng - b.eng;
				}
				return a.math != b.math ? b.math - a.math : a.name.compareTo(b.name);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(Student s : arr) {
			sb.append(s.name).append("\n");
		}
		System.out.print(sb);
	}
}
