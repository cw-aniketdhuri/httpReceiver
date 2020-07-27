package httpReceiver.repository;

import org.json.simple.JSONObject;

public interface Producer {
	void send(JSONObject message);
}
