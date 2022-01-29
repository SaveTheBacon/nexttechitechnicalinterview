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
    GregorianCalendar eventStartDate;
    GregorianCalendar eventEndDate;
    EventType eventType;
    String eventDescription;

    public Event(int uniqueIdentifier, GregorianCalendar eventStartDate, GregorianCalendar eventEndDate, String eventType, String eventDescription) {
        this.uniqueIdentifier = uniqueIdentifier;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.eventType = EventType.valueOf(eventType.toUpperCase());
        this.eventDescription = eventDescription;
    }

    public GregorianCalendar getEventStartDate() {
        return eventStartDate;
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(int uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public GregorianCalendar getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(GregorianCalendar eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public void setEventStartDate(GregorianCalendar eventStartDate) {
        this.eventStartDate = eventStartDate;
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
