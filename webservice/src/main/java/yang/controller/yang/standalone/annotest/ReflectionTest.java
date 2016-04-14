package yang.controller.yang.standalone.annotest;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by JangYangsook on 2016-04-12.
 */
public class ReflectionTest {

    @Test
    public void copyDataTest() throws Exception {

        MyModel myModel1 = new MyModel();
        myModel1.myName = "model1 name";
        myModel1.count = 120;
        MyModel myModel2 = new MyModel();

        Field[] fields = myModel1.getClass().getDeclaredFields();
        for(Field field : fields) {

            //field.set(myModel2, field.get(myModel1));
            Field model2Field = myModel2.getClass().getDeclaredField(field.getName());
            model2Field.set(myModel2, field.get(myModel1));
        }

        System.out.println(myModel2.myName+", "+myModel2.count);

    }
}
