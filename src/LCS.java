import java.util.ArrayList;

public class LCS {


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


    public static void printMatrix(int[][] m){
        for (var row :m ){
            for (var cell:row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }



    }

}
