package com.kenant42.jsfstudies;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FacesValidator("com.kenant42.jsfstudies.EmailCheck")
public class EmailCheck implements Validator {

    private static final String EMAIL_REGEX = "";

    private Pattern pattern;

    private Matcher matcher;

    public EmailCheck(){

        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        matcher = pattern.matcher(o.toString());
    }
}
