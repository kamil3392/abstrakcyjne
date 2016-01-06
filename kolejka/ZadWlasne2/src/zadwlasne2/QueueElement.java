package zadwlasne2;

public class QueueElement {

    private int value;
    private QueueElement next;

    public QueueElement(int element) {
        value = element;
        next = null;
    }

    public void setNext(QueueElement element) {
        next = element;
    }

    public QueueElement getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

}
