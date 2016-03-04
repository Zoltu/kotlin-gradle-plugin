package com.zoltu

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper

class KotlinPlugin implements Plugin<Project> {
	void apply(Project project) {
		project.plugins.apply(KotlinPluginWrapper)
	}
}
