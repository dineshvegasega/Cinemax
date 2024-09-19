package com.maximillianleonov.cinemax.feature.wishlist.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
//import com.maximillianleonov.cinemax.core.model.MediaType
import com.maximillianleonov.cinemax.feature.wishlist.WishlistRoute

object WishlistDestination :
    com.maximillianleonov.cinemax.core.navigation.CinemaxNavigationDestination {
    override val route = "wishlist_route"
    override val destination = "wishlist_destination"
}

fun NavGraphBuilder.wishlistGraph(
//    onNavigateToDetailsDestination: (com.maximillianleonov.cinemax.core.model.MediaType.Details) -> Unit
) = composable(route = WishlistDestination.route) {
    WishlistRoute(
//        onMovieClick = { onNavigateToDetailsDestination(MediaType.Details.Movie(it)) },
//        onTvShowClick = { onNavigateToDetailsDestination(MediaType.Details.TvShow(it)) }
    )
}
