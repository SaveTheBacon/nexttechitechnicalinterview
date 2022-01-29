package com.Controller;

import com.Model.EventCalendar;
import com.Model.Event;
import com.View.CalendarView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarController {

    private EventCalendar model;
    private CalendarView view;

    public CalendarController(EventCalendar model, CalendarView view){
        this.model = model;
        this.view = view;
    }

    public EventCalendar getModel() {
        return model;
    }

    public void setModel(EventCalendar model) {
        this.model = model;
    }

    public CalendarView getView() {
        return view;
    }

    public void setView(CalendarView view) {
        this.view = view;
    }

    public void getTodayEvents(){
        GregorianCalendar todayDate = new GregorianCalendar();
        ArrayList<Event> events =  model.getCalendarEvents();
        for (Event event: events) {
            if (event.getEventStartDate().get(Calendar.DAY_OF_YEAR) == todayDate.get(Calendar.DAY_OF_YEAR)){
                view.printEventDetails(event.getEventStartDate(), event.getEventType(), event.getEventDescription());
            }
        }
    }

    public void getEventsNext10Days(){
        GregorianCalendar todayDate = new GregorianCalendar();
        ArrayList<Event> events =  model.getCalendarEvents();
        for (Event event: events) {
            if (event.getEventStartDate().get(Calendar.DAY_OF_YEAR) <= todayDate.get(Calendar.DAY_OF_YEAR + 10)){
                view.printEventDetails(event.getEventStartDate(), event.getEventType(), event.getEventDescription());
            }
        }
    }

    public void AddEvent(Event event){
        ArrayList<Event> auxEvents = model.getCalendarEvents();
        auxEvents.add(event);
        model.setCalendarEvents(auxEvents);

    }

    //I'll need to find a way to implement unique ID's
    //As well as a method to space them out, so you can't go through them sequentially
    public void deleteEvent(int ID){
        getModel().getCalendarEvents().removeIf(event -> event.getUniqueIdentifier() == ID);
    }

    public void editEvent(int ID, GregorianCalendar eventDate, String eventType, String eventDescription){
        for (Event event : getModel().getCalendarEvents()){
            if (event.getUniqueIdentifier() == ID ){
                event.setEventStartDate(eventDate);
                event.setEventType(eventType);
                event.setEventDescription(eventDescription);
            }
        }
    }

    public ArrayList<Event> filterByType(String eventType){
        ArrayList<Event> filteredEvents = new ArrayList<>();

        for (Event event : getModel().getCalendarEvents()){
            if (event.getEventType().equals(eventType) ){
                filteredEvents.add(event);
            }
        }

        return  filteredEvents;
    }

    public ArrayList<Event> filterByDate(GregorianCalendar startDate, GregorianCalendar endDate){
        ArrayList<Event> filteredEvents = new ArrayList<>();

        for (Event event : getModel().getCalendarEvents()){
            if (event.getEventStartDate().get(Calendar.DAY_OF_YEAR) >= startDate.get(Calendar.DAY_OF_YEAR) && event.getEventStartDate().get(Calendar.DAY_OF_YEAR) <= endDate.get(Calendar.DAY_OF_YEAR) ){
                filteredEvents.add(event);
            }
        }

        return  filteredEvents;
    }


    //to be used in conjunction with the filters, or by itself
    public void getCalendarStats(ArrayList<Event> calendar){
        int totalTimeSpentInMinutes = 0;
        for (Event event : calendar){
            view.printEventDetailsEvent(event);
            totalTimeSpentInMinutes += event.getEventEndDate().get(Calendar.MINUTE) - event.getEventStartDate().get(Calendar.MINUTE);
        }
        System.out.println("Total time spent for above events: " + totalTimeSpentInMinutes);
    }
}
