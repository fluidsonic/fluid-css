package io.fluidsonic.css


/** A lightweight string builder backed by a JavaScript array. */
public external interface StringBuilder


/** Appends the string representation of [value]. */
public inline fun StringBuilder.append(value: Any) {
	append("$value")
}


/** Appends a [CssProperty] as its string representation. */
public inline fun StringBuilder.append(value: CssProperty<*>) {
	append(value.asString())
}


/** Appends a [CssValue] as its string representation. */
public inline fun StringBuilder.append(value: CssValue) {
	append(value.asString())
}


/** Appends a [String] if it is not empty. */
public inline fun StringBuilder.append(string: String) {
	if (string.isNotEmpty())
		asDynamic().push(string)
}


/** Returns `true` if this builder contains no content. */
public inline fun StringBuilder.isEmpty(): Boolean =
	asDynamic().length == 0


/** Returns `true` if this builder contains any content. */
public inline fun StringBuilder.isNotEmpty(): Boolean =
	asDynamic().length != 0


/** Builds a string by applying [action] to a [StringBuilder]. */
public inline fun buildString(action: StringBuilder.() -> Unit): String {
	val builder = js("[]")
	action(builder.unsafeCast<StringBuilder>())

	return builder.join("").unsafeCast<String>()
}
