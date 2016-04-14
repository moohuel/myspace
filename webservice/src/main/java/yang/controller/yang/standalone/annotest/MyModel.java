package yang.controller.yang.standalone.annotest;

/**
 * Created by JangYangsook on 2016-04-11.
 */
public class MyModel extends MyModelParent {

    @EssentialParameterAnnotation(intNumber = 10)
    int count;
    @EssentialParameterAnnotation(longNumber = 20L)
    Long myLong;
    @EssentialParameterAnnotation(strValue = "haha")
    String myName;
    String yourName;
}
