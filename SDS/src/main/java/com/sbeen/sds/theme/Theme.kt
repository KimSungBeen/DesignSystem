package com.sbeen.sds.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

private val DarkColorScheme = darkColorScheme(
    primary = PrimitiveSaturationBlueD01,
    background = PrimitiveNeutralGray11,
    error = PrimitiveSaturationRedD01
)

private val LightColorScheme = lightColorScheme(
    primary = PrimitiveSaturationBlueL01,
    background = PrimitiveNeutralGray01,
    error = PrimitiveSaturationRedL01
)

@Composable
fun SDSTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    CompositionLocalProvider(LocalTypography provides DefaultTypography) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}

object SDSTheme {
    val typography: SDSTypography
        @Composable
        get() = LocalTypography.current
}
