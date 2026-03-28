# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/).


## [0.14.0] - 2026-03-28

### Changed

- Migrated to fluid-gradle 3.0.0 (Kotlin 2.3, Gradle 9.4.1, JDK 21+).
- Removed `@JsNonModule` from Stylis (incompatible with ES modules).
- Added `noinline` modifier to `StyleSheet.style()` parameter for Kotlin 2.3 compatibility.

### Added

- KDoc documentation for all public API declarations.
- Comprehensive unit tests for CSS value types, printer, builders, selectors, and variables.
- `CLAUDE.md` project conventions file.
- `CHANGELOG.md`.
- GitHub Actions CI workflow.
- Proper `README.md` with badges, description, and usage examples.
