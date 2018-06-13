package model;

public class User {

	private long user_id;

	private String name;
	private String password;

	public User() {

	}

	public User(String name, String password) {

		this.name = name;
		this.password = password;

	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
