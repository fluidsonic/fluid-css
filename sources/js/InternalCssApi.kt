package io.fluidsonic.css


@RequiresOptIn(
    level = RequiresOptIn.Level.ERROR,
    message = "This is an internal io.fluidsonic.css API that should not be used from outside of io.fluidsonic.css. " +
        "No compatibility guarantees are provided." +
        "It is recommended to report your use-case of internal API to io.fluidsonic.css issue tracker, so stable API could be provided instead."
)
@Retention(value = AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.TYPEALIAS)
public annotation class InternalCssApi
