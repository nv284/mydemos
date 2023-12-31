package com.example.SpringDemo11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping(path="/demo") 
public class MainController {
	@Autowired 
    private User1Repository userRepository;

@PostMapping(path="/add") 
public @ResponseBody String addNewUser (@RequestParam String name
 , @RequestParam String email) {

User1 n = new User1();
n.setName(name);
n.setEmail(email);
userRepository.save(n);
return "Saved";
}

@GetMapping(path="/all")
public @ResponseBody Iterable<User1> getAllUsers() {

return userRepository.findAll();
}
}
