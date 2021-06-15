package BinaryTree;
public class BinaryTreeApp {
   public static void main(String[] args) {
        var binding = new Binarytree();
        
        TreeNode node;
        node = new TreeNode('D');
        binding.insert(node);
        
        node = new TreeNode('B');
        binding.insert(node);
        
        node = new TreeNode('A');
        binding.insert(node);
        
        node = new TreeNode('C');
        binding.insert(node);
        
        node = new TreeNode('F');
        binding.insert(node);
        
        node = new TreeNode('E');
        binding.insert(node);
        
        node = new TreeNode('G');
        binding.insert(node);
        
    
        System.out.println("Traversal dengan Preorder : ");
        binding.preOrder();
        System.out.println("\nTraversal dengan Postorder : " );
        binding.postOrder();
        System.out.println("\nTraversal dengan Inorder : " );
        binding.inOrder();
        System.out.println();
        System.out.println();
        System.out.println("Muhammad Haidar Rasyiq ");
    }
// A. Predesesor : F merupakan predesesor E dan G
// B. Succesor   : A dan C merupakan Succesor dari B 
// C. Ancestor   : D dan B merupakan Ancestor dari C
// D. Descendant : C dan B merupakan Descendant dari D 
// E. Parent     : B merupakan Parent dari C
// F. Child      : C merupakan Child dari B
// G. Sibling    : A dan C merupakan Sibling
// H. Subtree    : Subtree B,A,C dan Subtree F,E,G
// I. Size       : gambar tree diatas memiliki siza = 7
}