package org.yare.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotation to mark a class a rule repository
 * 
 * @author brad messerle
 * @since 2015
 * 
 */
@Target(value={ElementType.TYPE})
@Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
public @interface RuleRespository {

}
