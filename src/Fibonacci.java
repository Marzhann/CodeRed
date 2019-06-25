public class Fibonacci {



    static long[] fibonacciSeq(int N){
        long[] f_arr = new long[N];
        long firstSeq = 0;
        long resultSeq = 1;

        for (int i = 0; i < N; i++) {
            f_arr[i] = resultSeq;
            //System.out.println(resultSeq);
            long secondSeq = firstSeq;
            firstSeq = resultSeq;
            resultSeq = firstSeq + secondSeq;
        }
        return f_arr;
    }

    public static void main(String[] args){
        long[] ff_arr = fibonacciSeq(8);
        for (int i = 0; i < 8; i++){
            System.out.println(ff_arr[i]);
        }
    }

}
