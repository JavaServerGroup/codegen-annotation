package com.jtool.codegenannotation;

import javax.validation.groups.Default;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CodeGenRequest {
	Class<?> value();
	boolean isRest() default false;
	Class<?>[] groups() default Default.class;
}
