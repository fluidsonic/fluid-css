@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@kotlin.internal.InlineOnly
@PublishedApi
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
internal inline fun String.isEmpty(): Boolean =
	this == ""


@kotlin.internal.InlineOnly
@PublishedApi
@Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
internal inline fun String.isNotEmpty(): Boolean =
	this != ""
