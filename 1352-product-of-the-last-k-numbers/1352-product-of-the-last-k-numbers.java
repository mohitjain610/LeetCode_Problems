class ProductOfNumbers {
    ArrayList<Integer> list;
    int t=-1;
    int i=0;
    int pro=1;
    public ProductOfNumbers() {
        list=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0){
            list.add(0);
            pro=1;
            t=i;
        }else{
            pro*=num;
            list.add(pro);
        }
        i++;
    }
    
    public int getProduct(int k) {
        int p=i-1-k;
        if(p<t)return 0;
        else if(p==t)return list.get(i-1);
        else{
            return list.get(i-1)/list.get(p);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */