package com.felinetech.localcat.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.compottie.*
import java.io.File


// 接收动画
@Composable
fun ReceiverAnimation() {
//    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation_search))
//    val progress by animateLottieCompositionAsState(composition, iterations = Int.MAX_VALUE, speed = 2f)
//    LottieAnimation(composition = composition, progress = progress)
    val composition by rememberLottieComposition {
        LottieCompositionSpec.JsonString(
//            Res.readBytes("files/anim.json").decodeToString()

//            "{\"v\":\"4.6.10\",\"fr\":29,\"ip\":0,\"op\":105,\"w\":400,\"h\":400,\"nm\":\"Comp 1\",\"ddd\":0,\"assets\":[],\"layers\":[{\"ddd\":0,\"ind\":1,\"ty\":4,\"nm\":\"Shape Layer 1\",\"ks\":{\"o\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.833],\"y\":[0.833]},\"o\":{\"x\":[0.167],\"y\":[0.167]},\"n\":[\"0p833_0p833_0p167_0p167\"],\"t\":0,\"s\":[100],\"e\":[0]},{\"t\":60.0000024438501}]},\"r\":{\"a\":0,\"k\":0},\"p\":{\"a\":0,\"k\":[200,200,0]},\"a\":{\"a\":0,\"k\":[0,0,0]},\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.833,0.833,0.833],\"y\":[0.833,0.833,0.833]},\"o\":{\"x\":[0.167,0.167,0.167],\"y\":[0.167,0.167,0.167]},\"n\":[\"0p833_0p833_0p167_0p167\",\"0p833_0p833_0p167_0p167\",\"0p833_0p833_0p167_0p167\"],\"t\":0,\"s\":[30,30,100],\"e\":[100,100,100]},{\"t\":60.0000024438501}]}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"d\":1,\"ty\":\"el\",\"s\":{\"a\":0,\"k\":[331.973,331.973]},\"p\":{\"a\":0,\"k\":[0,0]},\"nm\":\"Ellipse Path 1\",\"mn\":\"ADBE Vector Shape - Ellipse\"},{\"ty\":\"st\",\"c\":{\"a\":0,\"k\":[0.8471,0.6392,0,1]},\"o\":{\"a\":0,\"k\":100},\"w\":{\"a\":0,\"k\":2},\"lc\":1,\"lj\":1,\"ml\":4,\"nm\":\"Stroke 1\",\"mn\":\"ADBE Vector Graphic - Stroke\"},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.8471,0.6392,0,1]},\"o\":{\"a\":0,\"k\":100},\"r\":1,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\"},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0.479,0.174],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[119.263,119.263],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Ellipse 1\",\"np\":3,\"cix\":2,\"ix\":1,\"mn\":\"ADBE Vector Group\"}],\"ip\":0,\"op\":900,\"st\":0,\"bm\":0,\"sr\":1},{\"ddd\":0,\"ind\":2,\"ty\":4,\"nm\":\"Shape Layer 2\",\"ks\":{\"o\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.833],\"y\":[0.833]},\"o\":{\"x\":[0.167],\"y\":[0.167]},\"n\":[\"0p833_0p833_0p167_0p167\"],\"t\":15,\"s\":[100],\"e\":[0]},{\"t\":75.0000030548126}]},\"r\":{\"a\":0,\"k\":0},\"p\":{\"a\":0,\"k\":[200,200,0]},\"a\":{\"a\":0,\"k\":[0,0,0]},\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.833,0.833,0.833],\"y\":[0.833,0.833,0.833]},\"o\":{\"x\":[0.167,0.167,0.167],\"y\":[0.167,0.167,0.167]},\"n\":[\"0p833_0p833_0p167_0p167\",\"0p833_0p833_0p167_0p167\",\"0p833_0p833_0p167_0p167\"],\"t\":15,\"s\":[30,30,100],\"e\":[100,100,100]},{\"t\":75.0000030548126}]}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"d\":1,\"ty\":\"el\",\"s\":{\"a\":0,\"k\":[331.973,331.973]},\"p\":{\"a\":0,\"k\":[0,0]},\"nm\":\"Ellipse Path 1\",\"mn\":\"ADBE Vector Shape - Ellipse\"},{\"ty\":\"st\",\"c\":{\"a\":0,\"k\":[0.8471,0.6392,0,1]},\"o\":{\"a\":0,\"k\":100},\"w\":{\"a\":0,\"k\":2},\"lc\":1,\"lj\":1,\"ml\":4,\"nm\":\"Stroke 1\",\"mn\":\"ADBE Vector Graphic - Stroke\"},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.8471,0.6392,0,1]},\"o\":{\"a\":0,\"k\":100},\"r\":1,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\"},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0.479,0.174],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[119.263,119.263],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Ellipse 1\",\"np\":3,\"cix\":2,\"ix\":1,\"mn\":\"ADBE Vector Group\"}],\"ip\":0,\"op\":900,\"st\":0,\"bm\":0,\"sr\":1},{\"ddd\":0,\"ind\":3,\"ty\":4,\"nm\":\"Shape Layer 3\",\"ks\":{\"o\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.833],\"y\":[0.833]},\"o\":{\"x\":[0.167],\"y\":[0.167]},\"n\":[\"0p833_0p833_0p167_0p167\"],\"t\":30,\"s\":[100],\"e\":[0]},{\"t\":90.0000036657751}]},\"r\":{\"a\":0,\"k\":0},\"p\":{\"a\":0,\"k\":[200,200,0]},\"a\":{\"a\":0,\"k\":[0,0,0]},\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.833,0.833,0.833],\"y\":[0.833,0.833,0.833]},\"o\":{\"x\":[0.167,0.167,0.167],\"y\":[0.167,0.167,0.167]},\"n\":[\"0p833_0p833_0p167_0p167\",\"0p833_0p833_0p167_0p167\",\"0p833_0p833_0p167_0p167\"],\"t\":30,\"s\":[30,30,100],\"e\":[100,100,100]},{\"t\":90.0000036657751}]}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"d\":1,\"ty\":\"el\",\"s\":{\"a\":0,\"k\":[331.973,331.973]},\"p\":{\"a\":0,\"k\":[0,0]},\"nm\":\"Ellipse Path 1\",\"mn\":\"ADBE Vector Shape - Ellipse\"},{\"ty\":\"st\",\"c\":{\"a\":0,\"k\":[0.8471,0.6392,0,1]},\"o\":{\"a\":0,\"k\":100},\"w\":{\"a\":0,\"k\":2},\"lc\":1,\"lj\":1,\"ml\":4,\"nm\":\"Stroke 1\",\"mn\":\"ADBE Vector Graphic - Stroke\"},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.8471,0.6392,0,1]},\"o\":{\"a\":0,\"k\":100},\"r\":1,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\"},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0.479,0.174],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[119.263,119.263],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Ellipse 1\",\"np\":3,\"cix\":2,\"ix\":1,\"mn\":\"ADBE Vector Group\"}],\"ip\":0,\"op\":900,\"st\":0,\"bm\":0,\"sr\":1},{\"ddd\":0,\"ind\":4,\"ty\":4,\"nm\":\"Shape Layer 4\",\"ks\":{\"o\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.833],\"y\":[0.833]},\"o\":{\"x\":[0.167],\"y\":[0.167]},\"n\":[\"0p833_0p833_0p167_0p167\"],\"t\":45,\"s\":[100],\"e\":[0]},{\"t\":105.000004276738}]},\"r\":{\"a\":0,\"k\":0},\"p\":{\"a\":0,\"k\":[200,200,0]},\"a\":{\"a\":0,\"k\":[0,0,0]},\"s\":{\"a\":1,\"k\":[{\"i\":{\"x\":[0.833,0.833,0.833],\"y\":[0.833,0.833,0.833]},\"o\":{\"x\":[0.167,0.167,0.167],\"y\":[0.167,0.167,0.167]},\"n\":[\"0p833_0p833_0p167_0p167\",\"0p833_0p833_0p167_0p167\",\"0p833_0p833_0p167_0p167\"],\"t\":45,\"s\":[30,30,100],\"e\":[100,100,100]},{\"t\":105.000004276738}]}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"d\":1,\"ty\":\"el\",\"s\":{\"a\":0,\"k\":[331.973,331.973]},\"p\":{\"a\":0,\"k\":[0,0]},\"nm\":\"Ellipse Path 1\",\"mn\":\"ADBE Vector Shape - Ellipse\"},{\"ty\":\"st\",\"c\":{\"a\":0,\"k\":[0.8471,0.6392,0,1]},\"o\":{\"a\":0,\"k\":100},\"w\":{\"a\":0,\"k\":2},\"lc\":1,\"lj\":1,\"ml\":4,\"nm\":\"Stroke 1\",\"mn\":\"ADBE Vector Graphic - Stroke\"},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.8471,0.6392,0,1]},\"o\":{\"a\":0,\"k\":100},\"r\":1,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\"},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[0.479,0.174],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[119.263,119.263],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Ellipse 1\",\"np\":3,\"cix\":2,\"ix\":1,\"mn\":\"ADBE Vector Group\"}],\"ip\":0,\"op\":900,\"st\":0,\"bm\":0,\"sr\":1}]}"
            File("src/main/resources/raw/animation_search.json")
                .run {
                    readText(Charsets.UTF_8)
                }
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
@Composable
fun ScanFile() {
    val composition by rememberLottieComposition {
        LottieCompositionSpec.JsonString(
//            Res.readBytes("files/anim.json").decodeToString()
//            "{\"v\":\"4.8.0\",\"meta\":{\"g\":\"LottieFiles AE 2.0.4\",\"a\":\"salman\",\"k\":\"file documents searching and find \",\"d\":\"file documents searching and find \",\"tc\":\"\"},\"fr\":33.3333282470703,\"ip\":0,\"op\":41.000403747934,\"w\":256,\"h\":256,\"nm\":\"document scan\",\"ddd\":0,\"assets\":[],\"layers\":[{\"ddd\":0,\"ind\":1,\"ty\":4,\"nm\":\"glass\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":0,\"ix\":10},\"p\":{\"a\":1,\"k\":[{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":0,\"s\":[139.217,179.465,0],\"to\":[0,1.833,0],\"ti\":[-2.167,-0.5,0]},{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":9,\"s\":[139.217,190.465,0],\"to\":[2.167,0.5,0],\"ti\":[-0.333,3.667,0]},{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":17,\"s\":[152.217,182.465,0],\"to\":[0.333,-3.667,0],\"ti\":[3.167,0.333,0]},{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":26,\"s\":[141.217,168.465,0],\"to\":[-3.167,-0.333,0],\"ti\":[1.333,-2,0]},{\"t\":37.0003643578916,\"s\":[133.217,180.465,0]}],\"ix\":2},\"a\":{\"a\":0,\"k\":[23.796,23.796,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"ind\":0,\"ty\":\"sh\",\"ix\":1,\"ks\":{\"a\":0,\"k\":{\"i\":[[-13.004,0],[0,-13.004],[13.004,0],[0,13.005]],\"o\":[[13.004,0],[0,13.005],[-13.004,0],[0,-13.004]],\"v\":[[0,-23.546],[23.546,0],[0,23.546],[-23.546,0]],\"c\":true},\"ix\":2},\"nm\":\"Path 1\",\"mn\":\"ADBE Vector Shape - Group\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.808000033509,0.885999971278,0.948999980852,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"bm\":0,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[23.795,23.796],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Group 1\",\"np\":2,\"cix\":2,\"bm\":0,\"ix\":1,\"mn\":\"ADBE Vector Group\",\"hd\":false}],\"ip\":0,\"op\":41.000403747934,\"st\":0,\"bm\":0},{\"ddd\":0,\"ind\":2,\"ty\":4,\"nm\":\"glass_boader\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":0,\"ix\":10},\"p\":{\"a\":1,\"k\":[{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":0,\"s\":[139.141,179.389,0],\"to\":[0,1.833,0],\"ti\":[-2.167,-0.5,0]},{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":9,\"s\":[139.141,190.389,0],\"to\":[2.167,0.5,0],\"ti\":[-0.333,3.667,0]},{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":17,\"s\":[152.141,182.389,0],\"to\":[0.333,-3.667,0],\"ti\":[3.167,0.333,0]},{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":26,\"s\":[141.141,168.389,0],\"to\":[-3.167,-0.333,0],\"ti\":[1.333,-2,0]},{\"t\":36.000354510381,\"s\":[133.141,180.389,0]}],\"ix\":2},\"a\":{\"a\":0,\"k\":[35.378,35.377,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"ind\":0,\"ty\":\"sh\",\"ix\":1,\"ks\":{\"a\":0,\"k\":{\"i\":[[0,0],[0,0],[11.226,11.226],[12.524,-12.522],[-12.523,-12.523],[-12.522,8.902],[0,0]],\"o\":[[0,0],[8.903,-12.521],[-12.524,-12.524],[-12.523,12.522],[11.227,11.227],[0,0],[0,0]],\"v\":[[29.821,22.217],[26.225,18.621],[22.747,-22.603],[-22.605,-22.604],[-22.605,22.746],[18.62,26.225],[22.216,29.821]],\"c\":true},\"ix\":2},\"nm\":\"Path 1\",\"mn\":\"ADBE Vector Shape - Group\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.226999993418,0.313999998803,0.4,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"bm\":0,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[35.378,35.377],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Group 1\",\"np\":2,\"cix\":2,\"bm\":0,\"ix\":1,\"mn\":\"ADBE Vector Group\",\"hd\":false}],\"ip\":0,\"op\":41.000403747934,\"st\":0,\"bm\":0},{\"ddd\":0,\"ind\":3,\"ty\":4,\"nm\":\"magnifier_hand\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":0,\"ix\":10},\"p\":{\"a\":1,\"k\":[{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":0,\"s\":[177.577,217.825,0],\"to\":[0,1.833,0],\"ti\":[-2.167,-0.5,0]},{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":9,\"s\":[177.577,228.825,0],\"to\":[2.167,0.5,0],\"ti\":[-0.333,3.667,0]},{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":17,\"s\":[190.577,220.825,0],\"to\":[0.333,-3.667,0],\"ti\":[3.167,0.333,0]},{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":26,\"s\":[179.577,206.825,0],\"to\":[-3.167,-0.333,0],\"ti\":[1.333,-2,0]},{\"t\":36.000354510381,\"s\":[171.577,218.825,0]}],\"ix\":2},\"a\":{\"a\":0,\"k\":[16.47,16.469,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"ind\":0,\"ty\":\"sh\",\"ix\":1,\"ks\":{\"a\":0,\"k\":{\"i\":[[-4.771,1.048],[0,0],[2.092,-2.092],[2.09,2.09],[0,0]],\"o\":[[0,0],[2.092,2.091],[-2.091,2.09],[0,0],[0.268,-4.041]],\"v\":[[-8.615,-16.219],[14.128,6.525],[14.128,14.13],[6.525,14.13],[-16.219,-8.615]],\"c\":true},\"ix\":2},\"nm\":\"Path 1\",\"mn\":\"ADBE Vector Shape - Group\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.898000021542,0.337000020345,0.226999993418,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"bm\":0,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[16.469,16.47],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Group 1\",\"np\":2,\"cix\":2,\"bm\":0,\"ix\":1,\"mn\":\"ADBE Vector Group\",\"hd\":false}],\"ip\":0,\"op\":41.000403747934,\"st\":0,\"bm\":0},{\"ddd\":0,\"ind\":4,\"ty\":4,\"nm\":\"folder_front\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":0,\"ix\":10},\"p\":{\"a\":0,\"k\":[135.281,168.938,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[78.067,39.269,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"ind\":0,\"ty\":\"sh\",\"ix\":1,\"ks\":{\"a\":0,\"k\":{\"i\":[[0,0],[0,0],[-0.801,2.817],[0,0],[-3.09,0],[0,0],[0.807,-2.743],[0,0],[3.965,0.027]],\"o\":[[0,0],[2.669,0],[0,0],[0.851,-2.97],[0,0],[2.858,0],[0,0],[-0.874,3.11],[0,0]],\"v\":[[-77.817,38.992],[-77.817,38.992],[-72.964,34.137],[-53.432,-34.003],[-46.775,-39.019],[72.907,-39.019],[77.011,-33.53],[57.658,32.237],[50.903,38.992]],\"c\":true},\"ix\":2},\"nm\":\"Path 1\",\"mn\":\"ADBE Vector Shape - Group\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[1,0.783999992819,0.263000009574,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"bm\":0,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[78.067,39.269],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Group 1\",\"np\":2,\"cix\":2,\"bm\":0,\"ix\":1,\"mn\":\"ADBE Vector Group\",\"hd\":false}],\"ip\":0,\"op\":41.000403747934,\"st\":0,\"bm\":0},{\"ddd\":0,\"ind\":5,\"ty\":4,\"nm\":\"document\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":0,\"ix\":10},\"p\":{\"a\":1,\"k\":[{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":0,\"s\":[-71.46,114.1,0],\"to\":[32.5,0,0],\"ti\":[-32.5,0,0]},{\"i\":{\"x\":0.667,\"y\":0.667},\"o\":{\"x\":0.333,\"y\":0.333},\"t\":11,\"s\":[123.54,114.1,0],\"to\":[0,0,0],\"ti\":[0,0,0]},{\"i\":{\"x\":0.667,\"y\":1},\"o\":{\"x\":0.333,\"y\":0},\"t\":26,\"s\":[123.54,114.1,0],\"to\":[42.667,0,0],\"ti\":[-42.667,0,0]},{\"t\":36.000354510381,\"s\":[379.54,114.1,0]}],\"ix\":2},\"a\":{\"a\":0,\"k\":[47.512,63.888,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"ind\":0,\"ty\":\"sh\",\"ix\":1,\"ks\":{\"a\":0,\"k\":{\"i\":[[1.471,0],[0,0],[0,1.473],[-1.473,0],[0,0],[0,-1.472]],\"o\":[[0,0],[-1.473,0],[0,-1.472],[0,0],[1.471,0],[0,1.473]],\"v\":[[29.166,2.665],[-29.164,2.665],[-31.829,-0.001],[-29.164,-2.665],[29.166,-2.665],[31.829,-0.001]],\"c\":true},\"ix\":2},\"nm\":\"Path 1\",\"mn\":\"ADBE Vector Shape - Group\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.851000019148,0.842999985639,0.791999966491,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"bm\":0,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[46.518,51.517],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Group 1\",\"np\":2,\"cix\":2,\"bm\":0,\"ix\":1,\"mn\":\"ADBE Vector Group\",\"hd\":false},{\"ty\":\"gr\",\"it\":[{\"ind\":0,\"ty\":\"sh\",\"ix\":1,\"ks\":{\"a\":0,\"k\":{\"i\":[[1.471,0],[0,0],[0,1.473],[-1.473,0],[0,0],[0,-1.472]],\"o\":[[0,0],[-1.473,0],[0,-1.472],[0,0],[1.471,0],[0,1.473]],\"v\":[[29.166,2.665],[-29.164,2.665],[-31.829,-0.001],[-29.164,-2.665],[29.166,-2.665],[31.829,-0.001]],\"c\":true},\"ix\":2},\"nm\":\"Path 1\",\"mn\":\"ADBE Vector Shape - Group\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.851000019148,0.842999985639,0.791999966491,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"bm\":0,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[46.518,39.084],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Group 2\",\"np\":2,\"cix\":2,\"bm\":0,\"ix\":2,\"mn\":\"ADBE Vector Group\",\"hd\":false},{\"ty\":\"gr\",\"it\":[{\"ind\":0,\"ty\":\"sh\",\"ix\":1,\"ks\":{\"a\":0,\"k\":{\"i\":[[0,0],[0,0],[0,2.243],[0,0]],\"o\":[[0,0],[-2.243,0],[0,0],[0,0]],\"v\":[[12.972,12.971],[-8.91,12.971],[-12.972,8.909],[-12.972,-12.971]],\"c\":true},\"ix\":2},\"nm\":\"Path 1\",\"mn\":\"ADBE Vector Shape - Group\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.851000019148,0.842999985639,0.791999966491,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"bm\":0,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[81.802,13.221],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Group 3\",\"np\":2,\"cix\":2,\"bm\":0,\"ix\":3,\"mn\":\"ADBE Vector Group\",\"hd\":false},{\"ty\":\"gr\",\"it\":[{\"ind\":0,\"ty\":\"sh\",\"ix\":1,\"ks\":{\"a\":0,\"k\":{\"i\":[[-12.776,-6.627],[0,0],[2.462,0],[0,0],[0,2.462],[0,0],[-2.462,0],[0,0]],\"o\":[[0,0],[0,2.462],[0,0],[-2.462,0],[0,0],[0,-2.462],[0,0],[4.323,10.762]],\"v\":[[47.262,-37.696],[47.262,59.179],[42.803,63.638],[-42.804,63.638],[-47.262,59.179],[-47.262,-59.18],[-42.804,-63.638],[21.318,-63.638]],\"c\":true},\"ix\":2},\"nm\":\"Path 1\",\"mn\":\"ADBE Vector Shape - Group\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.913999968884,0.913999968884,0.877999997606,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"bm\":0,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[47.512,63.888],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Group 4\",\"np\":2,\"cix\":2,\"bm\":0,\"ix\":4,\"mn\":\"ADBE Vector Group\",\"hd\":false}],\"ip\":0,\"op\":41.000403747934,\"st\":0,\"bm\":0},{\"ddd\":0,\"ind\":6,\"ty\":4,\"nm\":\"folder_back\",\"sr\":1,\"ks\":{\"o\":{\"a\":0,\"k\":100,\"ix\":11},\"r\":{\"a\":0,\"k\":0,\"ix\":10},\"p\":{\"a\":0,\"k\":[117.92,147.393,0],\"ix\":2},\"a\":{\"a\":0,\"k\":[65.56,60.788,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100,100],\"ix\":6}},\"ao\":0,\"shapes\":[{\"ty\":\"gr\",\"it\":[{\"ind\":0,\"ty\":\"sh\",\"ix\":1,\"ks\":{\"a\":0,\"k\":{\"i\":[[0,0],[0,0],[0.851,-2.97],[0,0],[2.672,0],[0,2.67],[0,0],[0,0],[0,0],[0,0],[-3.736,0],[0,0],[-1.268,-1.268],[0,0],[-1.792,0],[0,0],[0,-3.735],[0,0]],\"o\":[[0,0],[-3.089,0],[0,0],[-0.801,2.817],[-2.67,0],[0,0],[0,0],[0,0],[0,0],[0,-3.735],[0,0],[1.794,0],[0,0],[1.269,1.268],[0,0],[3.736,0],[0,0],[0,0]],\"v\":[[65.31,-17.475],[-28.027,-14.008],[-33.768,-9.881],[-53.143,56.402],[-60.456,60.537],[-65.31,55.682],[-65.31,37.107],[-65.31,-38.995],[-65.31,-42.632],[-65.31,-53.773],[-58.546,-60.537],[-10.488,-60.537],[-5.707,-58.557],[8.236,-44.613],[13.018,-42.633],[58.546,-42.633],[65.31,-35.869],[65.31,-33.557]],\"c\":true},\"ix\":2},\"nm\":\"Path 1\",\"mn\":\"ADBE Vector Shape - Group\",\"hd\":false},{\"ty\":\"fl\",\"c\":{\"a\":0,\"k\":[0.877999997606,0.677999997606,0.19199999641,1],\"ix\":4},\"o\":{\"a\":0,\"k\":100,\"ix\":5},\"r\":1,\"bm\":0,\"nm\":\"Fill 1\",\"mn\":\"ADBE Vector Graphic - Fill\",\"hd\":false},{\"ty\":\"tr\",\"p\":{\"a\":0,\"k\":[65.56,60.788],\"ix\":2},\"a\":{\"a\":0,\"k\":[0,0],\"ix\":1},\"s\":{\"a\":0,\"k\":[100,100],\"ix\":3},\"r\":{\"a\":0,\"k\":0,\"ix\":6},\"o\":{\"a\":0,\"k\":100,\"ix\":7},\"sk\":{\"a\":0,\"k\":0,\"ix\":4},\"sa\":{\"a\":0,\"k\":0,\"ix\":5},\"nm\":\"Transform\"}],\"nm\":\"Group 1\",\"np\":2,\"cix\":2,\"bm\":0,\"ix\":1,\"mn\":\"ADBE Vector Group\",\"hd\":false}],\"ip\":0,\"op\":41.000403747934,\"st\":0,\"bm\":0}],\"markers\":[]}"
            File("src/main/resources/raw/search_file.json")
                .run {
                    readText(Charsets.UTF_8)
                }
        )
    }
    val progress by animateLottieCompositionAsState(composition, iterations = Compottie.IterateForever)

    Image(
        painter = rememberLottiePainter(
            composition = composition,
            progress = { progress },
        ),
        modifier = Modifier.fillMaxWidth(), contentDescription = "Lottie animation"
    )
}
