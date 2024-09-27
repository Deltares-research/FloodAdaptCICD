package floodAdapt

import floodAdapt.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    vcsRoot(FloodAdapt)
    vcsRoot(FloodAdaptGUI)
    vcsRoot(FloodAdaptCICD)
    vcsRoot(FloodAdaptDataBase)

    description = "A project to manage CI/CD structures in FloodAdapt"

    params {
        password("FloodAdapt-GUI-ssh-passphrase", "credentialsJSON:9ef5e4f0-0c04-4b45-84ef-2ea44d0ea990")
        password("FloodAdaptCICD-ssh-passphrase", "credentialsJSON:9ef5e4f0-0c04-4b45-84ef-2ea44d0ea990")
        password("FloodAdapt-ssh-passphrase", "credentialsJSON:9ef5e4f0-0c04-4b45-84ef-2ea44d0ea990")
    }
})