import java.io.*;
import java.util.*;

class Main {
    static final long MOD = 123;
    static final String YES = "yes";
    static final String NO = "NO";

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();
        String[][] H = new String[(int)(N-2+1)][(int)(M-1-2+1)];
        for(int i = 0 ; i < N-2+1 ; i++){
            for(int j = 0 ; j < M-1-2+1 ; j++){
                H[i][j] = sc.next();
            }
        }
        long[] A = new long[(int)(N-2+1)];
        double[] B = new double[(int)(N-2+1)];
        for(int i = 0 ; i < N-2+1 ; i++){
            A[i] = sc.nextLong();
            B[i] = sc.nextDouble();
        }
        long Q;
        Q = sc.nextLong();
        long[] X = new long[(int)(M+Q)];
        for(int i = 0 ; i < M+Q ; i++){
            X[i] = sc.nextLong();
        }
        solve(N, M, H, A, B, Q, X);
    }

    static void solve(long N, long M, String[][] H, long[] A, double[] B, long Q, long[] X){

    }
}
