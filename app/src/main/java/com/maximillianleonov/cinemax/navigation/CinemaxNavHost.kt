package com.maximillianleonov.cinemax.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.maximillianleonov.cinemax.core.navigation.CinemaxNavigationDestination
import com.maximillianleonov.cinemax.feature.details.navigation.detailsGraph
import com.maximillianleonov.cinemax.feature.home.navigation.homeGraph
import com.maximillianleonov.cinemax.feature.list.navigation.listGraph
import com.maximillianleonov.cinemax.feature.search.navigation.searchGraph
import com.maximillianleonov.cinemax.feature.settings.navigation.settingsGraph
import com.maximillianleonov.cinemax.feature.wishlist.navigation.wishlistGraph

//import com.maximillianleonov.cinemax.feature.details.navigation.DetailsDestination
//import com.maximillianleonov.cinemax.feature.details.navigation.detailsGraph
//import com.maximillianleonov.cinemax.feature.home.navigation.homeGraph
//import com.maximillianleonov.cinemax.feature.list.navigation.ListDestination
//import com.maximillianleonov.cinemax.feature.list.navigation.listGraph
//import com.maximillianleonov.cinemax.feature.search.navigation.searchGraph
//import com.maximillianleonov.cinemax.feature.settings.navigation.settingsGraph
//import com.maximillianleonov.cinemax.feature.wishlist.navigation.wishlistGraph

@Composable
fun CinemaxNavHost(
    navController: NavHostController,
    startDestination: CinemaxNavigationDestination,
    onNavigateToDestination: (CinemaxNavigationDestination, String) -> Unit,
    onBackClick: () -> Unit,
    onShowMessage: (String) -> Unit,
//    onSetSystemBarsColorTransparent: () -> Unit,
//    onResetSystemBarsColor: () -> Unit,
    modifier: Modifier = Modifier
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination.route
    ) {
        homeGraph(
//            onNavigateToListDestination = {
//                onNavigateToDestination(ListDestination, ListDestination.createNavigationRoute(it))
//            },
//            onNavigateToDetailsDestination = {
//                onNavigateToDestination(
//                    DetailsDestination,
//                    DetailsDestination.createNavigationRoute(it)
//                )
//            }
        )
        searchGraph(
//            onNavigateToListDestination = {
//                onNavigateToDestination(ListDestination, ListDestination.createNavigationRoute(it))
//            },
//            onNavigateToDetailsDestination = {
//                onNavigateToDestination(
//                    DetailsDestination,
//                    DetailsDestination.createNavigationRoute(it)
//                )
//            }
        )
        wishlistGraph(
//            onNavigateToDetailsDestination = {
//                onNavigateToDestination(
//                    DetailsDestination,
//                    DetailsDestination.createNavigationRoute(it)
//                )
//            }
        )
        settingsGraph()
        listGraph(
//            onBackButtonClick = onBackClick,
//            onNavigateToDetailsDestination = {
//                onNavigateToDestination(
//                    DetailsDestination,
//                    DetailsDestination.createNavigationRoute(it)
//                )
//            }
        )
        detailsGraph(
//            onBackButtonClick = onBackClick,
//            onShowMessage = onShowMessage,
//            onSetSystemBarsColorTransparent = onSetSystemBarsColorTransparent,
//            onResetSystemBarsColor = onResetSystemBarsColor
        )
    }
}
