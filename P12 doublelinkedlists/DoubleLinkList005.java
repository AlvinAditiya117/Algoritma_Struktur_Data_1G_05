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
                newNode005.prev = current.prev;
                newNode005.next = current;
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
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception ("linked list masih kosong, tidak dapat dihapus!!");
        }else if (size == 1) {
            removeLast();
        }else{
        head = head.next;
        head.prev = null;
        size--;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception ("linked list masih kosong, tidak dapat dihapus!!");
        }else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node005 current = head;
        while (current.next.next != null) {
            current  = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception ("nilai indeks diluar batas");
        }else if (index == 0) {
            removeFirst();
        }else{
            Node005 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            }else if (current.prev == null) {
                current.prev = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
}
