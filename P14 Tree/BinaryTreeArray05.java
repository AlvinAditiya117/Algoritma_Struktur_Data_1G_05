public class BinaryTreeArray05 {
    int[] data;
    int idxLast;
    public BinaryTreeArray05(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            int leftChildIdx = 2 * idxStart + 1;
            int rightChildIdx = 2 * idxStart + 2;
            if (leftChildIdx <= idxLast) {
                traverseInOrder(leftChildIdx);
            }
            System.out.print(data[idxStart] + " ");
            if (rightChildIdx <= idxLast) {
                traverseInOrder(rightChildIdx);
            }
        }
    }
}