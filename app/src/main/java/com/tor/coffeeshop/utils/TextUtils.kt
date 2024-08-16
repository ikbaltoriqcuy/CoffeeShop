package com.tor.coffeeshop.utils

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.tor.coffeeshop.Dimens

/**
Created by ikbaltoriq on 15,August,2024
 **/


@Composable
fun Headline(
    label: String,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = Color.White,
    modifier: Modifier = Modifier,
) {
    Text(
        text = label,
        fontSize = Dimens.textSize32,
        fontWeight = FontWeight.Bold,
        textAlign = textAlign,
        color = color,
        modifier = modifier
    )
}

@Composable
fun SubTitle3(
    label: String,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = Color.White,
    modifier: Modifier = Modifier,
) {
    Text(
        text = label,
        fontSize = Dimens.textSize24,
        fontWeight = FontWeight.Bold,
        textAlign = textAlign,
        color = color,
        modifier = modifier
    )
}

@Composable
fun SubTitle2(
    label: String,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = Color.White,
    modifier: Modifier = Modifier,
) {
    Text(
        text = label,
        fontSize = Dimens.textSize16,
        textAlign = textAlign,
        color = color,
        modifier = modifier
    )
}


@Composable
fun SubTitle1(
    label: String,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = Color.White,
    modifier: Modifier = Modifier,
) {
    Text(
        text = label,
        fontSize = Dimens.textSize14,
        textAlign = textAlign,
        color = color,
        modifier = modifier
    )
}

@Composable
fun Body(
    label: String,
    textAlign: TextAlign = TextAlign.Center,
    color: Color = Color.White,
    modifier: Modifier = Modifier,
) {
    Text(
        text = label,
        fontSize = Dimens.textSize8,
        textAlign = textAlign,
        color = color,
        modifier = modifier
    )
}