package com.maximillianleonov.cinemax.feature.search.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
//import com.maximillianleonov.cinemax.core.model.MediaType
import com.maximillianleonov.cinemax.feature.search.SearchRoute

object SearchDestination :
    com.maximillianleonov.cinemax.core.navigation.CinemaxNavigationDestination {
    override val route = "search_route"
    override val destination = "search_destination"
}

fun NavGraphBuilder.searchGraph(
//    onNavigateToListDestination: (com.maximillianleonov.cinemax.core.model.MediaType.Common) -> Unit,
//    onNavigateToDetailsDestination: (com.maximillianleonov.cinemax.core.model.MediaType.Details) -> Unit
) = composable(route = SearchDestination.route) {
    SearchRoute(
//        onSeeAllClick = onNavigateToListDestination,
//        onMovieClick = { onNavigateToDetailsDestination(MediaType.Details.Movie(it)) },
//        onTvShowClick = { onNavigateToDetailsDestination(MediaType.Details.TvShow(it)) }
    )
}
