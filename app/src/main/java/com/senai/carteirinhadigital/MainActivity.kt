package com.senai.carteirinhadigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.senai.carteirinhadigital.ui.theme.CarteirinhaDigitalTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigitalTheme {
                Scaffold {
                    innerPadding ->
                    CarteirinhaDigitalApp(
                        modifier = Modifier
                            .padding(paddingValues = innerPadding)
                            .fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun CarteirinhaDigitalApp(modifier: Modifier = Modifier){
    Box {
        Image(
            painter = painterResource(id = R.drawable.a),
            contentDecription = "Fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(17.dp),
            modifier = modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.senai),
                contentDescription = null


            )
            Image(
                painter = painterResource(id = R.drawable.images),
                contentDescription = stringResource(id = R.string.app_name),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .border(
                        width = 5.dp,
                        color = Color.Red,

                        )
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color.Blue)) {
                            append("N")
                        }
                        append("o")

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        ) {
                            append("m")
                        }
                        append("e: ")
                    }
                )
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color.Blue)) {
                            append("J")
                        }
                        append("osé")

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        ) {
                            append("R")
                        }
                        append("yan")
                    }
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                @Composable
                fun TextShadow() {
                    val offset = Offset(5.0f, 10.0f)
                    Text(
                        text = "Curso: ",
                        style = TextStyle(
                            fontSize = 24.sp,
                            shadow = Shadow(
                                color = Color.Blue, offset = offset, blurRadius = 3f
                            )
                        )
                    )
                }

                @Composable
                fun TextShadods() {
                    val offset = Offset(5.0f, 10.0f)
                    Text(
                        text = "Desenvolvimento de sistema",
                        style = TextStyle(
                            fontSize = 24.sp,
                            shadow = Shadow(
                                color = Color.Blue, offset = offset, blurRadius = 3f
                            )
                        )
                    )
                }
            }
            QrCode(
                "90000000001756464093",
                modifier = Modifier
                    .border(
                        width = 4.dp,
                        Color.DarkGray
                    )
            )
        }
        }
}
@Preview(showSystemUi = true
)
@Composable
fun CarteirinhaDigitalAppPreview(){
    CarteirinhaDigitalTheme {
        CarteirinhaDigitalApp()
    }
}


