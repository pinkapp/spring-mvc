package org.springframework.samples.mvc.simple;

import javax.servlet.http.HttpServletRequest;

import model.ValidationResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	@RequestMapping("/simple")
	public @ResponseBody String simple() {
		return "Hello world!";
	}
	
	@RequestMapping(value="/s",method=RequestMethod.GET)
	public @ResponseBody ValidationResponse s(HttpServletRequest request){
	    System.out.println(request.getParameter("ss"));
		ValidationResponse res = new ValidationResponse();
		res.setStatus("test");
		return res;
	}

}
