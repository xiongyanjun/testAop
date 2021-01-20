package leetcode;


/**
 *输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 *
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *
 *
 * @author : xiongyanjun  Date: 2021/1/19 ProjectName: settleprovisions Version: 1.0
 */
public class BuildTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    /**
     *
     * @param preorder 前序遍历
     * @param inorder  中序遍历
     * @return         二叉树
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        //preorder[0]为根节点
        //找到preorder[0]在inorder中的位置
        //inorder中preorder[0]之前为左子树，之后为右子树

        int rootVal = preorder[0];
        int indexOfRootInInorder = indexOfRootInInorder(rootVal, inorder);
        //左子树长度
        int leftSubtreeLength = indexOfRootInInorder;
        //右子树长度
        int rightSubtreeLength = preorder.length - 1 - indexOfRootInInorder;
        //左子树前序遍历数组
        int[] leftSubtreePreorder = truncatedArray(preorder,1,leftSubtreeLength);
        //左子树中序遍历数组
        int[] leftSubtreeInorder = truncatedArray(inorder,0,leftSubtreeLength);
        //右子树前序遍历数组
        int[] rightSubtreePreorder = truncatedArray(preorder,1 + leftSubtreeLength,rightSubtreeLength);
        //右子树中序遍历数组
        int[] rightSubtreeInorder = truncatedArray(inorder,1 + leftSubtreeLength,rightSubtreeLength);
        TreeNode treeNode = new TreeNode(rootVal);
        if (leftSubtreePreorder.length != 0 && leftSubtreeInorder.length != 0){
            treeNode.left = buildTree(leftSubtreePreorder,leftSubtreeInorder);
        }
        if (rightSubtreePreorder.length != 0 && rightSubtreeInorder.length != 0){
            treeNode.right = buildTree(rightSubtreePreorder,rightSubtreeInorder);
        }
        return treeNode;
    }

    public static void main(String[] args) {
        BuildTree buildTree = new BuildTree();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode treeNode = buildTree.buildTree(preorder, inorder);
        System.out.printf(treeNode.toString());

    }

    //截断数组  0 1 2 3 4
    int[] truncatedArray(int[] arr,int begin,int truncatedLength){
        int[] temp = new int[truncatedLength];
        for (int i = 0; i < truncatedLength; i++) {
            temp[i] = arr[i + begin];
        }
        return temp;
    }

    //val在array中的位置下标
    int indexOfRootInInorder(int root,int[] inorder){
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root){
                return i;
            }
        }
        return -1;
    }
}
