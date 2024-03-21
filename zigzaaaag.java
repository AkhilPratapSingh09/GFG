public class zigzaaaag {
    class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    Map<Integer, List<Integer>> map = new HashMap<>(); 
	    
	    helper(root, map, 0); 
	    
	    
	    ArrayList<Integer> result = new ArrayList<>(); 
	    
	    
	    
	    // loop through the map and put the values in result
	    // reverse the odd levels 
	    
	    for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
	        if (entry.getKey() % 2 != 0) {
	            List<Integer> values = entry.getValue(); 
	            
	            Collections.reverse(values); 
	            
	            result.addAll(values); 
	            
	        } else {
	            result.addAll(entry.getValue()); 
	        }
	    }
	    
	    
	    return result; 
	}
	
	// Pre-order traversal 
	// put nodes in in a hash map by level (0 based index)
	
	void helper(Node current, Map<Integer, List<Integer>> map , int level) {
	    if (current == null) return; 
	    
	    List<Integer> list = map.getOrDefault(level, new LinkedList<>());
	    
	    list.add(current.data); 
	    
	    map.put(level, list); 
	    
	    helper(current.left, map, level+1); 
	    helper(current.right, map, level+1); 

	}
}
}
