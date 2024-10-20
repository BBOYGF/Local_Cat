package com.felinetech.localcat.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.compottie.*
import localcat.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi


// 接收动画
@OptIn(ExperimentalResourceApi::class)
@Composable
actual fun ReceiverAnimation() {

    val composition by rememberLottieComposition {
        LottieCompositionSpec.JsonString(
//            File("src/commonMain/composeResources/files/animation_search.json")
//                .run {
//                    readText(Charsets.UTF_8)
//                }
            Res.readBytes("files/animation_search.json").decodeToString()
        )
    }
    val progress by animateLottieCompositionAsState(composition)

    Image(
        painter = rememberLottiePainter(
            composition = composition,
            progress = { progress },
        ),
        modifier = Modifier.width(300.dp)
            .height(300.dp),
        contentDescription = "Lottie animation"
    )
}

// 扫描文件动画
@OptIn(ExperimentalResourceApi::class)
@Composable
actual fun ScanFile() {
    val composition by rememberLottieComposition {
        LottieCompositionSpec.JsonString(
//            File("src/commonMain/composeResources/drawable/search_file.json")
//                .run {
//                    readText(Charsets.UTF_8)
//                }
            Res.readBytes("files/search_file.json").decodeToString()
        )
    }
    val progress by animateLottieCompositionAsState(
        composition,
        iterations = Compottie.IterateForever
    )
    Image(
        painter = rememberLottiePainter(
            composition = composition,
            progress = { progress },
        ),
        modifier = Modifier.fillMaxWidth(), contentDescription = "Lottie animation"
    )
}
