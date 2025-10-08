package ArrayQuestions;

public class PascalTriangle {

    public static int pascalTriangle(int r,int c){
        return nCr(r-1,c-1);
    }

    public static int nCr(int n, int r){
        if (r > n -r)
            r = n - r;

        if (r == 1) return n;

        int res = 1;

        for (int i = 0; i < r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void main(String[] args){

        int r = 5;
        int c = 3;

        int ans = pascalTriangle(r,c);

        System.out.print(ans);
        
    }
    
}
