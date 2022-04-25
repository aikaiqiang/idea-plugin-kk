package com.github.aikaiqiang.ideapluginkk.services

import com.intellij.openapi.project.Project
import com.github.aikaiqiang.ideapluginkk.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
