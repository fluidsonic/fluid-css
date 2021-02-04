package io.fluidsonic.css


internal val securityNonce: String? get() = js("__webpack_nonce__ !== 'undefined' ? __webpack_nonce__ : null").unsafeCast<String?>()
