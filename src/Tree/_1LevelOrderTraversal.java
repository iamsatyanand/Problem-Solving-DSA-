package Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _1LevelOrderTraversal {

    public static List<Integer> levelOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            result.add(curr.val);

            if(curr.left != null){
                queue.offer(curr.left);
            }

            if(curr.right != null){
                queue.offer(curr.right);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Integer[] arr = {3,9,20,null,null,15,7, 8,4,5,6,7,8,1,2,3,3,4,5};

        TreeNode root = TreeBuilder.build(arr);

        List<Integer> result = levelOrder(root);

        System.out.println(result);

        for(Integer node : result){
            System.out.println(node);
        }

    }
}
