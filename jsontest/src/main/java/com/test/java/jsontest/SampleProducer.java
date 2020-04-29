package com.test.java.jsontest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.stream.Stream;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleProducer {

	@SuppressWarnings({ "unchecked", "resource", "rawtypes" })
	public SampleProducer() throws IOException, ParseException {

		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092");// bootsrapservers
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		KafkaProducer kafkaProducer = new KafkaProducer<Object, Object>(props);
		kafkaProducer.send(createProducer());

	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException, ParseException {
			SampleProducer producer=new SampleProducer();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static ProducerRecord createProducer() throws IOException, ParseException {

		// System.out.println("Start date:" + new SimpleDateFormat("dd/MM/yyyy
		// HH:mm:ss").format(new Date()));
		FileReader reader = new FileReader("data.json");
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

		Stream.Builder<String> strb = Stream.builder();
		JSONArray contentObj = (JSONArray) jsonObject.get("content");

		for (int i = 1; i < 50; i++) {
			for (int j = 1; j < 50; j++) {
				strb.add("{\"type\":\"jumbo\",\"content\":[");
				for (int n = 0; n < ((JSONArray) jsonObject.get("content")).size(); n++) {
					JSONObject contentArrayObj = (JSONObject) contentObj.get(n);
					JSONObject tagObj = (JSONObject) ((JSONObject) contentArrayObj).get("tags");
					tagObj.put("rpdMacAddr", "70:b3:17:d1:" + i + ":" + j);
					strb.add(contentArrayObj.toString());
				}
				strb.add("]}");
			}
		}
		// System.out.println("End date:" + new SimpleDateFormat("dd/MM/yyyy
		// HH:mm:ss").format(new Date()));

		return new ProducerRecord("kafka-producer-test", strb.build());
	}
}
