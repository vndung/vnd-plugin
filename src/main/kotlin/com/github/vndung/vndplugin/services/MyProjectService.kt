package com.github.vndung.vndplugin.services

import com.intellij.openapi.project.Project
import com.github.vndung.vndplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
