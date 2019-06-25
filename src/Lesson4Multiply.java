import com.sun.istack.internal.NotNull;

public class Lesson4Multiply {
    public static void main(String [] args){

        int[] multiplies = multiplication(5, 20);
        for (int i = 0; i < 20; i++){
            //System.out.println(multiplies[i]);
        }

        System.out.println(isSecondCharAorB("BlaBla"));
    }

    public static int[] multiplication(int a, int n){
        int[] m_arr = new int[n];
        for (int i = 0; i < n; i++){
            m_arr[i] = i * a;
        }
        return m_arr;
    }

    public static boolean isSecondCharAorB(String a){
        //char secChar = a.charAt(1);
        if (a.charAt(1) == 'a' || a.charAt(1) == 'b'){
            return true;
        }
        return false;
    }
}
