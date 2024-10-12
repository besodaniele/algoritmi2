import java.util.List;
import java.util.ArrayList;
public class Sequence {
    private List <Object> seq=null;
    Sequence (ArrayList<Object> seq) {
        this.seq = seq;
    }
    public Object getAt(int idx){
        return seq.get(idx);
    }
    public void add(Object o){
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
