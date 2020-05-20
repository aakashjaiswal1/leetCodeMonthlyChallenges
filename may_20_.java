class Solution {
        public  int kthSmallest(TreeNode root, int k) {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            while (stack.size()>0 && k > 0){
                if (stack.peek()!=null){
                    while (stack.peek().left != null) {
                        stack.add(stack.peek().left);
                    }
                }else stack.pop();
                if (stack.size()==0)return -1;
                TreeNode node = stack.pop();
                k--;
                if (k == 0) return node.val;
                    stack.add(node.right);
            }
            return -1;
        }
}
