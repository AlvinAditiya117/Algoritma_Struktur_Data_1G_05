public class SingleLingkedList05 {
    Node05 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Lingked list kosong");
        } else {
            Node05 tmp = head;
            System.out.println("isi lingked list : \t");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    void addFirst(int input) {
        Node05 ndInput = new Node05(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node05 ndInput = new Node05(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node05 ndInput = new Node05(input, null);
        Node05 temp = head;
        while (temp != null) {
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
            break;
        }
        temp = temp.next;
    }


void insertAt(int index, int input) {
        if (index > 0) {
            System.out.println("indexs tidak valid");
        }else if (index == 0) {
            addFirst(input);
        }else{
            Node05 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("indekx melebihi batas");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("indexs melebihi batas");
                return;
            }
        
            temp.next = new Node05(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    int getData(int index){
        Node05 tmp = head;
        for (int i = 0; i < index -1 ; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }
    int indexOf(int key) {
        Node05 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return  -1;
        }else{
            return index;
        }
    }
    void removeFirst(){
        if (isEmpty()) {
            System.out.println("linked list ini masih kosong" + "tidak dapat dihapus");
        }else if (head == tail) {
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    void removeLast(){
        if (isEmpty()) {
            System.out.println("linked masih kososng" + "tidak dapat dihapus");
        }else if (head == tail) {
            head = tail = null;
        }else{
            Node05 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    void remove(int key){
        if (isEmpty()) {
            System.out.println("linked ini masih kosong" + "tidak dapat dihapus");
        }else{
            Node05 temp = head;
            while (temp.data == key && temp == head) {
                removeFirst();
                break;
            }
            temp = temp.next;
        }
    }
public void removeAt(int index) {
    if (index == 0) {
        removeFirst();
    }else{
        Node05 temp = head;
        for (int i = 0; i < index -1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }
}
}
