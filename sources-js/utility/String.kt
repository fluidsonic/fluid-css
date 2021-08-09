@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


// https://youtrack.jetbrains.com/issue/KT-43571
@PublishedApi
internal inline fun String.isEmpty(): Boolean =
	this == ""


// https://youtrack.jetbrains.com/issue/KT-43571
@PublishedApi
internal inline fun String.isNotEmpty(): Boolean =
	this != ""
