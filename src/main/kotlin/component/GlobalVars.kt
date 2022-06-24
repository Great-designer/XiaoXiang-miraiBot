/*
 * Copyright (C) 2022 Operacon.
 *
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/Operacon/XiaoXiang-miraiBot/blob/main/LICENSE
 */
package org.operacon.component

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient

object GlobalVars {
    val splitter = Regex(""" +""")
    val atReplace = Regex("""@[0-9]{5,10} ?""")
    val pagReplace = Regex("""\[.+]""")
    val atMe = Regex("@" + Settings.selfId.toString())

    val okHttpClient = OkHttpClient().newBuilder().build()
    val mediaTypePlain = "text/plain".toMediaTypeOrNull()
}