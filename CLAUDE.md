# fluid-css

Kotlin/JS CSS-in-JS library for generating and injecting CSS from Kotlin code in the browser.

## Build

Uses `io.fluidsonic.gradle` plugin. Build: `./gradlew build`. Test: `./gradlew jsTest`.

## Conventions

- Tab indentation in all Kotlin and Gradle files.
- Release tags have no `v` prefix (e.g. `0.14.0`, not `v0.14.0`).
- Source directories: `sources-js/` and `tests-js/` (not `src/`), configured by the fluid-gradle plugin.
- This is a JS-only library — no JVM or native targets.
- CSS value types use `external interface` backed by `String` via `unsafeCast` for zero-overhead JS interop.
- The `@CssDsl` annotation is used for DSL scoping on builder APIs.
- Uses `@emotion/stylis` ~0.8.5 for CSS processing (function-style API, not v4+).
