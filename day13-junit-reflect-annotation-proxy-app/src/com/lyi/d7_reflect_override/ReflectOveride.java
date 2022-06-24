package com.lyi.d7_reflect_override;

import java.io.*;
import java.lang.reflect.Field;

/**
 * 思考: 这个对象可能是任意的 那么怎么杨才可以知道这个对象的全部成员变量名称呢？
 *  给你任意一个对象，在不清楚对象字段的情况下，可以把对象的字段名称和对应值存储到文件中取
 * @author 95848
 */
public class ReflectOveride {

	public static void main(String[] args) throws Exception {
		Student student = new Student("张胜男",'男',"2年级5班");
		MybatisUtils(student);

		Student student2 = new Student("张胜男",'男',"2年级5班");
		MybatisUtils(student2);

		Teacher teacher = new Teacher("卢仔",50,10000 );
		MybatisUtils(teacher);

	}

	public static void MybatisUtils(Object obj) throws Exception {

		try (
				FileOutputStream fos = new FileOutputStream("day04-junit-reflect-annotation-proxy-app/src/testOverride.txt",true);
				PrintStream printStream = new PrintStream(fos))
		{
			//	1.定义一个方法，可以接收任意类的对象
			Class<Object> objectClass = (Class<Object>) obj.getClass();

			printStream.println("=============="+ objectClass.getSimpleName() +"==============");
			//	2.每次收到一个对象后，需要解析这个对象的全部成员变量名称
			for (Field declaredField : objectClass.getDeclaredFields()) {
				declaredField.setAccessible(true);
				// 3.遍历成员变量信息，然后提取本成员变量在对象中的具体值
				Object fieldName = declaredField.getName();
				Object fieldValue = declaredField.get(obj);
				System.out.println(fieldName + "=" + fieldValue);
				//4.存入成员变量名称和值到文件中去即可
				printStream.println(fieldName + "=" + fieldValue);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
