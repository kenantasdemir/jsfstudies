package com.kenant42.jsfstudies.someevents;

import jakarta.faces.application.Application;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.PostConstructApplicationEvent;

public class CustomPostConstructApplicationEvent extends PostConstructApplicationEvent {

    //uygulama başladığında çalışır

    public CustomPostConstructApplicationEvent(FacesContext facesContext, Application application) {
        super(facesContext, application);
    }
}
