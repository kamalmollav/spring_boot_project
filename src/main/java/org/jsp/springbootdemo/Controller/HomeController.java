package org.jsp.springbootdemo.Controller;

import org.jsp.springbootdemo.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
 @RequestMapping("/home")
 @ResponseBody
 public String home() {
 return "Hello from Home Controller";
}
 @RequestMapping("/test")
	 @ResponseBody
	 public String test() {
		 return "It is tested";
	 }
 @PostMapping("/sum")
 @ResponseBody
 public String getSum(@RequestParam int n1, @RequestParam int n2) {
	 return "The sum is:"+(n1+n2);
 }
 @GetMapping("/diff")
	 public String getdiff(@RequestParam int n1,@RequestParam int n2) {
		 return "The difference is:"+(n1-n2);
	 }
 @GetMapping("/even/{num}")
 public String evenOrOdd(@PathVariable(name="num")int num) {
	 return num%2==0? num+"is an return number":num+"is an add Number";
 }
 @GetMapping("/users")
 public User getUser() {
	 return new User(1,"ABC",777,"7@gmail.com");
 }
@PostMapping("/users")
public String printUser(@RequestBody User user) {
	System.out.println("id:"+user.getId());
	System.out.println("name:"+user.getName());
	System.out.println("phone:"+user.getPhone());
	System.out.println("email:"+user.getEmail());
	System.out.println("------------------");
	return "the details are printed";
}
 
 }
 

