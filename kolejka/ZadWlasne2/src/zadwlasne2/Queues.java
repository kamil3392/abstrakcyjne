package zadwlasne2;

import java.util.Iterator;

public class Queues<T> implements Iterable<T>{
   
    public Queues() {
        this.first = null;
        this.last = null;
    }
    
    public void add(T x) {
        QueueElement<T> temp = new QueueElement(x);
        if (first == null) {
            first = last = temp;
        } else {
            last.setNext(temp);
            last = temp;
        }
    }
    
    public void delete() {
        if (first != null) {
            if (first.getNext() == null) {
                last = null;
            }
            first = first.getNext();
        } else {
            System.out.println("kolejka is empty");
        }
    }

    public void show() {
        if (first != null) {
            QueueElement<T> temp = first;
            while (temp != null) {
                System.out.print(temp.getValue() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty");
        }
    }

    public int countElement() {
        if (first != null) {
            int licznik = 0;
            QueueElement temp = first;
            while (temp != null) {
                licznik++;
                temp = temp.getNext();
            }
            return licznik;
        }
        return 0;
    }

    public void copy(Queues<T> Queue2) {
        QueueElement<T> temp = first;
        if (temp != null) {
            while (temp != null) {
                Queue2.add(temp.getValue());
                temp = temp.getNext();
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void merge(Queues<T> queue2) {
        if (first == null) {
            first = queue2.getFirst();
            last = queue2.getLast();
        } else if (first != null && queue2.getFirst() != null) {
            last.setNext(queue2.getFirst());
            last = queue2.getLast();
        }
        queue2.setLast(null);
        queue2.setFirst(null);
    }

    public QueueElement<T> getFirst() {
        return first;
    }

    public QueueElement<T> getLast() {
        return last;
    }

    public void setLast(QueueElement<T> element) {
        last = element;
    }

    public void setFirst(QueueElement<T> element) {
        first = element;
    }
    
    public void sort(Queues<T> queue){
        int size = queue.countElement();
        T [] tab = (T[])new Object[size];
        Iterator<T> iterator = queue.iterator();
        int i=0;
        while(iterator.hasNext()){
           tab[i]=iterator.next();
           i++;
        }
        T tmp;
        for(int a=0;a<size;a++){
           queue.delete();
         for(int b=0;b<size-i-1;b++){ 
           if(tab[b].equals(tab[b+1])){
                tmp = tab[b];
                tab[b] = tab[b+1];
                tab[b+1] = tmp; 
            }
          }
        }
        for(int a=0;a<size;a++){
         queue.add(tab[a]);
        }
    }
    
    @Override
    public Iterator<T> iterator() {
        return new IteratorQueue();
    }
    
    QueueElement<T> first, last;
    
    private class IteratorQueue implements Iterator<T> {

    @Override
    public boolean hasNext() {
        return queue != null;
    }

    @Override
    public T next() {
        T obiekt = queue.getValue();
        queue = queue.getNext();
        return obiekt;
    }

    private QueueElement<T> queue = first;
    
}
}
