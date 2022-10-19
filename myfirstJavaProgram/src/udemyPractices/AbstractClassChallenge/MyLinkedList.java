package udemyPractices.AbstractClassChallenge;


public class MyLinkedList implements NodeList{
	private ListItem root = null;
	

	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
		
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if (this.root == null) {
			//the list was empty, so this item becomes the head of the list
			this.root = newItem;
			return true;
		}
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int compare = (currentItem.compareTo(newItem));
			if (compare < 0) {
				//newItem is greater, move right
				if (currentItem.next() != null) {
					currentItem = currentItem.next();
				}
				else {
					//there is no next, so insert at the end of list
					currentItem.setNext(newItem).setPrevious(currentItem);
					//newItem.setPrevious(currentItem);
					return true;
				}
			}
			else if (compare >0) {
				//newItem is less, insert before
				if(currentItem.previous() != null) {
					currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
					//newItem.setPrevious(currentItem.previous());
					newItem.setNext(currentItem).setPrevious(newItem);
					//currentItem.setPrevious(newItem);
				}
				else {
					//node with previous is the root
					newItem.setNext(this.root).setPrevious(newItem);
					//this.root.setPrevious(newItem);
					this.root =  newItem;
				}
				return true;
			}
			else {
				//equal
				System.out.println(newItem.getValues()+ "is already present, not added");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		if (item != null) {
			System.out.println("Deleting item "+ item.getValues());
		}
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int compare = currentItem.compareTo(item);
			if (compare == 0) {
				//found item to delete
				if (currentItem == this.root) {
					this.root = currentItem.next();
				}
				else {
					currentItem.previous().setNext(currentItem.next());
					if (currentItem.next() != null) {
						currentItem.next().setPrevious(currentItem.previous());
					}
				}
				return true;
				
			}
			else if (compare <0) {
				currentItem = currentItem.next();
			}
			else {
				//at an item greater than one to be deleted, so the item is not in list
				return false;
			}
		}
		//reached end of the list, without finding the item in the list
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		if (root == null) {
			System.out.println("List is empty");
		}
		else {
			while (root != null) {
				System.out.println(root.getValues());
				root = root.next();
			}
		}

	}

}
