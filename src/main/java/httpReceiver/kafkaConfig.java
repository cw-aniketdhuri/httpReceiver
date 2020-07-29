package httpReceiver;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.SaslConfigs;
import org.apache.kafka.common.serialization.StringSerializer;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

@Configuration
public class kafkaConfig {

	@Value("${kafka.boot.server}")
	private String kafkaServer;
	
	@Bean
	public KafkaTemplate<String, JSONObject> kafkaTemplate(){
		Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
		return new KafkaTemplate<>(producerConfig());
	}
	
	@Bean
	public ProducerFactory<String, JSONObject> producerConfig(){
		Map<String, Object> config = new HashMap<>();
		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaServer);
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		config.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SASL_SSL");
		config.put(SaslConfigs.SASL_MECHANISM, "SCRAM-SHA-256");
		return new DefaultKafkaProducerFactory<>(config);
	}
}
