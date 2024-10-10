import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var l1=new ArrayList<Object>();
        var l2=new ArrayList<Object>();
        l1.add("b");
        l1.add("d");
        l1.add("c");
        l1.add("a");
        l1.add("b");
        l1.add("a");


        l2.add("a");
        l2.add("b");
        l2.add("c");
        l2.add("b");
        l2.add("d");
        l2.add("a");
        l2.add("b");

        Sequence X=new Sequence(l1);

        Sequence Y=new Sequence(l2);


        var ris= LCS.LCS_R(X,Y,X.getLength()-1,Y.getLength()-1);
        ris.print();





    }
}
