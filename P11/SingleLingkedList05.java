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
}
    
