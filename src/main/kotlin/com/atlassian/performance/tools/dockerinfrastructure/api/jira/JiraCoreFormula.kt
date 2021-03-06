package com.atlassian.performance.tools.dockerinfrastructure.api.jira

import java.nio.file.Path

class JiraCoreFormula private constructor(
    private val port: Int,
    private val version: String,
    private val inDockerNetwork: Boolean,
    private val diagnoses: Path
) : AbstractJiraFormula(port, version, inDockerNetwork, diagnoses, "core") {
    class Builder : AbstractJiraFormula.Builder() {
        override fun build(): JiraFormula {
            return JiraCoreFormula(
                port = port,
                version = version,
                inDockerNetwork = inDockerNetwork,
                diagnoses = diagnoses
            )
        }
    }
}