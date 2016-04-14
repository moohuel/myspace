package yang.controller.yang.standalone.annotest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by JangYangsook on 2016-04-08.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EssentialParameterAnnotation {

    public int intNumber() default 10;
    public long longNumber() default 20L;
    public String strValue() default "";

}
