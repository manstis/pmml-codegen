package javax.xml.bind.annotation;

/**
 * Mock for the purpose of J2CL compilation
 */
public @interface XmlSchemaType {

    String name();

    String namespace() default "http://www.w3.org/2001/XMLSchema";

    Class type() default DEFAULT.class;

    static final class DEFAULT {

    }
}
