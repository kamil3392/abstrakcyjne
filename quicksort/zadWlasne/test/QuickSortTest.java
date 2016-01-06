import org.junit.Assert;
import org.junit.Test;
import zadwlasne.QuickSort;

public class QuickSortTest {
    
    @Test
    public void TestSortTenElements(){
        
        long  [] tabToSort = {2,1,8,4,5,7,3,10,9,6};
        QuickSort a = new QuickSort(10,tabToSort);
        
        long [] tabSorted = {1,2,3,4,5,6,7,8,9,10};
        Assert.assertArrayEquals(tabSorted, a.tab);
        
    }
    
    @Test
    public void TestSortFifteenElements(){
        long  [] tabToSort = {6,5,1,2,3,4,7,8,9,11,1,2,3,4,9};
        QuickSort a = new QuickSort(15,tabToSort);
        
        long [] tabSorted = {1,1,2,2,3,3,4,4,5,6,7,8,9,9,11};
        Assert.assertArrayEquals(tabSorted, a.tab);
    }
    
    @Test
    public void TestSortOneHundredElements(){
        long  [] tabToSort = {13,17,1,31,50,84,59,22,73,96,4,85,10,14,81,65,61,41,70,58,100,38,68,28,35,40,51,71,55,29,27,24,52,9,
                              62,45,89,5,30,33,47,43,74,77,11,83,12,92,2,44,64,66,32,90,86,91,18,80,8,36,46,37,79,87,54,39,94,
                              15,25,26,6,42,67,97,49,48,88,23,7,76,53,16,75,78,21,95,56,34,63,69,60,57,20,19,98,72,99,82,93,3};
        
        QuickSort a = new QuickSort(100,tabToSort);
        
        long [] tabSorted = new long[100];
        for(int i=0;i<100;i++){
            tabSorted[i]=i+1;
        }
        
        Assert.assertArrayEquals(tabSorted, a.tab);
    }
    
    
}
