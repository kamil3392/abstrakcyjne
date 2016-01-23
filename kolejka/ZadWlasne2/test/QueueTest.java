import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;
import zadwlasne2.Queues;

public class QueueTest {

    @Test
    public void TestFirstLastElement() {
        Queues<Integer> a = new Queues();
        a.add(1);
        a.add(2);
        Assert.assertEquals((Integer)1, a.getFirst().getValue());
        Assert.assertEquals((Integer)2, a.getLast().getValue());
    }
    
    @Test
    public void TestCountElement(){
        Queues<Integer> a = new Queues();
        a.add(1);
        a.add(2);
        a.add(3);
        Assert.assertEquals(3,a.countElement());
    }
    
    @Test
    public void TestDeleteElement(){
        Queues<Integer> a = new Queues();
        a.add(1);
        a.add(2);
        a.add(3);
        a.delete();
        Assert.assertEquals(2,a.countElement());
    }
  
    @Test
    public void TestCopyQueue(){
        Queues<Integer> a = new Queues();
        Queues<Integer> b = new Queues(); 
        a.add(1);
        a.add(2);
        a.add(3);  
        b.add(4);
        b.add(5);
        b.add(6); 
        a.copy(b); 
        Assert.assertEquals(3, a.countElement());
        Assert.assertEquals(6, b.countElement());
    }
    
    @Test
    public void TestMergeQueue(){
        Queues<Integer> a = new Queues();
        Queues<Integer> b = new Queues();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        a.merge(b);
        Assert.assertEquals(6, a.countElement());
        Assert.assertEquals(0, b.countElement()); // empty queue b
    }
    
    @Test
    public void TestIterator(){
        Queues<Integer> a = new Queues();
        a.add(1);
        a.add(2);
        a.add(3);
        Iterator<Integer> iterator = a.iterator();
        int tab[] = {1,2,3};
        int i=0;  
        while(iterator.hasNext()){
        Assert.assertEquals((Integer)tab[i], iterator.next());
        i++;
        }
    }
     
    @Test
    public void TestSort(){
        Queues<Integer> a = new Queues();
        Iterator<Integer> iterator = a.iterator();
        a.add(3);
        a.add(2);
        a.add(1); 
        a.sort(a);
        int tab[] = {1,2,3};
        int i=0;
        while(iterator.hasNext()){
        Assert.assertEquals((Integer)tab[i], iterator.next());
        i++;
        }
    }
}
