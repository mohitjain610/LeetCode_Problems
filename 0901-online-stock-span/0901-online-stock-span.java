class StockSpanner {
    Stack<Integer> stack;
    Stack<Integer> stac;
    public StockSpanner() {
        stack=new Stack<>();
        stac=new Stack<>();
    }
    
    public int next(int price) {
        
        if(stack.size()==0){
            stack.push(price);
            stac.push(1);
            return 1;
        }
        else if(stack.peek()<=price){
            int c=0;
            while(stack.size()>0 && stack.peek()<=price){
                stack.pop();
                c=c+stac.peek();
                stac.pop();
            }
            stack.push(price);
            stac.push(c+1);
            return c+1;

        }
        else if(stack.peek()>price){
            stack.push(price);
            stac.push(1);
            return 1;
        }
        
        return 0;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */