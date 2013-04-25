/* 
 * ### Copyright (C) 2008 Michael Fuchs ###
 * ### All Rights Reserved.             ###
 *
 * Author: Michael Fuchs
 * E-Mail: michael.fuchs@dbdoclet.org
 * URL:    http://www.michael-a-fuchs.de
 */
package org.dbdoclet.tag.html;


abstract public class HeaderElement extends StrictElement {

	abstract public int getLevel();

	@Override
	public boolean validate() {

		if (getParentNode() instanceof A) {
			return true;
		}

		return false;
	}
}
