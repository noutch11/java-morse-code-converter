//written by Brian Noutchang

import java.util.ArrayList;

public class MorseCodeTree implements LinkedConverterTreeInterface<String> {
	private TreeNode<String> root;
	
	public MorseCodeTree () {
		buildTree();
	}
	
	@Override
	public TreeNode<String> getRoot() {
		return root;
	}

	@Override
	public void setRoot(TreeNode<String> newNode) {
		root = new TreeNode <String> (newNode);
		
	}

	@Override
	//calls the recursive method addNode
	public void insert(String code, String letter) {
		addNode (getRoot(), code, letter);
	}

	@Override
	public void addNode(TreeNode<String> root, String code, String letter) {
		
		//for a code with only one character
		if (code.length() == 1)
		{
			if (code.compareTo(".") == 0)//add the entry as the left child
				root.setLeftChild(new TreeNode<String> (letter));
			
			else if (code.compareTo("-") == 0)//add the entry as the right child
				root.setRightChild(new TreeNode<String> (letter));
			
			
			
		}//recursion for a code with more than one character
		else if (code.length() > 1)
		{
			//check the first character
			
			if (code.charAt(0) == '.')
			{
				/* new root becomes the left child
				 * new code becomes all the remaining characters in the code
				 */
				addNode (root.getLeftChild(), code.substring(1), letter);
			}
			else if (code.charAt(0) == '-')
			{
				/* new root becomes the right child
				 * new code becomes all the remaining characters in the code
				 */
				addNode (root.getRightChild(), code.substring(1), letter);
			}
		}
		
	}

	@Override
	//calls recursive method fetchNode
	public String fetch(String code) {
		return fetchNode (getRoot(), code);
	}

	@Override
	public String fetchNode(TreeNode<String> root, String code) {
		String result = "";
		
		//for a code with only one character, return either left or right child
		if (code.length() == 1)
		{
			if (code.compareTo(".") == 0)//return left child data
				result = root.getLeftChild().getData();
			
			else if (code.compareTo("-") == 0)//return right child data
				result = root.getRightChild().getData();
		}
		//for a code with multiple characters, use recursion to find target data
		else if (code.length() > 1)
		{
			//check the first character
			
			if (code.charAt(0) == '.')
			{
				//new root becomes the left child
				//new code becomes all the remaining characters in the code
				return fetchNode (root.getLeftChild(), code.substring(1));
			}
			else if (code.charAt(0) == '-')
			{
				// new root becomes the right child
				// new code becomes all the remaining characters in the code
				return fetchNode (root.getRightChild(), code.substring(1));
			}
		}
		return result;
	}

	@Override
	public LinkedConverterTreeInterface<String> delete(String data) throws UnsupportedOperationException {
		//not support for MorseCodeTree class
		return null;
	}

	@Override
	public LinkedConverterTreeInterface<String> update() throws UnsupportedOperationException {
		//not supported for MorseCodeTree class
		return null;
	}

	@Override
	//build a tree, level by level, based on the letters and their morse codes
	public void buildTree() {
		//level 0 - the root is an empty string
		setRoot (new TreeNode<String> (""));
		
		//level 1 insertions
		insert (".", "e");
		insert ("-", "t");
		
		//level 2 insertions
		insert("..", "i");
		insert(".-", "a");
		insert("-.", "n");
		insert("--", "m");
		
		//level 3 insertions
		insert ("...", "s");
		insert ("..-", "u");
		insert (".-.", "r");
		insert (".--", "w");
		insert ("-..", "d");
		insert ("-.-", "k");
		insert ("--.", "g");
		insert ("---", "o");
		
		//level 4 insertions
		insert ("....", "h");
		insert ("...-", "v");
		insert ("..-.", "f");
		insert (".-..", "l");
		insert (".--.", "p");
		insert (".---", "j");
		insert ("-...", "b");
		insert ("-..-", "x");
		insert ("-.-.", "c");
		insert ("-.--", "y");
		insert ("--..", "z");
		insert ("--.-", "q");
		
	}

	@Override
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		LNRoutputTraversal (getRoot(), list);
		return list;
	}

	@Override
	public void LNRoutputTraversal(TreeNode<String> root, ArrayList<String> list) {
		if (root != null) {
			LNRoutputTraversal (root.getLeftChild(), list);
			list.add (root.getData());
			LNRoutputTraversal (root.getRightChild(), list);
		}
		
	}

}
