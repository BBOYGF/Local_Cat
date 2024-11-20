package com.felinetech.localcat.po

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * 上传列表配置
 */
@Entity(tableName = "UploadConfigItem")
data class UploadConfigItem(

    @PrimaryKey(autoGenerate = true)
     var id: Int = 0,
    /**
     * 监听的目录
     */
    @ColumnInfo(name = "t_listening_dir")
     var listeningDir: String,

    /**
     * 匹配规则 列表用，隔开
     */
    @ColumnInfo(name = "t_matching_rule")
     val matchingRule: String? = null,

    @ColumnInfo(name = "t_start_date")
     val startDate: Date? = null,
)
