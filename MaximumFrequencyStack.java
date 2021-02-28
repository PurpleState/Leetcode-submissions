class FreqStack {
    Map<Integer, Integer> frequency;
    Map<Integer, Stack<Integer>> group;
    int maxFrequency;

    public FreqStack() {
        frequency = new HashMap();
        group = new HashMap();
        maxFrequency = 0;
    }
    
    public void push(int x) {
        int f = frequency.getOrDefault(x,0)+1;
        frequency.put(x,f);
        if(f>maxFrequency){
            maxFrequency = f;
        }
        Stack<Integer> ts = group.getOrDefault(f, new Stack<Integer>());
        ts.push(x);
        group.put(f,ts);
    }
    
    public int pop() {
        int x = group.get(maxFrequency).pop();
        frequency.put(x, maxFrequency-1);
        if(group.get(maxFrequency).size()==0){
            group.remove(maxFrequency);
            maxFrequency--;
        }
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
