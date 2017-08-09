
Order Processing System

1.  Customer can place an order and submit to this system, system will return customer an uniq order-id and async process that order. 
2.  Each Order go through 4 steps (Scheduling, Pre-Processing, Processing, Post-Processing). Each Step need 5 seconds for processing.  There are 2 extra steps (Completed, Failed) indicating Failure.  
3.  Customer can use order ID to query order details.  Order detail at least include:  Order ID, current step, Order start time and complete time, each step’s start time and complete time.   
4.  If there’s any failure among above 5 steps, system need to rollback and mark order as failure.  Each Step has 5% of failure ratio. 
5.  Order Processing System is a distributed cluster with N nodes, each node has 50 working threads.   System can sustain more orders by simply adding more nodes.  System should not be degrading when more and more nodes are added into cluster. 
6.  If any of node is down, other node in cluster will pick that order up and continue processing.   There will not be more than 1 node to pick up any given order at the same time. 
7.  System should be easy for trouble shooting.  Corresponding debugging and operation interface need to be considered when this order system is in production and hand over to operation. 
