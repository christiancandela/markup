/* 
 * ### Copyright (C) 2008 Michael Fuchs ###
 * ### All Rights Reserved.             ###
 *
 * Author: Michael Fuchs
 * E-Mail: michael.fuchs@dbdoclet.org
 * URL:    http://www.michael-a-fuchs.de
 */
package org.dbdoclet.tag.docbook;


public class Methodname extends DocBookElement {

    private static final String tagName = "methodname";

    public static String getTag() {
	return tagName;
    }

    Methodname() {

	super(tagName);
    }

    Methodname(String methodname) {

	this();
	appendChild(methodname);
    }

}
