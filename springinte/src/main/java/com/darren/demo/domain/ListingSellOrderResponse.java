/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.darren.demo.domain;

/**
 * listingSellOrderResponse
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ListingSellOrderResponse implements java.io.Serializable {


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
     * listingSellOrderBo
     */
    private java.util.List<ListingSellOrderBo> _listingSellOrderBoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListingSellOrderResponse() {
        super();
        this._listingSellOrderBoList = new java.util.ArrayList<ListingSellOrderBo>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vListingSellOrderBo
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListingSellOrderBo(
            final ListingSellOrderBo vListingSellOrderBo)
    throws IndexOutOfBoundsException {
        this._listingSellOrderBoList.add(vListingSellOrderBo);
    }

    /**
     *
     *
     * @param index
     * @param vListingSellOrderBo
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addListingSellOrderBo(
            final int index,
            final ListingSellOrderBo vListingSellOrderBo)
    throws IndexOutOfBoundsException {
        this._listingSellOrderBoList.add(index, vListingSellOrderBo);
    }

    /**
     * Method enumerateListingSellOrderBo.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ListingSellOrderBo> enumerateListingSellOrderBo(
    ) {
        return java.util.Collections.enumeration(this._listingSellOrderBoList);
    }

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
     * Method getListingSellOrderBo.
     *
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * ListingSellOrderBo
     * at the given index
     */
    public ListingSellOrderBo getListingSellOrderBo(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listingSellOrderBoList.size()) {
            throw new IndexOutOfBoundsException("getListingSellOrderBo: Index value '" + index + "' not in range [0.." + (this._listingSellOrderBoList.size() - 1) + "]");
        }

        return (ListingSellOrderBo) _listingSellOrderBoList.get(index);
    }

    /**
     * Method getListingSellOrderBo.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public ListingSellOrderBo[] getListingSellOrderBo(
    ) {
        ListingSellOrderBo[] array = new ListingSellOrderBo[0];
        return (ListingSellOrderBo[]) this._listingSellOrderBoList.toArray(array);
    }

    /**
     * Method getListingSellOrderBoCount.
     *
     * @return the size of this collection
     */
    public int getListingSellOrderBoCount(
    ) {
        return this._listingSellOrderBoList.size();
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
     * Method iterateListingSellOrderBo.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ListingSellOrderBo> iterateListingSellOrderBo(
    ) {
        return this._listingSellOrderBoList.iterator();
    }

    /**
     */
    public void removeAllListingSellOrderBo(
    ) {
        this._listingSellOrderBoList.clear();
    }

    /**
     * Method removeListingSellOrderBo.
     *
     * @param vListingSellOrderBo
     * @return true if the object was removed from the collection.
     */
    public boolean removeListingSellOrderBo(
            final ListingSellOrderBo vListingSellOrderBo) {
        boolean removed = _listingSellOrderBoList.remove(vListingSellOrderBo);
        return removed;
    }

    /**
     * Method removeListingSellOrderBoAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public ListingSellOrderBo removeListingSellOrderBoAt(
            final int index) {
        Object obj = this._listingSellOrderBoList.remove(index);
        return (ListingSellOrderBo) obj;
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
     *
     *
     * @param index
     * @param vListingSellOrderBo
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setListingSellOrderBo(
            final int index,
            final ListingSellOrderBo vListingSellOrderBo)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listingSellOrderBoList.size()) {
            throw new IndexOutOfBoundsException("setListingSellOrderBo: Index value '" + index + "' not in range [0.." + (this._listingSellOrderBoList.size() - 1) + "]");
        }

        this._listingSellOrderBoList.set(index, vListingSellOrderBo);
    }

    /**
     *
     *
     * @param vListingSellOrderBoArray
     */
    public void setListingSellOrderBo(
            final ListingSellOrderBo[] vListingSellOrderBoArray) {
        //-- copy array
        _listingSellOrderBoList.clear();

        for (int i = 0; i < vListingSellOrderBoArray.length; i++) {
                this._listingSellOrderBoList.add(vListingSellOrderBoArray[i]);
        }
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

}
