import org.junit.Assert;
import org.junit.Test;
import zadwlasne2.Queues;

public class QueueTest {

    @Test
    public void TestFirstLastElement() {
        Queues a = new Queues();
        a.add(1);
        a.add(2);
        Assert.assertEquals(1, a.getFirst().getValue());
        Assert.assertEquals(2, a.getLast().getValue());
    }
    
    @Test
    public void TestCountElement(){
        Queues a = new Queues();
        a.add(1);
        a.add(2);
        a.add(3);
        Assert.assertEquals(3,a.countElement());
    }
    
    @Test
    public void TestDeleteElement(){
        Queues a = new Queues();
        a.add(1);
        a.add(2);
        a.add(3);
        a.delete();
        Assert.assertEquals(2,a.countElement());
    }
    
  
    @Test
    public void TestCopyQueue(){
        Queues a = new Queues();
        Queues b = new Queues();
        
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
        Queues a = new Queues();
        Queues b = new Queues();
      
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

}
