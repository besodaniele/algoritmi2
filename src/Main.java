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

        Sequence Y=new Sequence(l1);

        Sequence X=new Sequence(l2);


        // var ris= Sequences__algos.LCS_R(Y,X,Y.getLength()-1,X.getLength()-1);
        // ris.print();


       // Sequences__algos.LCS_DP(X,Y);

        var l3=new ArrayList<Integer>();
        l3.add(4);
        l3.add(1);
        l3.add(2);
        l3.add(2);
        l3.add(1);
        l3.add(5);
        l3.add(6);

        var intSeq1=new IntSequence(l3);

        var l4 =new ArrayList<Integer>();
        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(2);
        l4.add(1);
        l4.add(1);
        l4.add(5);
        l4.add(7);

        var intSeq2=new IntSequence(l4);

        SequencesAlgos.LICS(intSeq2,intSeq1);


    }
}
