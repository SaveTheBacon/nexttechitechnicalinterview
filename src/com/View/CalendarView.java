package com.View;


import java.util.GregorianCalendar;

public class CalendarView {

    public void printEventDetails(GregorianCalendar eventDate, String eventType, String eventDescription){
        System.out.println("Current event:");
        System.out.println("Date and time: " + eventDate.getTime()) ;
        System.out.println("Event type: " + eventType);
        System.out.println("Short description: " + eventDescription);
    }
}
