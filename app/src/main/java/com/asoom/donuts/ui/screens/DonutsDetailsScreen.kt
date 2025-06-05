package com.asoom.donuts.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asoom.donuts.R
import com.asoom.donuts.ui.theme.BackGroundBinkColor
import com.asoom.donuts.ui.theme.Black60Color
import com.asoom.donuts.ui.theme.Black80Color
import com.asoom.donuts.ui.theme.InterFont
import com.asoom.donuts.ui.theme.LightOfWhiteColor1
import com.asoom.donuts.ui.theme.TitleColor

@Composable
fun ItemDetailsScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundBinkColor)
    ) {
        Icon(
            modifier = Modifier.padding(start = 32.dp, top = 45.dp),
            painter = painterResource(R.drawable.ic_arrow_back),
            contentDescription = "",
            tint = TitleColor
        )
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(R.drawable.img_big_donut),
                contentDescription = ""
            )
            Box(modifier = Modifier.align(Alignment.BottomCenter)) {
                Box(
                    modifier = Modifier
                        .padding(top = 23.dp)
                        .align(Alignment.BottomCenter)
                        .clip(RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp))
                        .background(Color.White)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(
                                top = 35.dp,
                            )

                    ) {
                        Text(
                            modifier = Modifier.padding(
                                start = 40.dp,
                                end = 40.dp
                            ),
                            text = "Strawberry Wheel",
                            fontSize = 30.sp,
                            fontFamily = InterFont,
                            lineHeight = TextUnit.Unspecified,
                            letterSpacing = 0.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = TitleColor
                        )
                        Spacer(modifier = Modifier.height(33.dp))
                        Text(
                            modifier = Modifier.padding(
                                start = 40.dp,
                                end = 40.dp
                            ),
                            text = "About Gonut",
                            fontSize = 18.sp,
                            fontFamily = InterFont,
                            lineHeight = TextUnit.Unspecified,
                            letterSpacing = 0.sp,
                            fontWeight = FontWeight.Medium,
                            color = Black80Color
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            modifier = Modifier.padding(
                                start = 40.dp,
                                end = 40.dp
                            ),
                            text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                            fontSize = 14.sp,
                            fontFamily = InterFont,
                            letterSpacing = 0.7.sp,
                            fontWeight = FontWeight.Normal,
                            lineHeight = 14.sp,
                            color = Black60Color
                        )
                        Spacer(modifier = Modifier.height(26.dp))
                        Text(
                            modifier = Modifier.padding(
                                start = 40.dp,
                                end = 40.dp
                            ),
                            text = "Quantity",
                            fontSize = 18.sp,
                            fontFamily = InterFont,
                            lineHeight = TextUnit.Unspecified,
                            letterSpacing = 0.sp,
                            fontWeight = FontWeight.Medium,
                            color = Black80Color
                        )

                        Row(
                            modifier = Modifier
                                .background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(
                                            Color.White,
                                            LightOfWhiteColor1
                                        )
                                    )
                                )
                                .padding(
                                    top = 19.dp,
                                    bottom = 19.dp,
                                    start = 40.dp,
                                    end = 40.dp
                                )
                        ) {

                            BoxQuantity(
                                modifier = Modifier.padding(top = 2.dp),
                                colorBg = Color.White,
                                text = "-",
                                fontSize = 32.sp
                            )
                            BoxQuantity(
                                modifier = Modifier.padding(start = 20.dp, top = 2.dp),
                                colorBg = Color.White,
                                text = "1",
                                fontSize = 22.sp
                            )
                            BoxQuantity(
                                modifier = Modifier.padding(start = 20.dp),
                                colorBg = Color.Black,
                                text = "+",
                                fontSize = 32.sp,
                                textColor = Color.White
                            )
                        }

                        Row(
                            modifier = Modifier.padding(
                                top = 30.dp,
                                start = 40.dp,
                                end = 40.dp,
                                bottom = 40.dp
                            ),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier.padding(end = 10.dp),
                                text = "£16",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 30.sp,
                                fontFamily = InterFont,
                                letterSpacing = 0.sp,
                                lineHeight = TextUnit.Unspecified,
                                color = Color.Black
                            )
                            Box(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(50.dp))
                                    .background(TitleColor)
                            ) {
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                        .padding(top = 22.dp, bottom = 22.dp),
                                    text = "Add to Cart", color = Color.White,
                                )
                            }
                        }

                    }
                }
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(end = 33.dp)
                        .size(45.dp)
                        .shadow(elevation = 1.dp, shape = RoundedCornerShape(15.dp))
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.White)
                ) {
                    Icon(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(27.dp),
                        painter = painterResource(R.drawable.ic_fav),
                        contentDescription = "",
                        tint = TitleColor
                    )
                }
            }
        }
    }

}

@Composable
fun BoxQuantity(
    modifier: Modifier,
    colorBg: Color,
    text: String,
    fontSize: TextUnit,
    textColor: Color = Color.Black
) {
    Box(
        modifier = modifier
            .size(45.dp)
            .shadow(elevation = 2.dp, shape = RoundedCornerShape(15.dp))
            .background(colorBg)
            .clip(RoundedCornerShape(15.dp)),


        ) {
        Text(
            modifier = Modifier.align(Alignment.Center).padding(bottom = 2.dp),
            text = text,
            fontSize = fontSize,
            fontFamily = InterFont,
            fontWeight = FontWeight.Medium,
            color = textColor,
            letterSpacing = 0.sp,
            lineHeight = TextUnit.Unspecified,
        )
    }
}

@Preview
@Composable
fun ItemDetailsScreenPreview() {
    ItemDetailsScreen()
}