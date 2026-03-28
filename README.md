fluid-css
=========

[![Maven Central](https://img.shields.io/maven-central/v/io.fluidsonic.css/fluid-css?label=Maven%20Central)](https://search.maven.org/artifact/io.fluidsonic.css/fluid-css)
[![Tests](https://github.com/fluidsonic/fluid-css/workflows/Tests/badge.svg)](https://github.com/fluidsonic/fluid-css/actions/workflows/tests.yml)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.3.20%20(JS)-blue.svg)](https://github.com/JetBrains/kotlin)

A Kotlin/JS CSS-in-JS library for generating and injecting CSS from Kotlin code in the browser.

Provides a type-safe DSL for defining CSS stylesheets, properties, selectors, and values entirely in Kotlin. Styles are processed
with [Stylis](https://github.com/thysultan/stylis.js) and injected into the DOM at runtime.



Installation
------------

`build.gradle.kts`:

```kotlin
dependencies {
	implementation("io.fluidsonic.css:fluid-css:0.13.0")
}
```

Usage
-----

### Define a stylesheet

```kotlin
object AppStyles : StyleSheet("app") {
	val container by style {
		display(Display.flex)
		padding(16.px)
		color(Color.darkGray)

		hover {
			color(Color.black)
		}
	}
}
```

### Inject styles and use class names

```kotlin
// Inject all styles into the DOM
AppStyles.inject()

// Use the generated class name on an element
element.className = AppStyles.container
```

### CSS value DSL

The library provides type-safe CSS value types with a zero-overhead abstraction over strings:

```kotlin
val size = 16.px
val gap = 1.5.em
val fullWidth = 100.percent
val mainColor = Color("#333")
```

License
-------

Apache 2.0
