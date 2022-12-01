import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.Set;

public class Database {
    private final Map<String, Department> departments;
    
    public Database() {
    	departments = new LinkedHashMap<>();
    }
    
    public Department getDeptName(String i) {
    	return departments.get(i); 
    }
    
    public void insertUser(String i, Department user) {
    	departments.put(i, user); 
    }
    
    public ArrayList<String> getUserNames() {
    	ArrayList<String> names = new ArrayList<>();
    	
    	// Iterator<String> iterator = null;
    	// Set hasMapKeys = departments.keySet();
    	// iterator =  hasMapKeys.iterator();
        // while ( iterator.hasNext())
        // {
        // //    String key = (String) iterator.next();
	    // //    names.add(departments.get(key).getDeptName());                        	
        // }
    	return names; 
    	
    }

}
