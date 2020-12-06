@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@PublishedApi
internal inline fun isProduction(): Boolean =
	js("process.env.NODE_ENV === 'production'").unsafeCast<Boolean>()
