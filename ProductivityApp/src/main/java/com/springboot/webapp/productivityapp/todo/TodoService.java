package com.springboot.webapp.productivityapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
	private static List<Todo> todos;

	static {
		todos.add(new Todo(1, "Debadyuti", "Learn SpringBoot", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(1, "Debadyuti", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(1, "Debadyuti", "Learn AWS", LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}

}
