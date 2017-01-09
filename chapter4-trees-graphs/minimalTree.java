/*
4.2: Given a sorted (increasing order) array with unique integer elements, write an algorithm 
to create a binary search tree with minimal height
*/

TreeNode minimalTree(int arr[]){
	return createMinimalTree(arr, 0, arr.length-1);
}

TreeNode createMinimalTree(int arr[], int start, int end){
	// not "start >= end" because if start == end, one value in array -> can still be a single node
	if (start > end){
		return null;
	}
	int mid = (start + end)/2;
	TreeNode root = new TreeNode (arr[mid]);
	root.left = createMinimalTree(arr, start, mid-1);
	root.right = createMinimalTree(arr, mid+1, end);
	return root;
}