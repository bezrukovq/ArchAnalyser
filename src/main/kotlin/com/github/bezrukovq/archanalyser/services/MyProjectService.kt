package com.github.bezrukovq.archanalyser.services

import com.github.bezrukovq.archanalyser.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
