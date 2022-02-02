/*
    There are given N ropes of different lengths, we need to connect these ropes into one rope. 
    The cost to connect two ropes is equal to sum of their lengths.
    The task is to connect the ropes with minimum cost.
*/
class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        long cost = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            long a = pq.peek();
            pq.poll();
            long b = pq.peek();
            pq.poll();
            long sum = a+b;
            cost += sum;
            pq.add(sum);
            
        }
        return cost;
    }
}