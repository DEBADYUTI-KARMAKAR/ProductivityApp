package com.springboot.webapp.productivityapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		List<Todo> todos= todoService.findByUsername("Debadyuti");
		//List<Todo> todos= todoService.findById(2);
		model.addAttribute("todos",todos);
		return "listTodos";
	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.GET)
	public String showNewTodoPage() {
		return "todo";
	}
	


//	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
//	public String addNewTodo(@RequestParam String description,ModelMap model) {
//		String username = (String)model.get("name");
//		todoService.addTodo(username, description, LocalDate.now().plusYears(1), false);
//		return "redirect:list-todos";
//		
//		
//	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.POST)
	public String addNewTodo(@RequestParam String description,ModelMap  model) {
		
		
		String username = (String)model.get("name");
		
		todoService.addTodo(username, description, LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
		
	}
}
