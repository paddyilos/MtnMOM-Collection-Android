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
public class PreApprovalResult 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4663996367056179538L;
    private Party payer;
    private String payerCurrency;
    private String payerMessage;
    private Integer validityTime;
    private StatusEnum status;
    private ErrorReason reason;
    /** GETTER
     * Party identifies a account holder in the wallet platform. Party consists of two parameters, type and partyId. Each type have its own validation of the partyId<br> MSISDN - Mobile Number validated according to ITU-T E.164. Validated with IsMSISDN<br> EMAIL - Validated to be a valid e-mail format. Validated with IsEmail<br> PARTY_CODE - UUID of the party. Validated with IsUuid
     */
    @JsonGetter("payer")
    public Party getPayer ( ) { 
        return this.payer;
    }
    
    /** SETTER
     * Party identifies a account holder in the wallet platform. Party consists of two parameters, type and partyId. Each type have its own validation of the partyId<br> MSISDN - Mobile Number validated according to ITU-T E.164. Validated with IsMSISDN<br> EMAIL - Validated to be a valid e-mail format. Validated with IsEmail<br> PARTY_CODE - UUID of the party. Validated with IsUuid
     */
    @JsonSetter("payer")
    public void setPayer (Party value) { 
        this.payer = value;
        notifyObservers(this.payer);
    }
 
    /** GETTER
     * ISO4217 Currency
     */
    @JsonGetter("payerCurrency")
    public String getPayerCurrency ( ) { 
        return this.payerCurrency;
    }
    
    /** SETTER
     * ISO4217 Currency
     */
    @JsonSetter("payerCurrency")
    public void setPayerCurrency (String value) { 
        this.payerCurrency = value;
        notifyObservers(this.payerCurrency);
    }
 
    /** GETTER
     * The mesage that is shown to the approver.
     */
    @JsonGetter("payerMessage")
    public String getPayerMessage ( ) { 
        return this.payerMessage;
    }
    
    /** SETTER
     * The mesage that is shown to the approver.
     */
    @JsonSetter("payerMessage")
    public void setPayerMessage (String value) { 
        this.payerMessage = value;
        notifyObservers(this.payerMessage);
    }
 
    /** GETTER
     * The request validity time of the pre-approval
     */
    @JsonGetter("validityTime")
    public Integer getValidityTime ( ) { 
        return this.validityTime;
    }
    
    /** SETTER
     * The request validity time of the pre-approval
     */
    @JsonSetter("validityTime")
    public void setValidityTime (Integer value) { 
        this.validityTime = value;
        notifyObservers(this.validityTime);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public StatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (StatusEnum value) { 
        this.status = value;
        notifyObservers(this.status);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("reason")
    public ErrorReason getReason ( ) { 
        return this.reason;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("reason")
    public void setReason (ErrorReason value) { 
        this.reason = value;
        notifyObservers(this.reason);
    }
 
}