import java.util.Collections;
import java.util.PriorityQueue;

/*
    Given an input stream of N integers. The task is to insert these numbers
    into a new stream and find the median of the stream formed by each insertion of X to the new stream.

    Approach is two maintain two seprate priority queues.(One max-heap and one min-heap)
*/
class Solution
{
    static PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minheap = new PriorityQueue<>();
    //Function to insert heap.
    public static void insertHeap(int x)
    {
        // add your code here
        //PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        //PriorityQueue<Integer> minheap = new PriorityQueue<>();
        if(maxheap.isEmpty() || maxheap.peek() >= x){
            maxheap.add(x);
        }
        else{
            minheap.add(x);
        }
        balanceHeaps();
    }
    
    //Function to balance heaps.
    public static void balanceHeaps()
    {
       // add your code here
       if(maxheap.size()  > minheap.size() + 1){
           minheap.add(maxheap.poll());
       }
       else if(maxheap.size() < minheap.size()){
           maxheap.add(minheap.poll());
       }
    }
    
    //Function to return Median.
    public static double getMedian()
    {
        // add your code here
        if(maxheap.size() == minheap.size()){
            return (maxheap.peek() + minheap.peek()) / 2;
        }
        return maxheap.peek();
    }
    
}