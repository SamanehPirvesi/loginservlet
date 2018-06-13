package dao;

import java.util.Map;
import java.util.TreeMap;

import model.User;

public class UserDao {

	private Map<String,User> users=new TreeMap<>();
	

	public UserDao() {
	
//		User user=new User()[u1=("sara","s1234"),u2=("maryam","m456")];
		
	}

	public Map<String, User> getUsers() {
		return users;
	}

	public void setUsers(Map<String, User> users) {
		this.users = users;
	}
	
	
}
