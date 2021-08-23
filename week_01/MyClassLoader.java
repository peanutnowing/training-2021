package com.company;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) {
        String myPath = "file:///Users/deble.king/Desktop/" + name.replace(".","/") + ".xlass";
        System.out.println(myPath);
        byte[] byteArray = null;
        Path path = null;
        try {
            path = Paths.get(new URI(myPath));
            byteArray = Files.readAllBytes(path);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        // 转换
        byte[] classBytes = decode(byteArray);
        Class clazz = defineClass(name, classBytes, 0, classBytes.length);
        return clazz;
    }

    /**
     * 解码
     * @param byteArray
     * @return
     */
    private static byte[] decode(byte[] byteArray) {
        byte[] targetArray = new byte[byteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            targetArray[i] = (byte) (255 - byteArray[i]);
        }
        return targetArray;
    }

    public static void main(String[] args) {
        MyClassLoader loader = new MyClassLoader();
        final String className = "Hello";
        final String methodName = "hello";
        Class<?> loaderClass = loader.findClass(className);
        try {
            Object obj = loaderClass.newInstance();
            Method method = loaderClass.getMethod(methodName);
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
