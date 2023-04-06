package com.springboot.webapp.productivityapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos= new ArrayList<>();

	static {
		todos.add(new Todo(1, "Debadyuti", "Learn SpringBoot", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "Parthib", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "Rajdeep", "Learn AWS", LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String id){
		return todos;
	}

}
