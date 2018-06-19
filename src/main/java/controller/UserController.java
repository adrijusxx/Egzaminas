package controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;
import service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	public UserService userService;

	@GetMapping("/")
	public String index(Model model){
		model.addAttribute("users", userService.getAll());
		return "index";
	}
	
	@GetMapping("/user/{id}")
	public String getById(@PathVariable("id") int id, Model model) {
		model.addAttribute("user", userService.getById(id));
		return "showFood";
	}
	
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		model.addAttribute("user", userService.getById(id));
		return "editFood";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(@ModelAttribute("user") User user) {
		userService.update(user);
		return "redirect:/user/" + user.getId();
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		userService.delete(id);
		return "redirect:/";
	}
	
	
	@GetMapping("/addFood")
	public String createUserPage(Model model) {
		model.addAttribute("user", new User());
		return "createFood";
	}
	
	@PostMapping("/addFood")
	public String addFood(@Valid User user, BindingResult bindingResult, Model model) {
		if (!bindingResult.hasErrors()) {
			model.addAttribute("noErrors", true);
			userService.save(user);
		}
		return "createFood";
	}
}
