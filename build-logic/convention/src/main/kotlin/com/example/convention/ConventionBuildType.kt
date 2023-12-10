package com.example.convention

/**
 * This is shared between :app and :benchmarks module to provide configurations type safety.
 */
enum class ConventionBuildType(val applicationIdSuffix: String? = null) {
    DEBUG(".debug"),
    RELEASE,
    BENCHMARK(".benchmark")
}
