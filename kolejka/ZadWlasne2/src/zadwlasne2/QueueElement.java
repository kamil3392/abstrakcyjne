package zadwlasne2;

public class QueueElement<T> {
    
    public QueueElement(T element) {
        value = element;
        next = null;
    }

    public void setNext(QueueElement<T> element) {
        next = element;
    }

    public QueueElement getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
    
    private T value;
    private QueueElement<T> next;
    
}
