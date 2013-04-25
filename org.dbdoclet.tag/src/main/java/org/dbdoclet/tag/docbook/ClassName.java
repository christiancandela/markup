/* 
 * ### Copyright (C) 2008 Michael Fuchs ###
 * ### All Rights Reserved.             ###
 *
 * Author: Michael Fuchs
 * E-Mail: michael.fuchs@dbdoclet.org
 * URL:    http://www.michael-a-fuchs.de
 */
package org.dbdoclet.tag.docbook;


public class ClassName extends DocBookElement {

    ClassName() {
        super("classname");
    }
    
    ClassName(String classname) {
 
        this();
        appendChild(classname);
    }
}
