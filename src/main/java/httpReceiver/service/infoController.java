package httpReceiver.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class infoController {
	@RequestMapping("hello")
	public String sayHi() {
		return "Hello";
	}
	
//	@PostMapping("info")
//	public boolean postInfo(String info) 
//	{
//		JSONObject obj = new JSONObject();
//		return false;	
//	}
}
