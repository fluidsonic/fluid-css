package io.fluidsonic.css

import org.w3c.dom.*


internal fun HTMLCollection.lastOrNull(predicate: (Element) -> Boolean): Element? {
	for (index in (length - 1 downTo 0)) {
		val element = this[index]!!
		if (predicate(element))
			return element
	}

	return null
}
