package fpt.java.demo_day1_hsf302.dto.validator;

import fpt.java.demo_day1_hsf302.util.Gender;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD, FIELD})
@Constraint(validatedBy = GenderSubsetValidator.class)
public @interface GenderSubset {
    String message() default "Invalid gender";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    Gender[] anyOf();
}
