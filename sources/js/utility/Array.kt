package io.fluidsonic.css


@kotlin.internal.InlineOnly
@PublishedApi
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
internal inline fun Array<*>.join(): String =
	asDynamic().join().unsafeCast<String>()


@kotlin.internal.InlineOnly
@PublishedApi
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
internal inline fun Array<*>.join(separator: String): String =
	asDynamic().join(separator).unsafeCast<String>()
