package com.lyi.d1_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Dom4jDemo {
	/**
	 * <contact id="1" >
	 *         <name> 潘金莲  </name>
	 *         <gender>女</gender>
	 *         <email>panjinlian@example.com</email>
	 * </contact>
	 */
	public static void main(String[] args) throws Exception {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(
				new FileInputStream("day05-xml-app\\src\\Contact.xml"));
		List<Contact> contacts = new ArrayList<Contact>();

		Element rootElement = document.getRootElement();
		for (Element sonElement : rootElement.elements("contact")) {

			Contact contact = new Contact();
			contact.setId(Integer.valueOf(sonElement.attributeValue("id")));
			contact.setName(sonElement.elementTextTrim("name"));
			contact.setGender(sonElement.elementTextTrim("gender").charAt(0));
			contact.setEmail(sonElement.elementText("email"));

			contacts.add(contact);
		}
		for (Contact contact : contacts) {
			System.out.println(contact);
		}

	}
}
