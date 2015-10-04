package org.yare.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
public @interface RuleAttribute {

}
