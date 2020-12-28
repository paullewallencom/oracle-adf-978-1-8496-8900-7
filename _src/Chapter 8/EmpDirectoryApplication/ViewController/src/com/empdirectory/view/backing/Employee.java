package com.empdirectory.view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;

import org.apache.myfaces.trinidad.component.UIXSwitcher;

public class Employee {
    private RichForm f1;
    private RichDocument d1;
    private UIXSwitcher s1;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setS1(UIXSwitcher s1) {
        this.s1 = s1;
    }

    public UIXSwitcher getS1() {
        return s1;
    }
}
