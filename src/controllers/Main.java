package controllers;

import java.util.ArrayList;
import java.util.List;

import models.User;

public class Main {

	public static void main(String[] args) 
	{

		List<User> users = new ArrayList<User>();
		users.add(new User("Stewie", "Griffin", "stewie@griffin.com", "secret"));
		users.add(new User("Peter", "Griffin", "peter@griffin.com", "secret"));
		users.add(new User("Meg", "Griffin", "meg@griffin.com", "secret"));
		System.out.println(users);
	}
}
