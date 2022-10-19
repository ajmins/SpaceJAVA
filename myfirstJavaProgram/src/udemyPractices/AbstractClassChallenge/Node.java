package udemyPractices.AbstractClassChallenge;

public class Node extends ListItem {

	public Node(Object values) {
		super(values);
		// TODO Auto-generated constructor stub
	}

	@Override
	ListItem next() {
		return this.nextItem;
	}

	@Override
	ListItem setNext(ListItem item) {
		this.nextItem = item;
		return this.nextItem;
	}

	@Override
	ListItem previous() {
		return this.previousItem;
	}

	@Override
	ListItem setPrevious(ListItem item) {
		this.previousItem = item;
		return this.previousItem;
	}

	@Override
	int compareTo(ListItem item) {
		//compare items are equal using getValues() and cast both to Strings
		if (item != null) {
			return ((String) super.getValues()).compareTo((String) item.getValues());
		}
		else {
			return -1;
		}
	}

}
