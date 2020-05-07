/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     static int xDegree;
     static int yDegree;
    static int xParent;
     static int yParent;
    public boolean isCousins(TreeNode root, int x, int y) {
      xDegree = -1;
        yDegree = -1;
        xParent=-1;
        yParent=-1;
        if(root == null)return false;
        helper(root,0,-1,x,y);
        if(xDegree == yDegree && xParent != yParent){
            return true;
        }
        return false;
    }
    static void helper(TreeNode node,int degree,int parent,int x ,int y){
       if(node == null)return;
        if(node.val == x){
            xDegree = degree;
            xParent = parent;
        }
         if(node.val == y){
            yDegree = degree;
            yParent = parent;
        }
        helper(node.left,degree+1,node.val,x,y);
         helper(node.right,degree+1,node.val,x,y);
    }
}
