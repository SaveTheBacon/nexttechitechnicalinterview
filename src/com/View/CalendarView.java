package com.View;


import com.Model.Event;

import java.util.GregorianCalendar;

public class CalendarView {

    public void printEventDetails(GregorianCalendar eventDate, String eventType, String eventDescription){
        System.out.println("Current event:");
        System.out.println("Date and time: " + eventDate.getTime()) ;
        System.out.println("Event type: " + eventType);
        System.out.println("Short description: " + eventDescription);
    }

    public void printEventDetailsEvent(Event event){
        System.out.println("Current event:");
        System.out.println("Date and time: " + event.getEventStartDate().getTime()) ;
        System.out.println("End date: " + event.getEventEndDate());
        System.out.println("Event type: " + event.getEventType());
        System.out.println("Short description: " + event.getEventDescription());

    }
}
