package com.vanniktech.code.quality.tools

open class DetektExtension {
  /**
   * Ability to enable or disable only detekt for every subproject that is not ignored.
   * @since 0.6.0
   */
  var enabled: Boolean = true

  /** @since 0.6.0 */
  var toolVersion: String = "1.0.0.RC6"

  /** @since 0.6.0 */
  var config: String = "code_quality_tools/detekt.yml"

  /**
   * Optional baseline file. If one is present it will be used in the detektCheck task.
   * If this name is specified however the file is not present it will be generated.
   * This mirrors the baseline mechanism from Android Lint.
   *
   * @since 0.11.0
   */
  var baselineFileName: String? = null
}
