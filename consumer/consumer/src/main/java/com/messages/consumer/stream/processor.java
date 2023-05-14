package com.messages.consumer.stream;

import com.messages.consumer.payload.Sensor;
import jakarta.annotation.PostConstruct;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.serializer.JsonSerde;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class processor {
    @Autowired
    private StreamsBuilder streamsBuilder;

    @PostConstruct
    public void stream_topology(){
    //public KStream<String, Sensor> kStreamJson(StreamsBuilder builder){

        KStream<String, String> KStream = streamsBuilder.stream("raw_messages", Consumed.with(Serdes.String(), Serdes.String()));
        //KStream<String, Sensor> KStream = builder.stream("raw_messages", Consumed.with(Serdes.String(), new JsonSerde<>(Sensor.class)));
        KStream.foreach((k,v) -> System.out.println("Value = " + v));

        //KStream.foreach((k,v) -> System.out.println("Key = " + k + "Value = " + v));
        //KStream.to(KafkaHeaders.TOPIC);
        //return KStream;
    }
}
