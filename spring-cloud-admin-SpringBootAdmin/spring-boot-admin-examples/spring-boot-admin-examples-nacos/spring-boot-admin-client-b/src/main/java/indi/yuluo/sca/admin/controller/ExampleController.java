package indi.yuluo.sca.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

@RestController
@RequestMapping("/b")
public class ExampleController {

	@GetMapping("/hello")
	public String hello() {

		return "Hello, Spring Boot Admin Clent B!";
	}

}
