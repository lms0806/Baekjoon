import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		if(size > 1022) {
			System.out.print(-1);//절대 불가
		}
		else if(size < 10) {
			System.out.print(size);// 0부터 9까지 그 수 그대로
		}
		else {
			Queue<Long> queue = new LinkedList<Long>();
			for(long i = 1; i < 10; i++) {
				queue.add(i);// 1 ~ 9 입력
			}
			int answer = queue.size();
			while(answer < size) {
				long k = queue.poll(); // 맨 앞수를 꺼냄
				long temp = k % 10; // 앞수의 마지막 값
				for(int i = 0; i < temp; i++) {
					queue.add(k * 10 + i); // 해당되는 값 다시 넣기
					answer++;
					if(answer == size) {
						System.out.print(k * 10 + i);
						break;
					}
				}
			}
		}
	}
}
