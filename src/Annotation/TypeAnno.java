package Annotation;

// Demonstrate several type annotations.
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// A marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface TypeAnno {}

// Another marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {}

// Still another marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface Unique {}

// A parameterized annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface MaxLen {
  int value();
}

// An annotation that can be applied to a field declaration.
@Target(ElementType.FIELD)
@interface EmptyOK {}

// An annotation that can be applied to a method declaration.
@Target(ElementType.METHOD)
@interface Recommended {}
