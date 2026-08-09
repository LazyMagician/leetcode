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
        Map<Integer,Integer> inorderIndices = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            inorderIndices.put(inorder[i],i);
        }
        return buildBinaryTree(inorderIndices,preorder,inorder,0,0,inorder.length-1);
    }


    public TreeNode buildBinaryTree(Map<Integer,Integer> inorderMap,int[] preorder, int[] inorder, int preIdx, int inStart, int inEnd){
        if(preIdx >= preorder.length || inStart > inEnd ) return null;

        TreeNode root = new TreeNode(preorder[preIdx]);

        // Integer rootIdx = findIdx(inorder, root.val, inStart, inEnd);
        Integer rootIdx = inorderMap.get(root.val);

        Integer numLeftTreeEle = rootIdx - inStart;
        root.left = buildBinaryTree(inorderMap,preorder,inorder, preIdx+1, inStart, rootIdx-1);
        root.right = buildBinaryTree(inorderMap,preorder, inorder, preIdx+numLeftTreeEle+1,rootIdx+1,inEnd);

        return root;
    }

   
}