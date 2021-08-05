package javax.xml.bind.annotation;

/**
 * Mock for the purpose of J2CL compilation
 */
public @interface XmlAnyElement {

    boolean lax() default false;

    Class<? extends DomHandler> value() default W3CDomHandler.class;
}
