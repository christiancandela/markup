package org.dbdoclet.html.parser;

import java.io.IOException;

import org.dbdoclet.html.tokenizer.TokenizerException;
import org.dbdoclet.service.ResourceServices;
import org.dbdoclet.tag.html.HtmlDocument;
import org.junit.Test;

public class ImgTests extends AbstractTests {

	@Test
	public void testImg1() throws IOException, ParserException, TokenizerException {

		String buffer = ResourceServices
				.getResourceAsString("html/ch04s02.html");
		
		HtmlParser parser = new HtmlParser();
		HtmlDocument doc = parser.parseDocument(buffer);
		doc.treeView();
	}
}
