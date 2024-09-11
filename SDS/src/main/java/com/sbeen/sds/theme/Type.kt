package com.sbeen.sds.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

/** 기본 서체 */
private val DefaultFont = TextStyle(
    fontFamily = FontFamily.SansSerif,
    fontWeight = FontWeight.Normal,
)

/** 기본 텍스트 스타일 */
internal val DefaultTypography = SDSTypography(
    h1 = DefaultFont.copy(
        fontSize = 40.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 60.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    ),
    h2 = DefaultFont.copy(
        fontSize = 28.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 42.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    ),
    h3 = DefaultFont.copy(
        fontSize = 24.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 36.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    ),
    h4 = DefaultFont.copy(
        fontSize = 20.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 30.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    ),
    h5 = DefaultFont.copy(
        fontSize = 18.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 28.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    ),
    title1 = DefaultFont.copy(
        fontSize = 18.sp,
        fontWeight = FontWeight.W600,
        lineHeight = 28.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    ),
    title2 = DefaultFont.copy(
        fontSize = 16.sp,
        fontWeight = FontWeight.W600,
        lineHeight = 24.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    ),
    title3 = DefaultFont.copy(
        fontSize = 14.sp,
        fontWeight = FontWeight.W600,
        lineHeight = 22.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    ),
    body1 = DefaultFont.copy(
        fontSize = 16.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 24.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    ),
    body2 = DefaultFont.copy(
        fontSize = 14.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 22.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    ),
    body3 = DefaultFont.copy(
        fontSize = 12.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 18.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    )
)

/** 텍스트 스타일 */
class SDSTypography(
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val h5: TextStyle,
    val title1: TextStyle,
    val title2: TextStyle,
    val title3: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val body3: TextStyle,
    val h4: TextStyle,
)

val LocalTypography = staticCompositionLocalOf {
    SDSTypography(
        h1 = DefaultFont,
        h2 = DefaultFont,
        h3 = DefaultFont,
        h5 = DefaultFont,
        title1 = DefaultFont,
        title2 = DefaultFont,
        title3 = DefaultFont,
        body1 = DefaultFont,
        body2 = DefaultFont,
        body3 = DefaultFont,
        h4 = DefaultFont
    )
}