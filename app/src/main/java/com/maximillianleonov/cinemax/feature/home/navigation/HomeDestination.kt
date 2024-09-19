package com.maximillianleonov.cinemax.feature.home.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.maximillianleonov.cinemax.core.navigation.CinemaxNavigationDestination
import com.maximillianleonov.cinemax.feature.home.HomeRoute

object HomeDestination : CinemaxNavigationDestination {
    override val route = "home_route"
    override val destination = "home_destination"
}


fun NavGraphBuilder.homeGraph(
//    onNavigateToListDestination: (com.maximillianleonov.cinemax.core.model.MediaType.Common) -> Unit,
//    onNavigateToDetailsDestination: (com.maximillianleonov.cinemax.core.model.MediaType.Details) -> Unit
) = composable(route = HomeDestination.route) {
    HomeRoute(
//        onSeeAllClick = onNavigateToListDestination,
//        onMovieClick = { onNavigateToDetailsDestination(MediaType.Details.Movie(it)) },
//        onTvShowClick = { onNavigateToDetailsDestination(MediaType.Details.TvShow(it)) }
    )
}
