//written by Brian Noutchang

public class TreeNode<T> {
	private T data;
	private TreeNode<T> leftChild, rightChild;
	
	public TreeNode (T dataNode) {
		data = dataNode;
		leftChild = null;
		rightChild = null;
	}
	
	//constructor for making deep copies
	public TreeNode (TreeNode<T> node) {
		data = node.data;
		leftChild = node.leftChild;
		rightChild = node.rightChild;
	}
	
	public T getData () {
		return data;
	}
	
	public TreeNode<T> getLeftChild () {
		return leftChild;
	}
	public TreeNode<T> getRightChild () {
		return rightChild;
	}
	
	//check if this node has a left child
	public boolean hasLeftChild () {
		return leftChild != null;
	}
	//check if this node has a right child
	public boolean hasRightChild () {
		return rightChild != null;
	}
	
	//sets left child to the specified node
	public void setLeftChild (TreeNode<T> node) {
		leftChild = node;
	}
	//sets right child to the specified node
	public void setRightChild (TreeNode<T> node) {
		rightChild = node;
	}
}
