package by.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Copy

class TestReport implements Plugin<Project>{
    @Override
    void apply(Project project) {
        def map=[description:"creation test report",group:"customPlugin",type: Copy]
        project.task(map,"testReport"){
            doNotTrackState "Some reason"
            println "Iam in test report plugin"
            from("build/reports/jacoco/test/html/index.html")
            into("$project.parent.rootDir/")
            rename("index.html","readme.md")
        }

    }
}
