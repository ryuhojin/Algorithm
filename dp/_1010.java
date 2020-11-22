package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1010 {
    /**
     * 백준 : 다리놓기
     * link : https://www.acmicpc.net/problem/1010
     * Solved.ac Silver5
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        int N,M;
        for(int i = 0; i<testCase;i++){
            int [][]dp = new int[31][31];
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            for(int j = 2; j <= N; j++){
                dp[j][1] = 0;
            }
            for(int j = 1; j <= M; j++){
                dp[1][j] = j;
            }

            for(int j = 2; j <= N ; j++){
                for(int k = 2; k <= M ; k++){
                    dp[j][k] = dp[j][k-1]+dp[j-1][k-1];
                }
            }
            System.out.println(dp[N][M]);
        }
    }
}
