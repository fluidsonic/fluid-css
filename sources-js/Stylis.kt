package io.fluidsonic.css


@JsModule("@emotion/stylis")
internal external class Stylis {

	companion object
}


@Suppress("NOTHING_TO_INLINE")
internal inline operator fun Stylis.invoke(selector: String, properties: String): String =
	asDynamic()(selector, properties).unsafeCast<String>()
