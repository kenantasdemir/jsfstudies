package com.kenant42.jsfstudies;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

public class CustomValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        facesContext.getMaximumSeverity();
        UIComponent component = facesContext.getViewRoot().findComponent("form:custominputvalue");
        String inputValue = (String) ((jakarta.faces.component.html.HtmlInputText) component).getValue();
        if(inputValue.length() <= 10){
            System.out.println("bu alan 10 karakterden az olamaz.");
        }
    }
}
