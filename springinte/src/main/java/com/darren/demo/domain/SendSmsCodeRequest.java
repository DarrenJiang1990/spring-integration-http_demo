/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.darren.demo.domain;

/**
 * sendSmsCodeRequest
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SendSmsCodeRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _platformId.
     */
    private String _platformId;

    /**
     * Field _appKey.
     */
    private String _appKey;

    /**
     * Field _loginAccount.
     */
    private String _loginAccount;

    /**
     * Field _smsTempCode.
     */
    private String _smsTempCode;

    /**
     * Field _smsTempJson.
     */
    private String _smsTempJson;


      //----------------/
     //- Constructors -/
    //----------------/

    public SendSmsCodeRequest() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'appKey'.
     *
     * @return the value of field 'AppKey'.
     */
    public String getAppKey(
    ) {
        return this._appKey;
    }

    /**
     * Returns the value of field 'loginAccount'.
     *
     * @return the value of field 'LoginAccount'.
     */
    public String getLoginAccount(
    ) {
        return this._loginAccount;
    }

    /**
     * Returns the value of field 'platformId'.
     *
     * @return the value of field 'PlatformId'.
     */
    public String getPlatformId(
    ) {
        return this._platformId;
    }

    /**
     * Returns the value of field 'smsTempCode'.
     *
     * @return the value of field 'SmsTempCode'.
     */
    public String getSmsTempCode(
    ) {
        return this._smsTempCode;
    }

    /**
     * Returns the value of field 'smsTempJson'.
     *
     * @return the value of field 'SmsTempJson'.
     */
    public String getSmsTempJson(
    ) {
        return this._smsTempJson;
    }

    /**
     * Sets the value of field 'appKey'.
     *
     * @param appKey the value of field 'appKey'.
     */
    public void setAppKey(
            final String appKey) {
        this._appKey = appKey;
    }

    /**
     * Sets the value of field 'loginAccount'.
     *
     * @param loginAccount the value of field 'loginAccount'.
     */
    public void setLoginAccount(
            final String loginAccount) {
        this._loginAccount = loginAccount;
    }

    /**
     * Sets the value of field 'platformId'.
     *
     * @param platformId the value of field 'platformId'.
     */
    public void setPlatformId(
            final String platformId) {
        this._platformId = platformId;
    }

    /**
     * Sets the value of field 'smsTempCode'.
     *
     * @param smsTempCode the value of field 'smsTempCode'.
     */
    public void setSmsTempCode(
            final String smsTempCode) {
        this._smsTempCode = smsTempCode;
    }

    /**
     * Sets the value of field 'smsTempJson'.
     *
     * @param smsTempJson the value of field 'smsTempJson'.
     */
    public void setSmsTempJson(
            final String smsTempJson) {
        this._smsTempJson = smsTempJson;
    }

}
