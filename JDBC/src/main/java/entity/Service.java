package entity;

public class Service {
	private String title;
	private String username;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Service [title=" + title + ", username=" + username + "]";
	}
	
}
