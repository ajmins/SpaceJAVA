package udemyPractices.InnerClasses;

public class Button {

	private String title;
	private OnClickListener onClickLister;
	
	public Button(String title) {
		this.title = title;
		
	}

	public String getTitle() {
		return title;
	}

	public void setOnClickLister(OnClickListener onClickLister) {
		this.onClickLister = onClickLister;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void onClick() {
		this.onClickLister.onClick(this.title);
	}
	
	public interface OnClickListener{
		public void onClick(String title);
	}
	
}
