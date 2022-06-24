package com.lyi.d2_xpath;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

public class XpathDemo {
	public static void main(String[] args) throws Exception {
		parseXPathAbs();
        parseXPathRel();
		parseXPathFullSear();
		parseXPathAttrSear();
	}

	/**
	 * 通过绝对路径
	 * 根元素/子元素/
	 */
	public  static void parseXPathAbs() throws Exception {
		//解析器对象
		SAXReader saxReader = new SAXReader();
		InputStream is = XpathDemo.class.getResourceAsStream("/Contact.xml");
		//把XML加载成Document文档对象
		Document document = saxReader.read(is);

		// 检索全部的名称
		List<Node> nameNodes = document.selectNodes("/contactList/contact/name");
		for (Node nameNode : nameNodes) {
			Element nameElement = (Element) nameNode;
			System.out.println(nameElement.getTextTrim());
		}
	}

	/**
	 * 通过相对路径
	 * ./子元素/元素
	 */
	public  static void parseXPathRel() throws Exception {
		//解析器对象
		SAXReader saxReader = new SAXReader();
		InputStream is = XpathDemo.class.getResourceAsStream("/Contact.xml");
		//把XML加载成Document文档对象
		Document document = saxReader.read(is);
		Element rootElement = document.getRootElement();
		// 检索全部的名称
		List<Node> nameNodes = rootElement.selectNodes("./contact/name");
		for (Node nameNode : nameNodes) {
			Element nameElement = (Element) nameNode;
			System.out.println(nameElement.getTextTrim());
		}
	}


	/**
	 * 通过全局检索
	 * //元素 在全文检索
	 * //元素1/元素2 在全文检索元素1的下一层元素2
	 * //元素1//元素2 在全文检索元素1的下面所有元素2
	 */
	public  static void parseXPathFullSear() throws Exception {
		//解析器对象
		SAXReader saxReader = new SAXReader();
		InputStream is = XpathDemo.class.getResourceAsStream("/Contact.xml");
		//把XML加载成Document文档对象
		Document document = saxReader.read(is);

		// 检索全部的名称
		List<Node> nameNodes = document.selectNodes("//contact//name");
		for (Node nameNode : nameNodes) {
			Element nameElement = (Element) nameNode;
			System.out.println(nameElement.getTextTrim());
		}
	}
	/**
	 * 通过属性检索
	 * //@属性名称 在全文检索属性对象
	 * //元素[@属性名称] 在全文检索包含该属性的元素对象
	 * //元素[@属性名称=值] 在全文检索包含该属性等于这个值的元素对象
	 */
	public  static void parseXPathAttrSear() throws Exception {
		//解析器对象
		SAXReader saxReader = new SAXReader();
		InputStream is = XpathDemo.class.getResourceAsStream("/Contact.xml");
		//把XML加载成Document文档对象
		Document document = saxReader.read(is);

		// 检索全部的名称
		//List<Node> Nodes = document.selectNodes("//@id");
		Node node = document.selectSingleNode("//name[@id]");
		Element element = (Element) node;
		System.out.println(element.getText());

	}



}
