/**
 * Created by a on 13/02/21.
 */
public class Rev {
    int[] b = {22, 44, 55, 66, 77};
    int[] c = new int[b.length];

    public void print() {
        System.out.print("[ ");
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) System.out.print(c[i]);
            else System.out.print(c[i] + " , ");
        }
        System.out.print(" ]");
    }


    public void dep() {
        for (int i = 0; i < c.length; i++) {
            c[i] = b[i];

        }

    }


    public static void main(String[] args) {
        Rev x = new Rev();
        x.print();
        x.dep();
        x.print();
    }
}
