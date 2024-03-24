public class Faktorial05 {
    public int nilai;
    
    int faktorialBF (int n) {
        int faktoo = 1;
        for(int i=1; i <=n; i++) {
            faktoo = faktoo * 1;
        }
        return faktoo;
    }
    int faktorialDC(int n) {
        if(n == 1){
            return 1;
        }else{
                int faktoo = n * faktorialDC(n - 1);
                return faktoo;
            }
        }
    }
