package com.maximillianleonov.cinemax.feature.list.navigation

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.maximillianleonov.cinemax.feature.list.ListRoute


object ListDestination :
    com.maximillianleonov.cinemax.core.navigation.CinemaxNavigationDestination {
    override val route = "list_route"
    override val destination = "list_destination"

    const val mediaTypeArgument = "mediaType"
    val routeWithArgument = "$route/{$mediaTypeArgument}"

//    fun createNavigationRoute(mediaType: com.maximillianleonov.cinemax.core.model.MediaType.Common) = "$route/${mediaType.mediaType}"
//
//    fun fromSavedStateHandle(savedStateHandle: SavedStateHandle) = com.maximillianleonov.cinemax.core.model.MediaType.Common[
//        checkNotNull(savedStateHandle[mediaTypeArgument]) { MediaTypeNullMessage }
//    ]
}


fun NavGraphBuilder.listGraph(
//    onBackButtonClick: () -> Unit,
//    onNavigateToDetailsDestination: (com.maximillianleonov.cinemax.core.model.MediaType.Details) -> Unit
) = composable(
    route = ListDestination.routeWithArgument,
    arguments = listOf(
        navArgument(ListDestination.mediaTypeArgument) { type = NavType.StringType }
    )
) {
    ListRoute(
//        onBackButtonClick = onBackButtonClick,
//        onMovieClick = { onNavigateToDetailsDestination(MediaType.Details.Movie(it)) },
//        onTvShowClick = { onNavigateToDetailsDestination(MediaType.Details.TvShow(it)) }
    )
}

private const val MediaTypeNullMessage = "Media type is null."