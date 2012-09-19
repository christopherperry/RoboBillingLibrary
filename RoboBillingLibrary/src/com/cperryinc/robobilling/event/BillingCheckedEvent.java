package com.cperryinc.robobilling.event;

public class BillingCheckedEvent {
    private boolean isBillingSupported;

    public BillingCheckedEvent(boolean billingSupported) {
        isBillingSupported = billingSupported;
    }

    public boolean isBillingSupported() {
        return isBillingSupported;
    }
}