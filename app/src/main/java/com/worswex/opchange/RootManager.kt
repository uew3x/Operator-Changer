package com.worswex.opchange

import com.topjohnwu.superuser.Shell
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object RootManager {

    suspend fun checkRoot(): Boolean = withContext(Dispatchers.IO) {
        Shell.getShell().isRoot
    }

    suspend fun getCurrentOperator(): String = withContext(Dispatchers.IO) {
        val result = Shell.cmd("getprop gsm.operator.alpha").exec()
        if (result.isSuccess && result.out.isNotEmpty()) {
            result.out.firstOrNull()?.takeIf { it.isNotBlank() } ?: "Unknown"
        } else {
            "Unknown"
        }
    }

    suspend fun setOperatorName(newName: String): Boolean = withContext(Dispatchers.IO) {
        val result = Shell.cmd("setprop gsm.operator.alpha \"$newName\"").exec()
        result.isSuccess
    }
}