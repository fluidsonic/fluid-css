package io.fluidsonic.css


public external interface StringBuilder


public inline fun StringBuilder.append(value: Any) {
	append("$value")
}


public inline fun StringBuilder.append(value: CssProperty<*>) {
	append(value.asString())
}


public inline fun StringBuilder.append(value: CssValue) {
	append(value.asString())
}


public inline fun StringBuilder.append(string: String) {
	if (string.isNotEmpty())
		asDynamic().push(string)
}


public inline fun StringBuilder.isEmpty(): Boolean =
	asDynamic().length == 0


public inline fun StringBuilder.isNotEmpty(): Boolean =
	asDynamic().length != 0


public inline fun buildString(action: StringBuilder.() -> Unit): String {
	val builder = js("[]")
	action(builder.unsafeCast<StringBuilder>())

	return builder.join("").unsafeCast<String>()
}
