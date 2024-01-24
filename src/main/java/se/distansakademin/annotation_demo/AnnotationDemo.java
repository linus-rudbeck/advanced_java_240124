package se.distansakademin.annotation_demo;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String description();
}

public class AnnotationDemo {

    @MyAnnotation(description = "Testing method annotations")
    public void annotationTestMethod(){
        System.out.println("Inside annotationTestMethod");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = AnnotationDemo.class.getMethod("annotationTestMethod");

        if(method.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.description());
        }
    }
}
