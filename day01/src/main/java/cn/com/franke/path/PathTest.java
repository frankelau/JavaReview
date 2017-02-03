package cn.com.franke.path;

import java.io.File;

/**
 * Created by liuxianzhao on 2017/2/3.
 */
    public class PathTest {
        public static void main(String[] args) throws Exception {
            System.out.println(new File("a.txt").getAbsolutePath());
        }
    }
