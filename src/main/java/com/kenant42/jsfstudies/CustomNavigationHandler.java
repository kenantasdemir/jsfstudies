package com.kenant42.jsfstudies;

import jakarta.faces.application.NavigationHandler;
import jakarta.faces.context.FacesContext;

public class CustomNavigationHandler extends NavigationHandler {
    @Override
    public void handleNavigation(FacesContext facesContext, String s, String s1) {
            NavigationHandler navigationHandler = facesContext.getApplication().getNavigationHandler();
            navigationHandler.handleNavigation(facesContext,null,"page2.xhtml");
    }
}
