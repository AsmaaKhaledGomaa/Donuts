package com.asoom.donuts.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asoom.donuts.R
import com.asoom.donuts.ui.theme.BackGroundBinkColor
import com.asoom.donuts.ui.theme.InterFont
import com.asoom.donuts.ui.theme.SubTitleColor
import com.asoom.donuts.ui.theme.TitleColor

@Composable
fun SplashScreen() {
    val config = LocalConfiguration.current
    val density = LocalDensity.current
    val screenHeight = config.screenHeightDp
    val screenWidth = config.screenWidthDp

    val imageHeightDp = with(density) { (screenHeight * 0.64f).dp }
    val contentHorizontalPadding = with(density) { (screenWidth * 0.1f).dp }
    val spacerHeight = with(density) { (screenHeight * 0.06f).dp }
    val buttonBottomPadding = with(density) { (screenHeight * 0.05f).dp }

    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundBinkColor)
            .verticalScroll(scrollState)
    ) {
        SplashImage(imageHeightDp)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = imageHeightDp * 0.75f),
            horizontalAlignment = Alignment.Start
        ) {
            SplashContent(
                horizontalPadding = contentHorizontalPadding,
                spacerHeight = spacerHeight,
                buttonBottomPadding = buttonBottomPadding
            )
        }
    }
}

@Composable
private fun SplashImage(imageHeight: Dp) {
    Image(
        painter = painterResource(R.drawable.donuts_splash_screen),
        contentDescription = "Donuts Splash Screen",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .fillMaxWidth()
            .height(imageHeight)
    )
}

@Composable
private fun SplashContent(
    horizontalPadding: Dp,
    spacerHeight: Dp,
    buttonBottomPadding: Dp
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(horizontal = horizontalPadding)
        ) {
            SplashTitle()
            SplashSubtitle()
            Spacer(modifier = Modifier.height(spacerHeight))
            GetStartedButton(buttonBottomPadding)
        }
    }
}

@Composable
private fun SplashTitle() {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val density = LocalDensity.current
    val titleWidthDp = with(density) { (screenWidth * 0.60f).dp }
    val titleFontSize = responsiveFontSize(0.00013f)

    Text(
        modifier = Modifier.width(titleWidthDp),
        text = "Gonuts with Donuts",
        fontSize = titleFontSize,
        fontWeight = FontWeight.Bold,
        fontFamily = InterFont,
        color = TitleColor,
        letterSpacing = 0.sp,
        lineHeight = titleFontSize * 1.2f
    )
}

@Composable
private fun SplashSubtitle() {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val density = LocalDensity.current
    val subtitleWidthDp = with(density) { (screenWidth * 0.70f).dp }
    val subtitleFontSize = responsiveFontSize(0.000039f)

    Text(
        modifier = Modifier
            .width(subtitleWidthDp)
            .fillMaxWidth()
            .padding(top = 19.dp),
        text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
        fontSize = subtitleFontSize,
        fontWeight = FontWeight.Medium,
        fontFamily = InterFont,
        color = SubTitleColor,
        letterSpacing = 0.sp,
        lineHeight = subtitleFontSize * 1.4f
    )
}

@Composable
private fun GetStartedButton(bottomPadding: Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = bottomPadding)
            .clip(RoundedCornerShape(50.dp))
            .background(Color.White)
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 22.dp)
                .height(24.dp),
            text = "Get Started",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = InterFont,
            color = Color.Black,
            letterSpacing = 0.sp,
            lineHeight = TextUnit.Unspecified,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun responsiveFontSize(factor: Float): TextUnit {
    val configuration = LocalConfiguration.current
    val density = LocalDensity.current

    val screenWidthDp = configuration.screenWidthDp
    val screenHeightDp = configuration.screenHeightDp

    return with(density) {
        (screenWidthDp * screenHeightDp * factor).sp
    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}
