package httpReceiver.repository;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer implements Producer {

    @Value("e6v4jewb-default")
    private String topic;

	@Autowired
	private KafkaTemplate<String, JSONObject> kafkaTemplate;
	@Override
	public void send(JSONObject message)
	{
		kafkaTemplate.send(topic, message);
	}

}
