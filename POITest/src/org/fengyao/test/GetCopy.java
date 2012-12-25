package org.fengyao.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetCopy {

	public static <X> X getX(X x) {
		X x2 = null;
		try {
			x2 = (X) x.getClass().newInstance();
		} catch (Exception e) {
			return x;
		}
		Class clazz = x2.getClass();
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			String mName = method.getName();
			if (mName.startsWith("get") && method.getParameterTypes().length == 0) {
				String name = mName.substring("get".length());
				Object val = null;
				try {
					val = method.invoke(x);
				} catch (Exception e) {

				}
				if (val == null)
					continue;
				for (Method method2 : methods) {
					String name2 = method2.getName();
					if (name2.equals("set" + name)) {
						try {
							method2.invoke(x2, val);
						} catch (Exception e) {
						}
						break;
					}
				}
			}
		}
		return x2;
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
							try {
								method2.invoke(temp, method.invoke(object));
							} catch (Exception e) {
								// TODO: handle exception
								if (a) {
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
			setMethod.invoke(obj, new Object[] { value });
		}
		return obj;
	}

}
