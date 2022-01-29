package com.Model;

import java.util.GregorianCalendar;

enum EventType{
    BIRTHDAY,
    REMINDER,
    MEETING,
    APPOINTMENT
}

public class Event {

    int uniqueIdentifier;
    GregorianCalendar eventDate;
    EventType eventType;
    String eventDescription;

    public Event(int uniqueIdentifier, GregorianCalendar eventDate, String eventType, String eventDescription) {
        this.uniqueIdentifier = uniqueIdentifier;
        this.eventDate = eventDate;
        this.eventType = EventType.valueOf(eventType.toUpperCase());
        this.eventDescription = eventDescription;
    }

    public GregorianCalendar getEventDate() {
        return eventDate;
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(int uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public void setEventDate(GregorianCalendar eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventType() {
        return eventType.name();
    }

    public void setEventType(String eventType) {
        this.eventType = EventType.valueOf(eventType.toUpperCase());
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
}
