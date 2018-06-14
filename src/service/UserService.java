package service;

import dao.UserDao;
import model.User;

public class UserService {

	UserDao udao = new UserDao();

	public UserService() {

	}

	public void createUser(String name, String password) {
		udao.createUser(name, password);
	}

	public void deleteUser(String name) {
		udao.deleteUser(name);
	}

	public User getUserByName(String name) {
		return udao.getUserByName(name);
	}

	public void upDateUserByName(String name, String password) {
		udao.upDateUserByName(name, password);
	}

	public boolean isUserCorrect(String username, String password) {
		boolean result = false;
		User u = getUserByName(username);
		if ((u != null) && (u.getPassword().equals(password))) {
			result = true;
		}
		return result;
	}
}
