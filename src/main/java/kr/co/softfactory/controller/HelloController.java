package kr.co.softfactory.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	private static Log logger = LogFactory.getLog(HelloController.class);
	
	@RequestMapping("/")
	public String loadIndex() {
		logger.info("load index page");
		return "index";
	}
}
