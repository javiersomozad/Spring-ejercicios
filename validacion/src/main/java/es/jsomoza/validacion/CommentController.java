package es.jsomoza.validacion;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Valid;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

@Controller
public class CommentController {
	@GetMapping("/")
	public String greetingForm() {
	    return "index";
	}
	  
	@GetMapping("/comment")
	public String commentForm(Model model) {
	  	Comment comment = new Comment();
	    model.addAttribute("comment", comment);    
	    return "comment";
	}

	
	@PostMapping("/comment")
	public String commentSubmit(@Valid Comment comment, 
			  						BindingResult bindingResult) {
	   if (bindingResult.hasErrors()) {
		   System.err.println("Error in validation " 
	    			+ bindingResult.getAllErrors());
		   return "comment";
	   }
	   return "commentSaved";
	}
		
}
