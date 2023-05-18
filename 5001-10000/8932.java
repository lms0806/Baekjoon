import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        double[][] score = {{9.23076, 26.7, 1.835}, {1.84523, 75, 1.348}, {56.0211, 1.5, 1.05}, {4.99087, 42.5, 1.81}, {0.188807, 210, 1.41}, {15.9803, 3.8, 1.04}, {0.11193, 254, 1.88}};
        StringBuilder sb = new StringBuilder();
        while(t --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int answer = 0;
            for(int i = 0; i < 7; i++){
                double num = 0;
                double scores = Double.parseDouble(st.nextToken());
                if(i == 0 || i == 3 || i == 6){
                    num = Math.pow((score[i][1] - scores), score[i][2]);
                }
                else{
                    num = Math.pow((scores - score[i][1]), score[i][2]);
                }
                answer += score[i][0] * num;
            }

            sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
