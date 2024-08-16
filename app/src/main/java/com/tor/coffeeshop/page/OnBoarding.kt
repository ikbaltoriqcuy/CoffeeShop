package com.tor.coffeeshop.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.tor.cofeeshop.R
import com.tor.coffeeshop.Dimens
import com.tor.coffeeshop.ui.theme.GreyLighter
import com.tor.coffeeshop.utils.ButtonCoffee
import com.tor.coffeeshop.utils.Headline
import com.tor.coffeeshop.utils.SubTitle1

/**
Created by ikbaltoriq on 15,August,2024
 **/

@Preview(
    showSystemUi = true,
    device = Devices.PHONE
)
@Composable
fun OnBoarding() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        CoffeeBackground(Modifier)
        ContentStarted()
    }
}

@Composable
fun CoffeeBackground(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        Box(
            modifier = modifier
                .fillMaxWidth()
                .weight(0.7f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg_coffee),
                contentDescription = "Coffee Logo",
                modifier = modifier
                    .fillMaxSize()
            )
        }

        Spacer(
            modifier = modifier
                .weight(0.4f)
                .fillMaxWidth()
        )
    }
}

@Composable
fun ContentStarted() {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(
            modifier = Modifier
                .weight(0.50f)
                .fillMaxWidth()
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Headline(
                label = stringResource(id = R.string.onboarding_headline),
                modifier = Modifier
                    .fillMaxWidth(0.8f)
            )
            SubTitle1(
                label = stringResource(id = R.string.onboarding_welcome),
                color = GreyLighter,
                modifier = Modifier
                    .fillMaxWidth(fraction = 0.8f)
                    .padding(top = Dimens.padding16)
            )

            ButtonCoffee(
                label = stringResource(id = R.string.onboarding_btn_get_started),
                modifier = Modifier
                .fillMaxWidth()
                .padding(top = Dimens.padding32)
                .padding(
                    vertical = Dimens.padding16,
                    horizontal = Dimens.padding20
                )
            )
        }
    }
}