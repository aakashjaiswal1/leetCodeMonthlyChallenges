class Solution {
    static int pos;
    public TreeNode bstFromPreorder(int[] preorder) {
        pos = 0;
        return helper(preorder,100000000+1);
    }
    static TreeNode helper(int[] arr,int bound){
        if(pos == arr.length || arr[pos] > bound) return null;
        TreeNode node = new TreeNode(arr[pos++]);
        node.left = helper(arr,arr[pos-1]);
        node.right = helper(arr,bound);
        return node;
    }
}
