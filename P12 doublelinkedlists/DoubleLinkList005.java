import org.w3c.dom.Node;

public class DoubleLinkList005 {
    Node005 head;
    int size;

    public DoubleLinkList005() {
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node005(null, item,null);
        }else{
            Node005 newNode005 = new Node005(null, item, head);
            head.prev = newNode005;
            head = newNode005;
        }
        size++;
    }
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        }else{
            Node005 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node005 newNode005 = new Node005(current, item, null);
            current.next = newNode005;
            size++;
        }
    }
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        }else if (index < 0 || index > size) {
            throw new Exception("nilai indexs di luar batas");
        }else{
            Node005 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node005 newNode005 = new Node005(null, item, current);
                current.prev = newNode005;
                head = newNode005;
            }else{
                Node005 newNode005 = new Node005(current.prev, item, current);
                current.prev.next = newNode005;
                current.prev = newNode005;
            }
        }
        size++;
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        size = 0;
    }
    public void print() {
        if (!isEmpty()) {
            Node005 tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("linked lists kosong");
        }
    }
}
