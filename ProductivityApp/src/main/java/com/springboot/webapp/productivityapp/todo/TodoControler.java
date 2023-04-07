package com.springboot.webapp.productivityapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoControler {
	
	private TodoService todoService;
	
	public TodoControler(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	//list-todos
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos= todoService.findByUsername("Rajdeep");
		//List<Todo> todos= todoService.findById(2);
		model.addAttribute("todos",todos);
		return "listTodos";
	}
}
