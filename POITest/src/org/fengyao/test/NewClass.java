package org.fengyao.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NewClass {
	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static Object getObject(Object object) throws InstantiationException, IllegalAccessException {
		boolean a = true;
		Class clazz = object.getClass();
		Object temp = clazz.newInstance();
		Method[] methodC = clazz.getMethods();
		for (Method method : methodC) {
			if (!method.getName().equals("getClass")) {
				if (method.getName().startsWith("get")) {
					for (Method method2 : methodC) {
						if (method2.getName().equals("set" + method.getName().substring(3))) {
							System.out.println(method.getParameterTypes().length);
							try {
								method2.invoke(temp, method.invoke(object));
							} catch (Exception e) {
								// TODO: handle exception
								if (a) {
									System.out.println(method.getParameterTypes().length);
									a = false;
								}
							}
							break;
						}
					}
				}
			}
		}
		return temp;
	}

	public static Object copy(Object object) throws Exception {
		Class<?> classType = object.getClass();
		Object obj = classType.getConstructor(new Class[] {}).newInstance(new Object[] {});
		Field[] fields = classType.getDeclaredFields();
		for (Field field : fields) {
			String name = field.getName();
			String firstLetter = name.substring(0, 1).toUpperCase();
			String getMethodName = "get" + firstLetter + name.substring(1);
			String setMethodName = "set" + firstLetter + name.substring(1);
			Method getMethod = classType.getMethod(getMethodName, new Class[] {});
			Method setMethod = classType.getMethod(setMethodName, new Class[] { field.getType() });
			Object value = getMethod.invoke(object, new Object[] {});
			System.out.println(value);
			setMethod.invoke(obj, new Object[] { value });
		}
		return obj;
	}

	public static void main(String[] args) throws IllegalArgumentException, InstantiationException,
			IllegalAccessException, InvocationTargetException {
		NewClass nc = new NewClass();
		nc.setAge("123");
		nc.setName("kkk");
		NewClass temp = (NewClass) NewClass.getObject(nc);
		System.out.println(temp.getAge() + "-" + temp.getName());
		System.out.println();
	}
}
