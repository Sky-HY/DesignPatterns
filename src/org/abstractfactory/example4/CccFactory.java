package org.abstractfactory.example4;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * 三c工厂，创建电子产品
 */
public class CccFactory {

    private static final Properties PROPERTIES;

    static {
        InputStream in = CccFactory.class.getClassLoader().getResourceAsStream("org/abstractfactory/example4/config.properties");
        PROPERTIES = new Properties();
        try {
            PROPERTIES.load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private CccFactory() {

    }

    public static TV createTV() {
        String tvBrand = (String) PROPERTIES.get("TvBrand");
        try {
            return (TV) Class.forName("org.abstractfactory.demo4."+tvBrand).getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                 ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Phone createPhone() {
        String phoneBrand = (String) PROPERTIES.get("PhoneBrand");
        try {
            return (Phone) Class.forName("org.abstractfactory.demo4."+phoneBrand).getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                 ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
