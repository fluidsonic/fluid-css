package io.fluidsonic.css


@JsModule("@emotion/stylis")
@JsNonModule
internal external class Stylis


@Suppress("NOTHING_TO_INLINE")
internal inline operator fun Stylis.invoke(selector: String, properties: String): String =
	asDynamic()(selector, properties).unsafeCast<String>()
