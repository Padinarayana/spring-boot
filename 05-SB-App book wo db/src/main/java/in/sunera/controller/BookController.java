package in.sunera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sunera.binding.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String loadForm(Model model) {
		Book bookObj=new Book();
		model.addAttribute("book", bookObj);
		return "index";
	}
	
	@PostMapping("/saveBook")
	public String handleSubmitBtn(Book book, Model model) {
		System.out.println(book);
		// logic to store the data in databse
		return "success";
	}
}
