/* 
 * ### Copyright (C) 2008 Michael Fuchs ###
 * ### All Rights Reserved.             ###
 *
 * Author: Michael Fuchs
 * E-Mail: michael.fuchs@dbdoclet.org
 * URL:    http://www.michael-a-fuchs.de
 */
package org.dbdoclet.tag.docbook;


public class Screen extends DocBookElement {

	Screen() {
		super("screen");
		setFormatType(FORMAT_CONTENT);
		isLiteral(true);
	}

	Screen(String text) {
		this();
		appendChild(text);
	}
}
