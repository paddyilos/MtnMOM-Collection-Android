/*
 * MtnMOMCollectionLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mtn.momodeveloper.sandbox.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Balance 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 963045023112190629L;
    private String availableBalance;
    private String currency;
    /** GETTER
     * The available balance of the account
     */
    @JsonGetter("availableBalance")
    public String getAvailableBalance ( ) { 
        return this.availableBalance;
    }
    
    /** SETTER
     * The available balance of the account
     */
    @JsonSetter("availableBalance")
    public void setAvailableBalance (String value) { 
        this.availableBalance = value;
        notifyObservers(this.availableBalance);
    }
 
    /** GETTER
     * ISO4217 Currency
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * ISO4217 Currency
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
        notifyObservers(this.currency);
    }
 
}
