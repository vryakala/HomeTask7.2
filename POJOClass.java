package homeTask7Point2;

public class POJOClass {

	private int userId;
	private int id;
	private String title;
	private String body;

	public int getUserID() {
		return userId;
	}

	public void setUserID(int userID) {
		userId = userID;
	}

	public int getID() {
		return id;
	}

	public void setID(int iD) {
		id = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "POJOClass [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}

}