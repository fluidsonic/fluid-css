@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `cursor` value. */
@JsName("0;0")
public external interface Cursor : CssValue {

	public companion object;


	/** A [Cursor] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : Cursor, CssVariable<Cursor>
}


/** The CSS `auto` cursor value. */
@CssDsl
public inline val Cursor.Companion.auto: Cursor
	get() = unsafe("auto")

/** The CSS `none` cursor value. */
@CssDsl
public inline val Cursor.Companion.none: Cursor
	get() = unsafe("none")


/** The CSS `alias` cursor value. */
@CssDsl
public inline val Cursor.Companion.alias: Cursor
	get() = unsafe("alias")

/** The CSS `all-scroll` cursor value. */
@CssDsl
public inline val Cursor.Companion.allScroll: Cursor
	get() = unsafe("all-scroll")

/** The CSS `cell` cursor value. */
@CssDsl
public inline val Cursor.Companion.cell: Cursor
	get() = unsafe("cell")

/** The CSS `col-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.colResize: Cursor
	get() = unsafe("col-resize")

/** The CSS `context-menu` cursor value. */
@CssDsl
public inline val Cursor.Companion.contextMenu: Cursor
	get() = unsafe("context-menu")

/** The CSS `copy` cursor value. */
@CssDsl
public inline val Cursor.Companion.copy: Cursor
	get() = unsafe("copy")

/** The CSS `crosshair` cursor value. */
@CssDsl
public inline val Cursor.Companion.crosshair: Cursor
	get() = unsafe("crosshair")

/** The CSS `default` cursor value. */
@CssDsl
public inline val Cursor.Companion.default: Cursor
	get() = unsafe("default")

/** The CSS `e-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.eResize: Cursor
	get() = unsafe("e-resize")

/** The CSS `ew-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.ewResize: Cursor
	get() = unsafe("ew-resize")

/** The CSS `grab` cursor value. */
@CssDsl
public inline val Cursor.Companion.grab: Cursor
	get() = unsafe("grab")

/** The CSS `grabbing` cursor value. */
@CssDsl
public inline val Cursor.Companion.grabbing: Cursor
	get() = unsafe("grabbing")

/** The CSS `help` cursor value. */
@CssDsl
public inline val Cursor.Companion.help: Cursor
	get() = unsafe("help")

/** The CSS `move` cursor value. */
@CssDsl
public inline val Cursor.Companion.move: Cursor
	get() = unsafe("move")

/** The CSS `n-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.nResize: Cursor
	get() = unsafe("n-resize")

/** The CSS `ne-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.neResize: Cursor
	get() = unsafe("ne-resize")

/** The CSS `nesw-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.neswResize: Cursor
	get() = unsafe("nesw-resize")

/** The CSS `no-drop` cursor value. */
@CssDsl
public inline val Cursor.Companion.noDrop: Cursor
	get() = unsafe("no-drop")

/** The CSS `not-allowed` cursor value. */
@CssDsl
public inline val Cursor.Companion.notAllowed: Cursor
	get() = unsafe("not-allowed")

/** The CSS `ns-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.nsResize: Cursor
	get() = unsafe("ns-resize")

/** The CSS `nw-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.nwResize: Cursor
	get() = unsafe("nw-resize")

/** The CSS `nwse-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.nwseResize: Cursor
	get() = unsafe("nwse-resize")

/** The CSS `pointer` cursor value. */
@CssDsl
public inline val Cursor.Companion.pointer: Cursor
	get() = unsafe("pointer")

/** The CSS `progress` cursor value. */
@CssDsl
public inline val Cursor.Companion.progress: Cursor
	get() = unsafe("progress")

/** The CSS `row-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.rowResize: Cursor
	get() = unsafe("row-resize")

/** The CSS `s-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.sResize: Cursor
	get() = unsafe("s-resize")

/** The CSS `se-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.seResize: Cursor
	get() = unsafe("se-resize")

/** The CSS `sw-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.swResize: Cursor
	get() = unsafe("sw-resize")

/** The CSS `text` cursor value. */
@CssDsl
public inline val Cursor.Companion.text: Cursor
	get() = unsafe("text")

/** The CSS `vertical-text` cursor value. */
@CssDsl
public inline val Cursor.Companion.verticalText: Cursor
	get() = unsafe("vertical-text")

/** The CSS `w-resize` cursor value. */
@CssDsl
public inline val Cursor.Companion.wResize: Cursor
	get() = unsafe("w-resize")

/** The CSS `wait` cursor value. */
@CssDsl
public inline val Cursor.Companion.wait: Cursor
	get() = unsafe("wait")

/** The CSS `zoom-in` cursor value. */
@CssDsl
public inline val Cursor.Companion.zooIn: Cursor
	get() = unsafe("zoom-in")

/** The CSS `zoom-out` cursor value. */
@CssDsl
public inline val Cursor.Companion.zoomOut: Cursor
	get() = unsafe("zoom-out")


/** Creates a [Cursor] from an unchecked string [value]. */
public inline fun unsafe(value: String): Cursor =
	CssValue.unsafe(value)


/** Creates a [Cursor] backed by a CSS variable with the given [name]. */
public inline fun variable(name: String): Cursor.Variable =
	CssVariable.unsafe(name)


/** Sets the `cursor` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.cursor(value: Cursor) {
	property(cursor, value)
}


/** The `cursor` CSS property. */
@Suppress("unused")
public inline val CssProperties.cursor: CssProperty<Cursor>
	get() = CssProperty.unsafe("cursor")
