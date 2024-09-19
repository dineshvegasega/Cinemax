package com.maximillianleonov.cinemax.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.maximillianleonov.cinemax.R
import com.maximillianleonov.cinemax.core.navigation.CinemaxNavigationDestination
import com.maximillianleonov.cinemax.feature.home.navigation.HomeDestination
import com.maximillianleonov.cinemax.feature.search.navigation.SearchDestination
import com.maximillianleonov.cinemax.feature.settings.navigation.SettingsDestination
import com.maximillianleonov.cinemax.feature.wishlist.navigation.WishlistDestination


enum class TopLevelDestination(
    override val route: String,
    override val destination: String,
    @DrawableRes val iconResourceId: Int,
    @StringRes val textResourceId: Int
): CinemaxNavigationDestination {
    Home(
        route = HomeDestination.route,
        destination = HomeDestination.destination,
        iconResourceId = R.drawable.ic_home,
        textResourceId = R.string.home
    ),
    Search(
        route = SearchDestination.route,
        destination = SearchDestination.destination,
        iconResourceId = R.drawable.ic_search,
        textResourceId = R.string.search
    ),
    Wishlist(
        route = WishlistDestination.route,
        destination = WishlistDestination.destination,
        iconResourceId = R.drawable.ic_wishlist,
        textResourceId = R.string.wishlist
    ),
    Settings(
        route = SettingsDestination.route,
        destination = SettingsDestination.destination,
        iconResourceId = R.drawable.ic_settings,
        textResourceId = R.string.settings
    )
}