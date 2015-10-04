/**
 * 
 */
package org.yare.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * @author Brad Messerle
 *
 */
@Target(value={ElementType.TYPE})
@Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
public @interface RuleObserveable {

}
