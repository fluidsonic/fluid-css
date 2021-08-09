@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface Cursor : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : Cursor, CssVariable<Cursor>
}


@CssDsl
public inline val Cursor.Companion.auto: Cursor
	get() = unsafe("auto")

@CssDsl
public inline val Cursor.Companion.none: Cursor
	get() = unsafe("none")


@CssDsl
public inline val Cursor.Companion.alias: Cursor
	get() = unsafe("alias")

@CssDsl
public inline val Cursor.Companion.allScroll: Cursor
	get() = unsafe("all-scroll")

@CssDsl
public inline val Cursor.Companion.cell: Cursor
	get() = unsafe("cell")

@CssDsl
public inline val Cursor.Companion.colResize: Cursor
	get() = unsafe("col-resize")

@CssDsl
public inline val Cursor.Companion.contextMenu: Cursor
	get() = unsafe("context-menu")

@CssDsl
public inline val Cursor.Companion.copy: Cursor
	get() = unsafe("copy")

@CssDsl
public inline val Cursor.Companion.crosshair: Cursor
	get() = unsafe("crosshair")

@CssDsl
public inline val Cursor.Companion.default: Cursor
	get() = unsafe("default")

@CssDsl
public inline val Cursor.Companion.eResize: Cursor
	get() = unsafe("e-resize")

@CssDsl
public inline val Cursor.Companion.ewResize: Cursor
	get() = unsafe("ew-resize")

@CssDsl
public inline val Cursor.Companion.grab: Cursor
	get() = unsafe("grab")

@CssDsl
public inline val Cursor.Companion.grabbing: Cursor
	get() = unsafe("grabbing")

@CssDsl
public inline val Cursor.Companion.help: Cursor
	get() = unsafe("help")

@CssDsl
public inline val Cursor.Companion.move: Cursor
	get() = unsafe("move")

@CssDsl
public inline val Cursor.Companion.nResize: Cursor
	get() = unsafe("n-resize")

@CssDsl
public inline val Cursor.Companion.neResize: Cursor
	get() = unsafe("ne-resize")

@CssDsl
public inline val Cursor.Companion.neswResize: Cursor
	get() = unsafe("nesw-resize")

@CssDsl
public inline val Cursor.Companion.noDrop: Cursor
	get() = unsafe("no-drop")

@CssDsl
public inline val Cursor.Companion.notAllowed: Cursor
	get() = unsafe("not-allowed")

@CssDsl
public inline val Cursor.Companion.nsResize: Cursor
	get() = unsafe("ns-resize")

@CssDsl
public inline val Cursor.Companion.nwResize: Cursor
	get() = unsafe("nw-resize")

@CssDsl
public inline val Cursor.Companion.nwseResize: Cursor
	get() = unsafe("nwse-resize")

@CssDsl
public inline val Cursor.Companion.pointer: Cursor
	get() = unsafe("pointer")

@CssDsl
public inline val Cursor.Companion.progress: Cursor
	get() = unsafe("progress")

@CssDsl
public inline val Cursor.Companion.rowResize: Cursor
	get() = unsafe("row-resize")

@CssDsl
public inline val Cursor.Companion.sResize: Cursor
	get() = unsafe("s-resize")

@CssDsl
public inline val Cursor.Companion.seResize: Cursor
	get() = unsafe("se-resize")

@CssDsl
public inline val Cursor.Companion.swResize: Cursor
	get() = unsafe("sw-resize")

@CssDsl
public inline val Cursor.Companion.text: Cursor
	get() = unsafe("text")

@CssDsl
public inline val Cursor.Companion.verticalText: Cursor
	get() = unsafe("vertical-text")

@CssDsl
public inline val Cursor.Companion.wResize: Cursor
	get() = unsafe("w-resize")

@CssDsl
public inline val Cursor.Companion.wait: Cursor
	get() = unsafe("wait")

@CssDsl
public inline val Cursor.Companion.zooIn: Cursor
	get() = unsafe("zoom-in")

@CssDsl
public inline val Cursor.Companion.zoomOut: Cursor
	get() = unsafe("zoom-out")


public inline fun unsafe(value: String): Cursor =
	CssValue.unsafe(value)


public inline fun variable(name: String): Cursor.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.cursor(value: Cursor) {
	property(cursor, value)
}


@Suppress("unused")
public inline val CssProperties.cursor: CssProperty<Cursor>
	get() = CssProperty.unsafe("cursor")
