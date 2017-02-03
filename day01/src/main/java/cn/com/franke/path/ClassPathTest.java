package cn.com.franke.path;

import java.io.InputStream;

/**
 * Created by liuxianzhao on 2017/2/3.
 */
public class ClassPathTest {
    public static void main(String[] args) throws Exception {
        Class clazz = new ClassPathTest().getClass();

        // 开头的'/'表示classpath的根目录，这个是表示从classpath的根目录中开始查找资源
        InputStream in = clazz.getResourceAsStream("/db.properties");

        // 如果开头没有'/'，表示从当前这个class所在的包中开始查找
        InputStream in2 = clazz.getResourceAsStream("db.properties");
    }


}
