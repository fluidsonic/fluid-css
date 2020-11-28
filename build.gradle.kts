import io.fluidsonic.gradle.*
import org.jetbrains.kotlin.gradle.plugin.*

plugins {
	id("io.fluidsonic.gradle") version "1.1.13"
}

fluidLibrary(name = "css", version = "0.9.0")

fluidLibraryModule(description = "FIXME") {
	publishSingleTargetAsModule()

	targets {
		js(KotlinJsCompilerType.IR) {
			dependencies {
				implementation(npm("@emotion/stylis", "~0.8.5"))
			}
		}
	}
}
