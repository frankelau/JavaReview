package cn.com.franke.introspector;

import java.io.BufferedReader;
/*
���� ��дһ�������������������ļ������ݣ������������ض�Ӧ�Ķ��󣬲��ҰѶ���Ҫ�ж�Ӧ������ֵ��
 */
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.URL;

/*
 
 �Ժ����ǿ������ ��ʱ�������Ǿ�����Ҫ��һЩ���ݷ�װ�������еġ�
 
 
 
 */

public class Demo1 {

	public static void main(String[] args) throws Exception {
		Person p = (Person) getInstance();
		System.out.println(p);

	}

	// ���������ļ���������������Ķ�����Ҫ�Ѷ��������ֵ��װ�������С�
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object getInstance() throws Exception {
		URL path = Demo1.class.getResource("/obj.txt");
		// ��������
		Object o = null;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.getFile()));) {
			String className = bufferedReader.readLine(); // ��ȡ�����ļ���ȡ��������������
			Class clazz = Class.forName(className);
			// ͨ��class�����ȡ���޲εĹ��췽��
			Constructor constructor = clazz.getConstructor(null);
			o = constructor.newInstance(null);
			// ��ȡ����ֵ
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				String[] datas = line.split("=");
				// ͨ����������ȡ����Ӧ��Field����
				Field field = clazz.getDeclaredField(datas[0]);
				field.setAccessible(true);
				if (field.getType() == int.class) {
					field.set(o, Integer.parseInt(datas[1]));
				} else {
					field.set(o, datas[1]);
				}
//				field.setAccessible(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return o;

	}

}