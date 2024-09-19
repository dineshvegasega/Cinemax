package com.maximillianleonov.cinemax.feature.settings.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.maximillianleonov.cinemax.feature.settings.SettingsRoute

object SettingsDestination :
    com.maximillianleonov.cinemax.core.navigation.CinemaxNavigationDestination {
    override val route = "settings_route"
    override val destination = "settings_destination"
}

fun NavGraphBuilder.settingsGraph() = composable(route = SettingsDestination.route) {
    SettingsRoute()
}
