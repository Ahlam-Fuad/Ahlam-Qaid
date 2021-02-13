import java.util.Random;

/**
 * Created by a on 13/02/21.
 */
public class Rnom {
    public static void main(String[] args) {
        int [] b={1,2,4,5,6,7,8};
        removeEement(b);
    }
    static void removeEement(int [] b){
        Random r = new Random();
        while ( b.length>0){
            int inex= r.nextInt(b.length);
            System.out.println("INDEX = "+inex+"Element = "+b[inex]);
            int [] c1=new int[b.length-1];
            for (int i = 0; i <inex ; i++)
                c1[i]=b[i];

            for (int i = 0; i <b.length-1 ; i++)
                c1[i]=b[i+1];
            b=c1;


        }
    }
}
