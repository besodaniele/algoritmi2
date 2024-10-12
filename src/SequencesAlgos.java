import java.util.ArrayList;
import java.util.Arrays;

public class SequencesAlgos {


    public static Sequence LCS_R(Sequence x, Sequence y, int i, int j) {
        if (i < 0 || j < 0) return new Sequence(new ArrayList<>());

        if (x.getAt(i).equals(y.getAt(j))) {
            Sequence temp = LCS_R(x, y, i - 1, j - 1);
            temp.add(x.getAt(i));
            return temp;
        } else {
            Sequence A = LCS_R(x, y, i - 1, j);
            Sequence B = LCS_R(x, y, i, j - 1);
            if (A.getLength() > B.getLength()) {
                return A;
            } else {
                return B;
            }
        }

    }
    public static void LCS_DP(Sequence x, Sequence y) {

        int m = x.getLength();
        int n = y.getLength();
        int[][] c = new int[m+1][n+1];
        char[][] b = new char[m+1][n+1];

        for (int j = 0; j < n; j++) {
            c[0][j]=0;
            b[0][j]='n';

        }
        for (int i = 0;i < m; i++) {
            c[i][0]=0;
            b[i][0]='n';

        }
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if (x.getAt(i-1).equals(y.getAt(j-1))) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    b[i][j] = 'd';
                }
                else{

                    if (c[i-1][j] >= c[i][j-1]){
                        c[i][j]=c[i-1][j];
                        b[i][j]='u';

                    }else{

                        c[i][j]=c[i][j-1];

                        b[i][j]='l';

                    }
                }
            }
        }
        printMatrix(c);
        print_LCS(x,b,m,n);
    }
    public static void print_LCS(Sequence x, char[][] b,int i,int j){
        if((i!=0 || j!=0 )&&i>=0&&j>=0){
            if (b[i][j]=='d'){
                print_LCS(x,b,i-1,j-1);
                System.out.println(x.getAt(i-1));
            }
            else if (b[i][j]=='u'){
                print_LCS(x,b,i-1,j);
            }
            else{
                print_LCS(x,b,i,j-1);

            }

        }
    }

    public static void LIS(IntSequence X){
        int n=X.getLength();
        int []c=new int[n];
        int []b=new int[n];

        c[0]=1;
        b[0]=-1;
        int max=c[0];
        int tmp=0;
        int idx=-1;
        for(int i=1;i<n;i++){
            tmp=0;
            idx=-1;
            for(int j=0;j<i;j++){
                if(X.getAt(j) < X.getAt(i) && c[j]>tmp){
                    tmp=c[j];
                    idx=j;
                }

            }
            c[i]=tmp+1;
            b[i]=idx;
            if(c[i]>max){
                max=c[i];
            }
        }
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(b));
        for (int i=0;i<n;i++){
            if(c[i]==max){
                print_LIS(i,b,X);

            }
        }
    }
    public static void print_LIS(int i,int []b, IntSequence X){
        if(b[i]!=-1){
            print_LIS(b[i],b,X);
            System.out.println(X.getAt(i));
        }
        else{
            System.out.println(X.getAt(i));
        }
    }



    public static void printMatrix(int[][] m){
        for (var row :m ){
            for (var cell:row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }



    }

}
