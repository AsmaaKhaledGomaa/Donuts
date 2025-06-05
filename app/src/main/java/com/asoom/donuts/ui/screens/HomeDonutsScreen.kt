package com.asoom.donuts.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asoom.donuts.R
import com.asoom.donuts.ui.theme.BackGroundBinkColor
import com.asoom.donuts.ui.theme.Black60Color
import com.asoom.donuts.ui.theme.ChocolateGlazeColor
import com.asoom.donuts.ui.theme.InterFont
import com.asoom.donuts.ui.theme.LightOfWhiteColor
import com.asoom.donuts.ui.theme.StrawberryWhellColor
import com.asoom.donuts.ui.theme.TitleColor

@Composable
fun HomeDonutsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Color.White, LightOfWhiteColor)))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(bottom = 80.dp)
        ) {
            Column(modifier = Modifier.padding(start = 38.dp, top = 74.dp)) {
                HeaderSection()
                TodayOffersSection()
                DonutsListSection()
            }
        }

        BottomNavigationBar(
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 40.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Let’s Gonuts!",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = TitleColor,
                fontFamily = InterFont
            )
            Text(
                text = "Order your favourite donuts from here",
                color = Black60Color,
                fontSize = 14.sp,
                fontFamily = InterFont,
                fontWeight = FontWeight.Medium
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 3.dp)
                .size(45.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(BackGroundBinkColor)
        ) {
            Icon(
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.Center),
                painter = painterResource(R.drawable.ic_search),
                contentDescription = "search icon",
                tint = TitleColor
            )
        }
    }
}

@Composable
fun TodayOffersSection() {
    Text(
        modifier = Modifier.padding(top = 46.dp),
        text = "Today Offers",
        color = Color.Black,
        fontSize = 20.sp,
        fontFamily = InterFont,
        fontWeight = FontWeight.SemiBold
    )

    Row(
        modifier = Modifier
            .padding(top = 22.dp)
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
    ) {
        OfferCard(
            title = "Strawberry Wheel",
            description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
            oldPrice = "$20",
            newPrice = "$16",
            backgroundColor = StrawberryWhellColor,
            imageRes = R.drawable.img_donut_card_1
        )

        OfferCard(
            title = "Chocolate Glaze",
            description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
            oldPrice = "$20",
            newPrice = "$16",
            backgroundColor = ChocolateGlazeColor,
            imageRes = R.drawable.img_donut_card_2
        )
    }
}

@Composable
fun OfferCard(
    title: String,
    description: String,
    oldPrice: String,
    newPrice: String,
    backgroundColor: Color,
    imageRes: Int
) {
    Box(modifier = Modifier
        .padding(horizontal = 10.dp)
        .width(229.dp)) {

        Box(modifier = Modifier.width(250.dp)) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(backgroundColor)
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .padding(top = 15.dp, start = 15.dp)
                        .clip(CircleShape)
                        .size(35.dp)
                        .background(Color.White)
                ) {
                    Icon(
                        modifier = Modifier.align(Alignment.Center),
                        painter = painterResource(R.drawable.ic_fav),
                        contentDescription = "fav icon",
                        tint = TitleColor
                    )
                }
                Text(
                    modifier = Modifier.padding(top = 144.dp, start = 20.dp),
                    text = title,
                    color = Color.Black,
                    fontWeight = FontWeight.Medium,
                    fontFamily = InterFont,
                    fontSize = 16.sp
                )
                Text(
                    modifier = Modifier.padding(top = 9.dp, start = 20.dp, end = 16.dp),
                    text = description,
                    color = Black60Color,
                    fontSize = 12.sp,
                    fontFamily = InterFont,
                    lineHeight = 16.sp
                )
                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 20.dp, top = 5.dp, bottom = 15.dp),
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = oldPrice,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = InterFont,
                        color = Black60Color
                    )
                    Text(
                        modifier = Modifier.padding(start = 5.dp),
                        text = newPrice,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = InterFont,
                        color = Color.Black
                    )
                }
            }
        }

        Image(
            modifier = Modifier
                .padding(top = 36.dp)
                .align(Alignment.TopEnd),
            painter = painterResource(imageRes),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
    }
}

@Composable
fun DonutsListSection() {
    Text(
        modifier = Modifier.padding(top = 42.dp),
        text = "Donuts",
        color = Color.Black,
        fontSize = 20.sp,
        fontFamily = InterFont,
        fontWeight = FontWeight.SemiBold
    )

    Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
        CardDonuts(
            modifier = Modifier.padding(top = 17.dp, end = 10.dp),
            imageDonuts = painterResource(R.drawable.img_donuts_one),
            title = "Chocolate Cherry",
            subTitle = "$22",
        )
        CardDonuts(
            modifier = Modifier.padding(top = 17.dp, start = 10.dp, end = 10.dp),
            imageDonuts = painterResource(R.drawable.img_donuts_two),
            title = "Strawberry Rain",
            subTitle = "$22"
        )
        CardDonuts(
            modifier = Modifier.padding(top = 17.dp, start = 10.dp, end = 40.dp),
            imageDonuts = painterResource(R.drawable.img_donuts_three),
            title = "Strawberry",
            subTitle = "$22"
        )
    }
}

@Composable
fun CardDonuts(
    modifier: Modifier = Modifier,
    imageDonuts: Painter,
    title: String,
    subTitle: String
) {
    Box(
        modifier = modifier
            .width(140.dp)
            .height(160.dp)
            .padding(top = 30.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White)
                .padding(top = 40.dp, bottom = 12.dp, start = 12.dp, end = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = InterFont,
                color = Color.Black.copy(alpha = .6f),
                maxLines = 1,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = subTitle,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = InterFont,
                color = TitleColor,
                maxLines = 1,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally)

            )
        }

        Image(
            painter = imageDonuts,
            contentDescription = title,
            modifier = Modifier
                .size(100.dp)
                .offset(y = (-20).dp),
            contentScale = ContentScale.Fit
        )
    }
}


@Composable
fun BottomNavigationBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(start = 46.dp, end = 46.dp, bottom = 22.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        listOf(
            R.drawable.ic_home,
            R.drawable.ic_heart_navigation,
            R.drawable.ic_notification,
            R.drawable.ic_buy,
            R.drawable.ic_profile
        ).forEach {
            Icon(
                painter = painterResource(it),
                contentDescription = null,
                tint = TitleColor
            )
        }
    }
}
