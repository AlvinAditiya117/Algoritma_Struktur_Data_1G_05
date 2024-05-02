public class Queue {
    Nasabah05[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n){
        max = n;
        data = new Nasabah05[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if (!isEmpty()) {
            System.out.println("elemen terdepan : " + data[front].norek +" "+ data[front].nama
            + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        }else{
            System.out.println("queue masih kosong");
        }
    }
    public void print(){
        if (!isEmpty()) {
            System.out.println("queueu masih kosong");
        }else{
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " "+ data[i].nama + " "+ data[i].alamat + " "+ data[i].umur + " " + data[i].saldo);
            }
            System.out.println("jumlah elemen : "+size);
        }
    }
    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikongkan");
        }else{
            System.out.println("queue masih kosong");
        }
    }
    public void Enqueue(Nasabah05 dt){
        if (!isEmpty()) {
            front = rear = 0;
        }else{
            if (rear == max -1) {
                rear = 0;
            }else{
                rear++;
            }
        }
        data[rear] = dt;
        size++;
    }
    public Nasabah05 Dequeue(){
        Nasabah05 dt = new Nasabah05();
        if (!isEmpty()) {
            System.out.println("queue masih kosong");
        }else{
            dt = data[front];
            size--;
            if (!isEmpty()) {
                front = rear = -1;
            }else{
                if (front == max -1) {
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
}
