package dao;

import java.util.Map;
import java.util.TreeMap;

import model.User;

public class UserDao {

	private Map<String, User> users = new TreeMap<>();

	public UserDao() {
		User u1 = new User("sara", "s123");
		User u2 = new User("maryam", "456");
		User u3 = new User("mahsa", "653");
		User u4 = new User("marco", "m678");
		users.put(u1.getName(), u1);
		users.put(u2.getName(), u2);
		users.put(u3.getName(), u3);
		users.put(u4.getName(), u4);
	}
	public void createUser(String name, String password) {
		for (User i : users.values()) {
			if (i.getName().equals(null)) {
				User u = new User(name, password);
				users.put(name, u);
			} else {
				System.out.println("the user has been insert already");
			}
		}
	}

	public void deleteUser(String name) {
		users.remove(name);
	}

	public User getUserByName(String name) {
		User user = (User) users.values().stream().filter(u -> u.getName().equals(name));
		return user;
	}

	public void upDateUserByName(String name, String password) {
		User u = getUserByName(name);
		u.setPassword(password);
	}

}
