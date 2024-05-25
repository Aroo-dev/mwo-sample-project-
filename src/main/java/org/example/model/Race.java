package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
@Data
public class Race{
    @JsonProperty("session_key")
    public int sessionKey;
    @JsonProperty("meeting_key")
    public int meetingKey;
    @JsonProperty("date")
    public Date date;
    @JsonProperty("driver_number")
    public int driverNumber;
    @JsonProperty("pit_duration")
    public double pitDuration;
    @JsonProperty("lap_number")
    public int lapNumber;

    @Override
    public String toString() {
        return "Race{" +
                "sessionKey=" + sessionKey +
                ", meetingKey=" + meetingKey +
                ", date=" + date +
                ", driverNumber=" + driverNumber +
                ", pitDuration=" + pitDuration +
                ", lapNumber=" + lapNumber +
                '}';
    }
}
