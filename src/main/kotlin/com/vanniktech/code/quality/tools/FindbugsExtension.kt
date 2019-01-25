package com.vanniktech.code.quality.tools

open class FindbugsExtension {
  /**
   * Ability to enable or disable only findbugs for every subproject that is not ignored.
   * @since 0.2.0
   */
  var enabled: Boolean = true

  /** @since 0.2.0 */
  var toolVersion: String = "3.0.1"

  /** @since 0.2.0 */
  var excludeFilter: String = "code_quality_tools/findbugs-filter.xml"

  /**
   * If set to false or true it overrides {@link CodeQualityToolsPluginExtension#failEarly}.
   * @since 0.3.0
   */
  var ignoreFailures: Boolean? = null

  /** @since 0.4.0 */
  var source: String = "src"

  /** @since 0.4.0 */
  var effort: String = "max"

  /** @since 0.4.0 */
  var reportLevel: String = "low"
}
