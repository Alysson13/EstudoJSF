package com.adal.financeiro.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.OverridesAttribute;
import javax.validation.Payload;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@NotNull
@DecimalMin("0")
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
public @interface DecimalPositivo {

	@OverridesAttribute(constraint = DecimalMin.class, name = "message")
	String message() default "{com.adal.NumeroDecimal.message}";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
