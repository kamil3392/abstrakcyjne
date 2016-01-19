package zadwlasne2;

import java.util.Iterator;


public class QueueElement<T> {

    private T value;
    private QueueElement<T> next;
 
    
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
    
}
