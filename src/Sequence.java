import java.util.List;
import java.util.ArrayList;
public class Sequence {
    List <Object> seq=null;
    Sequence (ArrayList<Object> seq) {
        this.seq = seq;
    }
    Object getAt(int idx){
        return seq.get(idx);
    }
    void add(Object o){
        seq.add(o);
    }
    int getLength(){
        return seq.size();
    }
    void print(){
        for(var x:seq){
            System.out.println(x);
        }
    }


}
