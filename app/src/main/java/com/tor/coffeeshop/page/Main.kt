package com.tor.coffeeshop.page

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.tor.cofeeshop.R
import com.tor.coffeeshop.ui.theme.BrownNormal
import com.tor.coffeeshop.ui.theme.SurfaceWhite

/**
Created by ikbaltoriq on 15,August,2024
 **/

sealed class BottomNavItem(val name: String, val icon: Int) {
    object Home : BottomNavItem("home", R.drawable.ic_home)
    object Favorite : BottomNavItem("favorite", R.drawable.ic_heart)
    object Bag : BottomNavItem("bag", R.drawable.ic_bag)
    object Notification : BottomNavItem("notification", R.drawable.ic_notification)
}

@Preview(
    showSystemUi = true,
    device = Devices.PHONE
)
@Composable
fun Main() {
    Box(modifier = Modifier.fillMaxSize()) {
        BottomNavigationBar(Modifier.align(Alignment.BottomCenter))
    }
}

@Preview(
    showSystemUi = true,
    device = Devices.PHONE
)
@Composable
fun BottomNavigationBar(modifier: Modifier = Modifier) {
    val items: List<BottomNavItem> = listOf(
        BottomNavItem.Home,
        BottomNavItem.Favorite,
        BottomNavItem.Bag,
        BottomNavItem.Notification
    )
    BottomNavigation(
        backgroundColor = SurfaceWhite,
        modifier = modifier
    ) {

        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.name,
                        modifier = Modifier,
                        tint = if (index == 0) BrownNormal else Color.Unspecified
                    )
                },
                label = {},
                selected = true,
                onClick = {}
            )
        }
    }
}
