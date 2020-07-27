package httpReceiver.logic;

import org.json.simple.JSONObject;

public interface MessageQueueLogic {
	void produce(JSONObject message);
}
