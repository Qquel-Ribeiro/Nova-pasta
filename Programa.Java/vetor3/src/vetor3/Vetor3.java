
package vetor3;


public class Vetor3 {

    public static void main(String[] args) {
         int[] a = { 2, 3, 4, 5 };
        System.out.println("Agora a ordem original");
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }
        System.out.println();
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.print("[" + a[j] + "]");
        }
    }

}