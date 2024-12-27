
package com.shipping.model;

/**
 *
 * @author navo
 */
public class Shipping{
    private String from;
    private String to;
    private String pickup;
    private String drop;
    private String number;

    public Shipping(String from, String to, String pickup, String drop, String number) {
        this.from = from;
        this.to = to;
        this.pickup = pickup;
        this.drop = drop;
        this.number = number;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDrop() {
        return drop;
    }

    public String getNumber() {
        return number;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
}
