/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.darren.demo.domain;

/**
 * sendSmsCodeResponse
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SendSmsCodeResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _code.
     */
    private String _code;

    /**
     * Field _result.
     */
    private String _result;

    /**
     * Field _smsCode.
     */
    private String _smsCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public SendSmsCodeResponse() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'code'.
     *
     * @return the value of field 'Code'.
     */
    public String getCode(
    ) {
        return this._code;
    }

    /**
     * Returns the value of field 'result'.
     *
     * @return the value of field 'Result'.
     */
    public String getResult(
    ) {
        return this._result;
    }

    /**
     * Returns the value of field 'smsCode'.
     *
     * @return the value of field 'SmsCode'.
     */
    public String getSmsCode(
    ) {
        return this._smsCode;
    }

    /**
     * Sets the value of field 'code'.
     *
     * @param code the value of field 'code'.
     */
    public void setCode(
            final String code) {
        this._code = code;
    }

    /**
     * Sets the value of field 'result'.
     *
     * @param result the value of field 'result'.
     */
    public void setResult(
            final String result) {
        this._result = result;
    }

    /**
     * Sets the value of field 'smsCode'.
     *
     * @param smsCode the value of field 'smsCode'.
     */
    public void setSmsCode(
            final String smsCode) {
        this._smsCode = smsCode;
    }

}
