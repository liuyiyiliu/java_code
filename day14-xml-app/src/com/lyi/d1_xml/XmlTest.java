package com.lyi.d1_xml;

import com.lyi.d2_xpath.XpathDemo;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class XmlTest {

	public static void main(String[] args) throws Exception {

		// 1.创建Dom4j的解析器对象，代表整个dom4j框架
		SAXReader saxReader = new SAXReader();
        // 2.把XML文件加载到内存中成为Document文档对象
		Document document = saxReader.read(
				new FileInputStream("day05-xml-app\\src\\Contact.xml"));
		// 2.1 可以通过getResourceAsStream获取文件位置
		InputStream is = XmlTest.class.getResourceAsStream("/Contact.xml");
		Document document2 = saxReader.read(is);
		// 3. 获取根元素对象
		Element rootElement = document.getRootElement();
		System.out.println(rootElement.getName());
		// 4.拿取根元素下的全部子元素对象(一级)
		List<Element> sonElements = rootElement.elements();
		for (Element sonElement : sonElements) {
			System.out.println(sonElement.getName());
		}
		// 5.默认提取第一个
		Element contact = rootElement.element("contact");
		// 获取子元素文本
		System.out.println(contact.elementText("name"));
		// 去掉前后空格
		System.out.println(contact.elementTextTrim("name"));
		// 根据元素获取属性值
		Attribute idAttr = contact.attribute("id");
		System.out.println(idAttr.getName()+"----->" + idAttr.getValue());
		// 6.获取当前元素下的子元素对象
		Element name = contact.element("name");
		System.out.println(name.getText());


	}


}
