package com.messages.consumer.payload;

import java.util.Date;
import java.util.List;

public class Sensor {

    private String deviceID;
    private Date timestamp;
    private List temperatureAvg;

    @Override
    public String toString() {
        return "sensor{" +
                "deviceID='" + deviceID + '\'' +
                ", timestamp=" + timestamp +
                ", temperatureAvg=" + temperatureAvg +
                '}';
    }
}
