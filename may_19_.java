    class StockSpanner {
        Stack<pair> stack;
        public StockSpanner() {
        stack = new Stack<>();
        }

        public int next(int price) {
        if (stack.size()==0){
            stack.add(new pair(price,1));
        }else{
            int contri = 1;
            while (stack.size()>0){
                if (stack.peek().item<=price){
                    contri+=stack.pop().value;
                }else{
                    break;
                }
            }
            stack.add(new pair(price,contri));
        }
        return stack.peek().value;
        }
        static class pair{
            int item;
            int value;
            pair(int item , int value){
                this.item=item;
                this.value=value;
            }

        }
    }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
