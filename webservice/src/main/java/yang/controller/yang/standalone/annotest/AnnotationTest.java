package yang.controller.yang.standalone.annotest;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by JangYangsook on 2016-04-11.
 */
public class AnnotationTest {

    @Test
    public void myTest() throws Exception {

        Object myModel = new MyModel();
        //System.out.println(myModel.myName);

        Field[] fields = myModel.getClass().getSuperclass().getDeclaredFields();
        for(Field field : fields) {

            System.out.println("fieldName:"+field.getName());

            EssentialParameterAnnotation essentialParameterAnnotation = field.getAnnotation(EssentialParameterAnnotation.class);
            if(essentialParameterAnnotation == null) {
                System.out.println("continue fieldName:"+field.getName());
                continue;
            }

            //System.out.println(field.getName()+":"+field.get(myModel));

            if(field.getType() == String.class && field.get(myModel) == null) {
                //String myName = (String)field.get(myModel);
                field.set(myModel, essentialParameterAnnotation.strValue());
            }
            else if(field.getType() == Long.class && field.get(myModel) == null) {
                field.set(myModel, essentialParameterAnnotation.longNumber());
            }
            else if(field.getType() == Integer.class && field.get(myModel) == null) {
                field.set(myModel, essentialParameterAnnotation.intNumber());
            }
        }

        System.out.println("final:"+((MyModel)myModel).count+", "+((MyModel)myModel).myLong+", "+((MyModel)myModel).myName+","+((MyModel)myModel).yourName+", "+((MyModel)myModel).parentName);

    }

}
