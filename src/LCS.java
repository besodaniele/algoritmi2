import java.util.ArrayList;

public class LCS {

    public static Sequence LCS_R(Sequence x, Sequence y,int i,int j){
        if (i < 0 || j < 0 ) return new Sequence(new ArrayList<>());

        if (x.getAt(i).equals(y.getAt(j))){
            Sequence temp=LCS_R(x,y,i-1,j-1);
            temp.add(x.getAt(i));
            return temp;

        }else{
            Sequence A = LCS_R(x, y, i-1, j);
            Sequence B =LCS_R(x, y, i, j-1);
            if ( A.getLength() > B.getLength()){
                return A;
            }else{
                return B;
            }
        }

    }

}
