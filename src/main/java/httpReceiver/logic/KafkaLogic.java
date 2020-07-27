package httpReceiver.logic;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import httpReceiver.repository.Producer;

@Component
public class KafkaLogic implements MessageQueueLogic {
	@Autowired
	private Producer producer;
	
	public void produce(JSONObject message) {
		producer.send(message);
	}

}
