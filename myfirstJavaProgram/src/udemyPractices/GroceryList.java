package udemyPractices;
import java.util.ArrayList;


public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    //add a getter to access arrays
    public ArrayList<String> getGroceryList() {
		return groceryList;
	}
    
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ") " + groceryList.get(i));
        }
    }



	private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

//    public String findItem(String searchItem) {
//        int position = groceryList.indexOf(searchItem);
//        //returns -1 if not present
//        if(position >=0) {
//            return groceryList.get(position);
//        }
//
//        return null;
//    }
    //some modifications
    public void modifyGroceryItem(String currentItem, String newItem) {
    	int position = findItem(currentItem);
    	if(position >= 0) {
    		modifyGroceryItem(position, newItem);
    	}
    }
    //change this also to private and cretae another public function
    private int findItem(String searchItem) {
    	return groceryList.indexOf(searchItem);
    }
    public void removeGroceryItem(String item) {
    	int position = findItem(item);
    	if(position >= 0) {
    		removeGroceryItem(position);
    	}
    }
    //also change the functions that deal with positions to private
    
    public boolean onFile(String searchItem) {
		int position = findItem(searchItem);
		if(position >= 0) {
			return true;
		}
		return false;
	}
}
