package io.fluidsonic.css

import org.w3c.dom.*


internal fun Node.insertAfter(newNode: Node, referenceNode: Node?): Node =
	insertBefore(newNode, referenceNode?.nextSibling)
