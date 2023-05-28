package com.kenant42.jsfstudies;

import jakarta.faces.event.PhaseEvent;
import jakarta.faces.event.PhaseId;
import jakarta.faces.event.PhaseListener;

public class CustomPhaseListener implements PhaseListener {
    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        phaseEvent.getPhaseId();
        phaseEvent.getFacesContext();
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        phaseEvent.getPhaseId().getName();
    }

    @Override
    public PhaseId getPhaseId() {
        return null;
    }
}
