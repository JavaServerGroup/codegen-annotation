package com.jtool.codegenannotation;

import javax.validation.groups.Default;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CodeGenField {
	String value();
	boolean isPathParam() default false;
	Class<?>[] groups() default Default.class;
}
