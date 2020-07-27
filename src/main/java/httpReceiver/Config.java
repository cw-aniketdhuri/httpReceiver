package httpReceiver;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import httpReceiver.logic.KafkaLogic;
import httpReceiver.logic.MessageQueueLogic;
import httpReceiver.repository.KafkaProducer;
import httpReceiver.repository.Producer;

@Configuration
@ComponentScan("com.baeldung.constructordi")
public class Config {
	public MessageQueueLogic messageQueueLogic()
	{
		return new KafkaLogic();
	}

	public Producer producer()
	{
		return new KafkaProducer();
	}
}
