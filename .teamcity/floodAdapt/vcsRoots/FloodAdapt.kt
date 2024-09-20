package floodAdapt.vcsRoots

import jetbrains.buildServer.configs.kotlin.ParameterRef
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
        passphrase = ParameterRef("FloodAdaptCICD-ssh-passphrase").ref
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
        passphrase = ParameterRef("FloodAdapt-ssh-passphrase").ref
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
        passphrase = ParameterRef("FloodAdapt-GUI-ssh-passphrase").ref
    }
})

object FloodAdaptDataBase : SvnVcsRoot({
    name = "FloodAdapt-GUI"
    url = "https://repos.deltares.nl/repos/FloodAdapt-Database"
    userName = ParameterRef("svn_FloodAdapt_Username").ref
    passphrase = ParameterRef("svn_FloodAdapt_Password").ref
    enforceRevert = true
})