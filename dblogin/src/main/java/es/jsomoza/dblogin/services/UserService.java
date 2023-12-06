package es.jsomoza.dblogin.services;

import es.jsomoza.dblogin.domain.User;

public interface UserService {
	public User findUserByUsername(String username);
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
