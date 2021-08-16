import io.fluidsonic.gradle.*

plugins {
	id("io.fluidsonic.gradle") version "1.1.24"
}

fluidLibrary(name = "css", version = "0.10.0")

fluidLibraryModule(description = "FIXME") {
	targets {
		js {
			dependencies {
				implementation(npm("@emotion/stylis", "~0.8.5"))
			}

			custom {
				useCommonJs()
			}
		}
	}
}
