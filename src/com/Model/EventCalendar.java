package com.Model;

import java.util.ArrayList;

public class EventCalendar {

    ArrayList<Event> calendarEvents;
    ArrayList<Event> pastEvents;


    public EventCalendar(ArrayList<Event> calendarEvents, ArrayList<Event> pastEvents) {
        this.calendarEvents = calendarEvents;
        this.pastEvents = pastEvents;
    }

    public ArrayList<Event> getCalendarEvents() {
        return calendarEvents;
    }

    public ArrayList<Event> getPastEvents() {
        return pastEvents;
    }

    public void setPastEvents(ArrayList<Event> pastEvents) {
        this.pastEvents = pastEvents;
    }

    public void setCalendarEvents(ArrayList<Event> calendarEvents) {
        this.calendarEvents = calendarEvents;
    }
}
