import java.util.List;
import java.util.ArrayList;
public class IntSequence {
    private List <Integer> seq=null;
    IntSequence (ArrayList<Integer> seq) {
        this.seq = seq;
    }
    public Integer getAt(int idx){
        return seq.get(idx);
    }
    public void add(Integer o){
        seq.add(o);
    }
    public int getLength(){
        return seq.size();
    }
    public void print(){
        for(var x:seq){
            System.out.println(x);
        }
    }


}