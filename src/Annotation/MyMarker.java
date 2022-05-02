package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// A marker annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }
