package com.maximillianleonov.cinemax.feature.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
//import androidx.hilt.navigation.compose.hiltViewModel
//import androidx.lifecycle.compose.collectAsStateWithLifecycle
//import com.maximillianleonov.cinemax.feature.settings.components.SettingsGroupItem

@Composable
internal fun SettingsRoute(
//    modifier: Modifier = Modifier,
//    viewModel: SettingsViewModel = hiltViewModel()
) {
//    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    SettingsScreen(
//        uiState = uiState, modifier = modifier
    )
}

@Composable
private fun SettingsScreen(
//    uiState: SettingsUiState, modifier: Modifier = Modifier
) {
//    LazyColumn(
//        modifier = modifier
//            .padding(com.maximillianleonov.cinemax.core.designsystem.theme.CinemaxTheme.spacing.extraMedium)
//            .windowInsetsPadding(WindowInsets.safeDrawing),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.spacedBy(com.maximillianleonov.cinemax.core.designsystem.theme.CinemaxTheme.spacing.extraMedium)
//    ) {
//        items(uiState.settingsGroups) { settingsGroup ->
//            SettingsGroupItem(settingsGroup = settingsGroup)
//        }
//    }
}
