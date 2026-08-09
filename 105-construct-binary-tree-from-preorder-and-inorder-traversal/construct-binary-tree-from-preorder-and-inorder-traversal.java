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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildBinaryTree(preorder,inorder,0,0,inorder.length-1);
    }


    public TreeNode buildBinaryTree(int[] preorder, int[] inorder, int preIdx, int inStart, int inEnd){
        if(preIdx >= preorder.length || inStart > inEnd ) return null;

        TreeNode root = new TreeNode(preorder[preIdx]);

        Integer rootIdx = findIdx(inorder, root.val, inStart, inEnd);

        Integer numLeftTreeEle = rootIdx - inStart;
        root.left = buildBinaryTree(preorder,inorder, preIdx+1, inStart, rootIdx-1);
        root.right = buildBinaryTree(preorder, inorder, preIdx+numLeftTreeEle+1,rootIdx+1,inEnd);

        return root;
    }

    public Integer findIdx(int[] arr, int value, int start, int end){
        for(int i=start;i<=end;i++){
            if(arr[i] == value) return i;
        }
        return -1;
    }
}