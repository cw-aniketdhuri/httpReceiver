package httpReceiver.service;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class infoController {
	@RequestMapping("hello")
	public String sayHi() {
		return "Hello";
	}
	
	@PostMapping("info")
	public JSONObject postInfo(@RequestBody JSONObject info) 
	{
		return info;
	}
}
