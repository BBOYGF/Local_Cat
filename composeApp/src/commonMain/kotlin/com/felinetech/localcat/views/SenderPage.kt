package com.felinetech.localcat.views

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.felinetech.localcat.components.FileItem
import com.felinetech.localcat.components.ScanFile
import com.felinetech.localcat.components.ServerItem
import com.felinetech.localcat.utlis.getNames
import com.felinetech.localcat.view_model.HomeViewModel
import com.felinetech.localcat.view_model.HomeViewModel.connectDataSources
import com.felinetech.localcat.view_model.HomeViewModel.scanFile
import com.felinetech.localcat.view_model.HomeViewModel.scanFileList
import com.felinetech.localcat.view_model.HomeViewModel.scanService
import com.felinetech.localcat.view_model.HomeViewModel.startScanService
import com.felinetech.localcat.view_model.MainViewModel
import java.util.*

/**
 * 发送者
 */
@Composable
fun Sender(turnState: Boolean) {
    val turn = remember { Animatable(if (turnState) -180f else 0f) }
    val deepStart = remember { Animatable(if (turnState) 0.6f else 1f) }
    val viewModel = HomeViewModel
    if (turnState) {
        LaunchedEffect(false) {
            deepStart.animateTo(
                targetValue = 0.55f,
                animationSpec = tween(durationMillis = 200, easing = FastOutLinearInEasing)
            )

            deepStart.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = 200, easing = FastOutLinearInEasing)
            )
        }
        LaunchedEffect(false) {
            turn.animateTo(
                targetValue = 0f,
                animationSpec = tween(durationMillis = 400, easing = FastOutSlowInEasing)
            )
        }
    }

    // 创建一个 Animatable 对象用于控制旋转角度
    val rotationDegrees = remember { Animatable(0f) }

    // 启动一个协程来处理旋转动画
    LaunchedEffect(scanFile) {
        if (scanFile) {
            while (true) {
                rotationDegrees.animateTo(
                    targetValue = rotationDegrees.value + 360f,
                    animationSpec = tween(
                        durationMillis = 1000,
                        easing = androidx.compose.animation.core.LinearEasing
                    )
                )
                // 重置角度以便下次循环
                rotationDegrees.snapTo(rotationDegrees.value % 360)
            }
        } else {
            // 停止旋转，重置角度
            rotationDegrees.stop()
        }
    }

    // 创建一个 Animatable 对象用于控制旋转角度
    val rotationDegrees2 = remember { Animatable(0f) }

    // 启动一个协程来处理旋转动画
    LaunchedEffect(scanService) {
        if (scanService) {
            while (true) {
                rotationDegrees2.animateTo(
                    targetValue = rotationDegrees.value + 360f,
                    animationSpec = tween(
                        durationMillis = 1000,
                        easing = androidx.compose.animation.core.LinearEasing
                    )
                )
                // 重置角度以便下次循环
                rotationDegrees2.snapTo(rotationDegrees.value % 360)
            }
        } else {
            // 停止旋转，重置角度
            rotationDegrees2.stop()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer(
                rotationY = turn.value,
                scaleX = deepStart.value,
                scaleY = deepStart.value
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .height(800.dp)
                .padding(5.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(45.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = getNames(Locale.getDefault().language).searchForRecipient)
                IconButton(onClick = {
                    startScanService()
                }) {
                    Icon(
                        imageVector = Icons.Outlined.Refresh,
                        contentDescription = getNames(Locale.getDefault().language).searchForRecipient,
                        modifier = Modifier.graphicsLayer(
                            rotationZ = rotationDegrees2.value
                        )
                    )
                }
            }
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .graphicsLayer(
                        rotationY = turn.value,
                        scaleX = deepStart.value,
                        scaleY = deepStart.value
                    )
                    .scrollable(state = rememberScrollState(10), orientation = Orientation.Vertical),
                color = Color(0x99ffffff),
                shape = RoundedCornerShape(5.dp)
            ) {
                // 记住我们自己的 LazyListState
                LazyColumn(
                    modifier = Modifier.fillMaxSize()
                ) {
                    // 接收者列表
                    items(viewModel.serviceList) { item ->
                        ServerItem(item) {
                            connectDataSources(it)
                        }
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(45.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = getNames(Locale.getDefault().language).scanTheFile)
                IconButton(onClick = {
                    scanFile()
                }) {
                    Icon(
                        imageVector = Icons.Outlined.Refresh,
                        contentDescription = getNames(Locale.getDefault().language).scanTheFile,
                        modifier = Modifier.graphicsLayer(
                            rotationZ = rotationDegrees.value
                        )
                    )
                }
            }
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
            ) {
                items(scanFileList) { item ->
                    FileItem(item)
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(alignment = Alignment.BottomEnd),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(
                onClick = { viewModel.senderClick() }
            ) {
                Text(
                    text = getNames(Locale.getDefault().language).startUploading,
                    modifier = Modifier.width(100.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
    if (scanFile) {
        Dialog(
            onDismissRequest = { },
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                ScanFile()
            }
        }
    }
    MainViewModel.sendState = true
    MainViewModel.receiveState = false
}
