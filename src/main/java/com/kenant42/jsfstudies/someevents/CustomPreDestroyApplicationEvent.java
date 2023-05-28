package com.kenant42.jsfstudies.someevents;

import jakarta.faces.application.Application;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.PreDestroyApplicationEvent;

public class CustomPreDestroyApplicationEvent extends PreDestroyApplicationEvent {
    //uygulama kapanmak üzereyken çalışır.
    public CustomPreDestroyApplicationEvent(FacesContext facesContext, Application application) {
        super(facesContext, application);
    }
}
