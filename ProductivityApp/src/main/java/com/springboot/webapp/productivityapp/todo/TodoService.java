package com.springboot.webapp.productivityapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos= new ArrayList<>();
	private static int todosCount = 0;
	static {
		todos.add(new Todo(++todosCount, "Debadyuti", "Learn SpringBoot", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "Debadyuti", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "Debadyuti", "Learn AWS", LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String id){
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}
	
	public void deleteTodo(int id) {	
		Predicate<? super Todo> predicate = todo -> todo.getId()==id;
		todos.removeIf(predicate );
	}
}
