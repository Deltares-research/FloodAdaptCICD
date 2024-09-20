package floodAdapt.vcsRoots

import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot
import jetbrains.buildServer.configs.kotlin.vcs.SvnVcsRoot

object FloodAdaptCICD : GitVcsRoot({
    name = "FloodAdaptCICD"
    url = "https://github.com/Deltares-research/FloodAdaptCICD"
    branch = "main"
    branchSpec = """
        +:refs/heads/*
        +:refs/tags/*
    """.trimIndent()
    useTagsAsBranches = true
    authMethod = uploadedKey {
        uploadedKey = "FloodAdaptCICD"
    }
})

object FloodAdapt : GitVcsRoot({
    name = "FloodAdapt"
    url = "https://github.com/Deltares-research/FloodAdapt"
    branch = "main"
    branchSpec = """
        +:refs/heads/*
        +:refs/tags/*
    """.trimIndent()
    useTagsAsBranches = true
    authMethod = uploadedKey {
        uploadedKey = "FloodAdapt"
    }
})

object FloodAdaptGUI : GitVcsRoot({
    name = "FloodAdapt-GUI"
    url = "https://github.com/Deltares-research/FloodAdapt-GUI"
    branch = "main"
    branchSpec = """
        +:refs/heads/*
        +:refs/tags/*
    """.trimIndent()
    useTagsAsBranches = true
    authMethod = uploadedKey {
        uploadedKey = "FloodAdapt-GUI"
    }
})

object FloodAdaptDataBase : SvnVcsRoot({
    name = "FloodAdapt-GUI"
    url = "https://repos.deltares.nl/repos/FloodAdapt-Database/charleston_test"
})