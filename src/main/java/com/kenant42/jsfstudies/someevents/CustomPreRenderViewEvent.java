package com.kenant42.jsfstudies.someevents;

import jakarta.faces.component.UIViewRoot;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.PreRenderViewEvent;

public class CustomPreRenderViewEvent extends PreRenderViewEvent {
    //bir JSF sayfası görüntülenmeden hemen önce çalışır.
    public CustomPreRenderViewEvent(FacesContext facesContext, UIViewRoot root) {
        super(facesContext, root);

    }
}
