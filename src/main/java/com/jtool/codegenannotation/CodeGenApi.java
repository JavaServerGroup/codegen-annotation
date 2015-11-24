package com.jtool.codegenannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CodeGenApi {
	String name();
	double docSeq() default Double.MAX_VALUE;
	String description();
	String host() default "host(get from initialization)";
	String forWho() default "default";
	boolean genSDK() default true;
	String remark() default "";
}
