package com.tor.coffeeshop.utils

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.tor.coffeeshop.Dimens
import com.tor.coffeeshop.ui.theme.BrownNormal
import com.tor.coffeeshop.ui.theme.GreyDark
import com.tor.coffeeshop.ui.theme.SurfaceNormalDark
import com.tor.coffeeshop.ui.theme.SurfaceWhite

/**
Created by ikbaltoriq on 15,August,2024
 **/


@Composable
fun ButtonCoffee(label: String, modifier: Modifier , onClick: () -> Unit = {}) {
    Button(
        shape = RoundedCornerShape(Dimens.padding16),
        colors = ButtonDefaults.buttonColors(
            containerColor = BrownNormal,
            contentColor = SurfaceWhite,
            disabledContainerColor = SurfaceNormalDark,
            disabledContentColor = GreyDark),
        modifier = modifier,
        onClick = { onClick.invoke() }
    ) {
        SubTitle2(label = label, modifier = Modifier.padding(vertical = Dimens.padding8))
    }
}