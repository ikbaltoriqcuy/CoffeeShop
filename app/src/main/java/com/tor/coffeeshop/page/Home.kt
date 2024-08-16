package com.tor.coffeeshop.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tor.cofeeshop.R
import com.tor.coffeeshop.Dimens
import com.tor.coffeeshop.ui.theme.GreyLighter
import com.tor.coffeeshop.utils.SubTitle1
import com.tor.coffeeshop.utils.SubTitle2

/**
Created by ikbaltoriq on 15,August,2024
 **/


@Preview(
    showSystemUi = true,
    device = Devices.PHONE
)
@Composable
fun Home() {
    Box(modifier = Modifier.fillMaxSize()) {
        Background()
        Box(modifier = Modifier
            .padding(top = Dimens.padding32)
            .padding(Dimens.padding16)
        ) {
            LocationInfo()
        }
    }
}

@Composable
fun SearchVie() {

}

@Composable
fun LocationInfo() {
    Column {
        SubTitle1(label = "Location", color = GreyLighter)
        Row {
            SubTitle2(
                label = "Bilzen, Tanjung Balai",
                modifier = Modifier.padding(top = Dimens.padding4)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_arrow_below),
                contentDescription = "arrow",
                modifier = Modifier
                    .size(16.dp)
                    .align(
                        Alignment.CenterVertically
                    )
            )
        }
    }
}

@Composable
private fun Background() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.4f)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xFF313131), Color(0xFF111111))
                )
            )
    )
}
