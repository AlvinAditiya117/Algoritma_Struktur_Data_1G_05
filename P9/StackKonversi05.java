public class StackKonversi05 {
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi05(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size -1;
    }
    public void push(int data){
        if (isFull()) {
            System.out.println("stack penuh");
        }else{
            top++;
            tumpukanBiner[top] = data;
        }
    }
    public int pop(){
        if (isFull()) {
            System.out.println("stack kosong");
            return -1;
        }else{
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
