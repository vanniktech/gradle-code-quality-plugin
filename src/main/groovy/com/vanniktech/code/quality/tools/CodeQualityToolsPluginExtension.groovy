package com.vanniktech.code.quality.tools

/**
 * Extension for code quality
 * @since 0.2.0
 */
class CodeQualityToolsPluginExtension {
    /**
     * when set to true all enabled code quality tools will be configured in a way that even a single warning / error will fail the build process
     * @since 0.2.0
     */
    boolean failEarly = true

    /**
     * global configuration which will be applied on all enabled code quality tools
     * @since 0.2.0
     */
    boolean xmlReports = true

    /**
     * global configuration which will be applied on all enabled code quality tools
     * @since 0.2.0
     */
    boolean htmlReports = false

    /**
     * subprojects that should be ignored
     * @since 0.2.0
     */
    String[] ignoreProjects = []

    static class Findbugs {
        /**
         * ability to enable or disable only findbugs for every subproject that is not ignored
         * @since 0.2.0
         */
        boolean enabled = true

        /** @since 0.2.0 */
        String toolVersion = '3.0.1'

        /** @since 0.2.0 */
        String excludeFilter = 'code_quality_tools/findbugs-filter.xml'
    }

    static class Checkstyle {
        /**
         * ability to enable or disable only checkstyle for every subproject that is not ignored
         * @since 0.2.0
         */
        boolean enabled = true

        /** @since 0.2.0 */
        String toolVersion = '6.17'

        /** @since 0.2.0 */
        String configFile = 'code_quality_tools/checkstyle.xml'
    }

    static class Pmd {
        /**
         * ability to enable or disable only pmd for every subproject that is not ignored
         * @since 0.2.0
         */
        boolean enabled = true

        /** @since 0.2.0 */
        String toolVersion = '5.4.1'

        /** @since 0.2.0 */
        String ruleSetFile = 'code_quality_tools/pmd.xml'
    }

    static class Lint {
        /**
         * ability to enable or disable only lint for every subproject that is not ignored
         * @since 0.2.0
         */
        boolean enabled = true

        /**
         * Enable or disable textReport
         * @since 0.2.0
         */
        Boolean textReport = null

        /**
         * Specify the textOutput for lint. It will only be used when {@link #textReport} is set to true
         * @since 0.2.0
         */
        String textOutput = 'stdout'

        /**
         * if set to false or true it overrides {@link CodeQualityToolsPluginExtension#failEarly}
         * @since 0.2.0
         */
        Boolean abortOnError

        /**
         * if set to false or true it overrides {@link CodeQualityToolsPluginExtension#failEarly}
         * @since 0.2.0
         */
        Boolean warningsAsErrors
    }
}
