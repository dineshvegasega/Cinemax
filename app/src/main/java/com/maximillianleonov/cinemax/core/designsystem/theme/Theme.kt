
@file:Suppress("MatchingDeclarationName")

package com.maximillianleonov.cinemax.core.designsystem.theme
//

import androidx.compose.foundation.LocalIndication
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

@Composable
fun CinemaxTheme(
    colorScheme: ColorScheme = DarkColorScheme,
    shapes: Shapes = Shapes,
    typography: Typography = Typography,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = colorScheme,
        shapes = shapes,
        typography = typography
    ) { ProvideCinemaxThemeDependencies(content = content) }
}

@Composable
private fun ProvideCinemaxThemeDependencies(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalCinemaxColors provides CinemaxColors(),
        LocalCinemaxShapes provides CinemaxShapes(),
        LocalCinemaxTypography provides CinemaxTypography(),
        LocalCinemaxSpacing provides CinemaxSpacing(),
//        LocalIndication provides rememberCinemaxRipple(),
//        LocalRippleTheme provides CinemaxRippleTheme
    ) {
        ProvideTextStyle(value = CinemaxTheme.typography.regular.h4, content = content)
    }
}



object CinemaxTheme {
    val colors: CinemaxColors
        @Composable
        @ReadOnlyComposable
        get() = LocalCinemaxColors.current

    val shapes: CinemaxShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalCinemaxShapes.current

    val typography: CinemaxTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalCinemaxTypography.current

    val spacing: CinemaxSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalCinemaxSpacing.current
}
