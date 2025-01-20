package com.felinetech.localcat.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.felinetech.localcat.Constants.desktopDownload
import com.felinetech.localcat.Constants.feedback
import com.felinetech.localcat.Constants.productHome
import com.felinetech.localcat.components.ColorBackground
import com.felinetech.localcat.utlis.getNames
import com.felinetech.localcat.utlis.openUrl
import com.felinetech.localcat.view_model.AboutViewModel.showQsDialog
import com.felinetech.localcat.view_model.MainViewModel.bottomSheetVisible
import localcat.composeapp.generated.resources.APK
import localcat.composeapp.generated.resources.Res
import localcat.composeapp.generated.resources.money
import org.jetbrains.compose.resources.painterResource
import java.util.*


@Composable
fun About() {
    var registerDialog by remember { mutableStateOf(false) }
    var payDialog by remember { mutableStateOf(false) }

    ColorBackground()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = getNames(Locale.getDefault().language).aboutAppTitleText,
            color = Color.White,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = TextUnit(20f, TextUnitType.Sp)
            )
        )
        Icon(
            imageVector = Icons.Outlined.Person,
            contentDescription = "关于",
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .offset(y = -30.dp), tint = MaterialTheme.colorScheme.surfaceTint
        )
        Text(
            text = getNames(Locale.getDefault().language).aboutContentText,
            style = TextStyle(
                fontSize = TextUnit(12f, TextUnitType.Sp),
                color = Color.White,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.offset(y = -30.dp)
        )
        Button(onClick = {
            // 打开产品界面
            openUrl(desktopDownload)
        }) {
            Text(
                text = getNames(Locale.getDefault().language).downloadAPP,
                modifier = Modifier.width(150.dp),
                textAlign = TextAlign.Center,
            )
        }
        Button(onClick = {
            // 打开反馈页面
            openUrl(feedback)
        }) {
            Text(
                text = getNames(Locale.getDefault().language).feedBackTitle,
                modifier = Modifier.width(150.dp),
                textAlign = TextAlign.Center
            )
        }

        Button(onClick = {
            // 打赏作者
            bottomSheetVisible = true
        }) {
            Text(
                text = getNames(Locale.getDefault().language).rewardAuthor,
                modifier = Modifier.width(150.dp),
                textAlign = TextAlign.Center
            )
        }
        Text(
            text = getNames(Locale.getDefault().language).aboutAppOtherText,
            color = MaterialTheme.colorScheme.tertiary,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.clickable {
                openUrl(productHome)
            }
        )
    }

    // 注册码弹窗
    if (registerDialog) {
        var text by remember { mutableStateOf("") }
        Dialog(onDismissRequest = { registerDialog = false }) {
            Card(
                modifier = Modifier
                    .width(300.dp)
                    .height(300.dp), colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                        .background(Color.White), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("使用订单号注册码", style = MaterialTheme.typography.titleLarge)
                    Spacer(modifier = Modifier.height(20.dp))
                    Icon(
                        painter = painterResource(Res.drawable.money),
                        contentDescription = "图片", modifier = Modifier
                            .height(80.dp)
                            .width(80.dp), tint = MaterialTheme.colorScheme.surfaceTint
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text("请输入注册码：")
                        BasicTextField(
                            value = text,
                            onValueChange = {
                                text = it
                                println("修改后的text是：$text")
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(25.dp)
                                .padding(start = 10.dp)
                                .background(Color(0xffeeeeee)),
                            textStyle = TextStyle(
                                fontSize = 16.sp,
                            ),
                            singleLine = true,
                        )
                        println("重新构造")
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Button(onClick = { registerDialog = false }) {
                            Text("注册")
                        }
                        Button(onClick = { registerDialog = false }) {
                            Text(text = "取消")
                        }
                    }
                }
            }
        }
    }

    // 支付选择弹出
    if (payDialog) {
        Dialog(onDismissRequest = { payDialog = false }) {
            Card(
                modifier = Modifier
                    .width(300.dp)
                    .height(300.dp), colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {

            }
        }
    }

    if (showQsDialog.value) {
        Dialog(
            onDismissRequest = { showQsDialog.value = false },
            properties = DialogProperties(dismissOnBackPress = true, dismissOnClickOutside = true)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // 显示二维码
                Image(
                    painter = painterResource(Res.drawable.APK),
                    contentDescription = "QR Code",
                    modifier = Modifier.size(200.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                // 关闭按钮
                Button(onClick = {
                    showQsDialog.value = false
                }) {
                    Text("关闭")
                }
            }
        }
    }


}
