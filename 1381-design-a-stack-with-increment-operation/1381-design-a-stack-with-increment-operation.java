class CustomStack {
    int size=0;
    int top=-1;
    int [] arr;
    public CustomStack(int maxSize) {
        size=maxSize;
        arr=new int[maxSize];
    }
    
    public void push(int x) {
        if(top<(size-1))arr[++top]=x;
    }
    
    public int pop() {
        if(top==-1)return -1;
        return arr[top--];
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<k && i<size;i++){
            arr[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */