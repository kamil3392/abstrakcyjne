package list;
import java.util.Iterator;

public class TripleList <T> implements Iterable<TripleList<T>>{
    
    private T value;
    private TripleList<T> prev;
    private TripleList<T> next; 
    private TripleList<T> middle; 
    private TripleList<T> triplelist;
    
    public TripleList(){
        
        this.prev = null;
        this.next = null;
        this.middle = null;
        this.value = null;
        
    }
    
    public TripleList(T value){
        
        this();
        this.value = value;
        
    }
    
    public T getValue(){
        
        return value;
        
    }
    
    public TripleList<T> getNext(){
        
        return next;
        
    }
    
    public TripleList<T> getPrev(){
        
        return prev;
        
    }
    
    public TripleList<T> getMiddle(){
        
        return middle;
        
    }
    
    public void add(T value){
        
        triplelist = new TripleList<>(value);
        
        if(this.value == null){
            
            this.value = value;
            
        }else if(this.middle == null){
            
            triplelist.middle = this;
            this.middle = triplelist;
            
        }else{
            
            TripleList<T> TemporaryList = this;
            
            while(TemporaryList.next != null) {
                
                TemporaryList = TemporaryList.next;
                
            }
            
            if(TemporaryList.middle == null) {
                
                triplelist.middle = TemporaryList;
                TemporaryList.middle = triplelist;
                
            }else{
                
                triplelist.prev = TemporaryList;
                TemporaryList.next = triplelist;
                
            }
        }
    }
   
    boolean  isNull(TripleList<T> list){ 
        
        return list == null;
        
    }
    
    public int CountElement(){
        
        int count = 0;
        
        TripleList<T> list = this;
        
        while(!isNull(list)){
            
            if(list.value != null){
                
                count++;
                
            }
            
            if(list.middle != null){
                
                count++;
                
            }
            
            list = list.next;
        }
        
        return count;
    }
    
    @Override
    public Iterator<TripleList<T>> iterator(){
        
        return new TripleListIterator(this);
        
    }
    
    
    class TripleListIterator implements Iterator{
        
        private TripleList<T> elem;
        private boolean middle;
        
        public TripleListIterator(TripleList<T> pointer){
            
            this.elem = pointer;
            this.middle = false;
            
        }
       
        @Override
        public TripleList<T> next(){
            
            if(this.middle){ 
                
                TripleList<T> TemporaryList = this.elem.middle;
                this.elem = this.elem.next; 
                this.middle = false;
                
                return TemporaryList;
                
            }else{
                
                this.middle = true;
                return this.elem;
                
            }
        }
        
        public boolean isTrue(boolean middle,T elem){
            
            return this.middle==false && this.elem.value != null;
            
        }
        
        public boolean isTrue(boolean middle ,TripleList<T> elem){
            
            return this.middle && this.elem.middle != null && this.elem.middle.value != null;
            
        }
        
        @Override
        public boolean hasNext(){
            
            return isTrue(this.middle,this.elem.value) || isTrue(this.middle,this.elem.middle.value);
                                                  
        }    
    }
}