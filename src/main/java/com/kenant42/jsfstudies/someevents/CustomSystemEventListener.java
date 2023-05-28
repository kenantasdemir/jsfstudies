package com.kenant42.jsfstudies.someevents;

import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.SystemEvent;
import jakarta.faces.event.SystemEventListener;

public class CustomSystemEventListener implements SystemEventListener {
    @Override
    public void processEvent(SystemEvent systemEvent) throws AbortProcessingException {
        systemEvent.getFacesContext();
    }

    @Override
    public boolean isListenerForSource(Object o) {
        return false;
    }
}
