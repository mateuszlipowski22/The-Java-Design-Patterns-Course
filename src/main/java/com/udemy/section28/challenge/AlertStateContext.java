package com.udemy.section28.challenge;

public class AlertStateContext {

    private MobileAlertState currentState;

    public AlertStateContext() {
        this.currentState = new Vibration();
    }

    public MobileAlertState getCurrentState() {
        return currentState;
    }

    public void alert(){
        currentState.alert();
    }

    public void setState(MobileAlertState state) {
        this.currentState=state;
    }
}
