package com.github.janneri.plugintemplatetest.services

import com.github.janneri.plugintemplatetest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
