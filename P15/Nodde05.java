
public class Nodde05 {
    int data;
    Nodde05 prev, next;
    int jarak;

    Nodde05(Nodde05 prev, int data, int jarak, Nodde05 head) {
        this.prev = prev;
        this.data = data;
        this.next = head;
        this.jarak = jarak;
    }
}
    
