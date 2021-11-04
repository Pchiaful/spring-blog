package com.codeup.springblog.models;

public class Element {
    private String element;
    private String attunement;

    public Element(String element, String attunement) {
        this.element = element;
        this.attunement = attunement;
    }

    public Element() {
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getAttunement() {
        return attunement;
    }

    public void setAttunement(String attunement) {
        this.attunement = attunement;
    }
}
