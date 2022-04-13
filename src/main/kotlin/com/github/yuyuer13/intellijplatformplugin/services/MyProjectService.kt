package com.github.yuyuer13.intellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.yuyuer13.intellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
