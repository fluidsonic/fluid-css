@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@PublishedApi
internal inline fun Array<*>.clear() {
	asDynamic().splice(0)
}


@PublishedApi
internal inline fun Array<*>.join(): String =
	asDynamic().join().unsafeCast<String>()


@PublishedApi
internal inline fun Array<*>.join(separator: String): String =
	asDynamic().join(separator).unsafeCast<String>()


@PublishedApi
internal inline fun <Element> Array<in Element>.push(element: Element): Int =
	asDynamic().push(element).unsafeCast<Int>()
