package floodAdapt

import floodAdapt.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.Project

object project : Project({
    vcsRoot(FloodAdapt)
    vcsRoot(FloodAdaptGUI)
    vcsRoot(FloodAdaptCICD)
    vcsRoot(FloodAdaptDataBase)
})