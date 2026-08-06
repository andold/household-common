/*
 * @(#)MultipleDateEditor.java $version 2018-03-29
 *
 * Copyright 2007 NAVER Corp. All rights Reserved. 
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package kr.andold.household.domain;

import java.beans.PropertyEditorSupport;

import kr.andold.utils.Utility;

/**
 * Property editor for java.util.Date, supporting multiple custom input formats
 * and custom output formats.  This class utilizes DateUtils and
 * DateFormatUtils of Apache Commons Lang, and has been tested for version 2.4
 * but may work with older versions.
 *
 * It should be noted that the date input formats should be inserted into the
 * array based on the length of the string, longest to shortest.
 * 
 * This is not meant to be used as system PropertyEditor but rather as
 * locale-specific date editor within custom controller code, parsing
 * user-entered number strings into Date properties of beans and rendering
 * them in the UI form.
 *
 * In web MVC code, this editor will typically be registered with
 * binder.registerCustomEditor calls in a custom initBinder method.
 *
 * @author jpreston
 * @see java.beans.PropertyEditorSupport
 * @see java.util.Date
 * @see org.apache.commons.lang.time.DateUtils
 * @see org.apache.commons.lang.time.DateFormatUtils
 */
public class MultipleDateEditor extends PropertyEditorSupport {
    /**
     * Parse the Date from the given text, using the first matching date format
     * specified in the inpuFormats array.
     *
     * If no matching input format is found, an IllegalArgumentException is thrown.
     *
     * If allowEmpty is true (default is false), and the String is null, the Date
     * will be interpreted as null; otherwise an IllegalArgumentException is thrown.
     *
     * @param text the text to convert into a java.util.Date
     * @throws IllegalArgumentException thrown if no matching format is found
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
    	setValue(Utility.parseDateTime(text));
    }

}
