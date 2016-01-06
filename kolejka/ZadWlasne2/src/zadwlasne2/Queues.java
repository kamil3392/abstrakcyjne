package zadwlasne2;

public class Queues {

    QueueElement first, last;

    public Queues() {
        this.first = null;
        this.last = null;
    }

    public void add(int x) {

        QueueElement temp = new QueueElement(x);
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
            QueueElement temp = first;
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

    public void copy(Queues Queue2) {
        QueueElement temp = first;
        if (temp != null) {
            while (temp != null) {
                Queue2.add(temp.getValue());
                temp = temp.getNext();
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void merge(Queues queue2) {
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

    public QueueElement getFirst() {
        return first;
    }

    public QueueElement getLast() {
        return last;
    }

    public void setLast(QueueElement element) {
        last = element;
    }

    public void setFirst(QueueElement element) {
        first = element;
    }

}
