package com.felinetech.localcat.utlis

/**
 * 设置对象接口
 */
interface Settings {
    fun saveSetting(key: String, value: String)
    fun getSetting(key: String): String?
}