package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBuilder {

    public static TreeNode build(Integer[] arr){

        // check everything is null or empty
        if(arr == null || arr.length == 0 || arr[0] == null){
            return null;
        }
        // place 0th element in the root
        TreeNode root = new TreeNode(arr[0]);
        // put it in queue

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1; // to traverse the array

        while(i < arr.length){
            // use the root reference so that we can bind all the nodes (pick from queue)
            TreeNode curr = queue.poll();

            if(i < arr.length && arr[i] != null){
                // add its left which will be the root's left ultimately
                curr.left = new TreeNode(arr[i]);
                // push this node inside the queue
                queue.offer(curr.left);
            }
            i++; // as we have to find the another child i.e. right of the current node

            // do the above for right node also
            if(i < arr.length && arr[i] != null){
                curr.right = new TreeNode(arr[i]);
                queue.offer(curr.right);
            }
            i++;
        }

        return root;



    }
}
