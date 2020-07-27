package httpReceiver.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import httpReceiver.logic.MessageQueueLogic;

@RestController
public class infoController {
	@Autowired
	private MessageQueueLogic kafkaLogic;
	
	@PostMapping("info")
	public boolean postInfo(@RequestBody JSONObject info)
	{
//		try
//		{
			this.kafkaLogic.produce(info);
			return true;
//		}
//		catch (Exception ex)
//		{
//			System.out.print(ex);
//			return false;
//		}
	}
}
