package com.sbeen.sds.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val PrimitiveNeutralBlack01: Color = Color(0xFF000000)
private val PrimitiveNeutralBlackAlpha01: Color = Color(0x66000000)
private val PrimitiveNeutralBlackAlpha02: Color = Color(0x99000000)
internal val PrimitiveNeutralGray01: Color = Color(0xFFF2F4F7)
private val PrimitiveNeutralGray02: Color = Color(0xFFEBEDF2)
private val PrimitiveNeutralGray03: Color = Color(0xFFDCDFE5)
private val PrimitiveNeutralGray04: Color = Color(0xFFC2C5CC)
private val PrimitiveNeutralGray05: Color = Color(0xFFA8ABB2)
private val PrimitiveNeutralGray06: Color = Color(0xFF8D9199)
private val PrimitiveNeutralGray07: Color = Color(0xFF747880)
private val PrimitiveNeutralGray08: Color = Color(0xFF5C5F66)
private val PrimitiveNeutralGray09: Color = Color(0xFF3D3E40)
private val PrimitiveNeutralGray10: Color = Color(0xFF232529)
internal val PrimitiveSaturationBlueL01: Color = Color(0xFF007AFF)
internal val PrimitiveNeutralGray11: Color = Color(0xFF191B1F)
private val PrimitiveSaturationBlueAlphaL01: Color = Color(0x29007AFF)
internal val PrimitiveSaturationBlueD01: Color = Color(0xFF0A84FF)
private val PrimitiveSaturationBlueAlphaL02: Color = Color(0x66007AFF)
private val PrimitiveSaturationBlueAlphaD01: Color = Color(0x3D0A84FF)
private val PrimitiveNeutralGrayAlphaL01: Color = Color(0x0A28292E)
private val PrimitiveSaturationBlueAlphaD02: Color = Color(0x8F0A84FF)
private val PrimitiveNeutralWhite01: Color = Color(0xFFFFFFFF)
private val PrimitiveNeutralWhiteAlpha01: Color = Color(0xF2FFFFFF)
private val PrimitiveNeutralGrayAlphaL02: Color = Color(0x1428292E)
private val PrimitiveNeutralWhiteAlpha02: Color = Color(0x33FFFFFF)
private val PrimitiveNeutralGrayAlphaL03: Color = Color(0x1F28292E)
private val PrimitiveNeutralWhiteAlpha03: Color = Color(0x66FFFFFF)
internal val PrimitiveSaturationRedL01: Color = Color(0xFFFF3B30)
private val PrimitiveNeutralGrayAlphaL04: Color = Color(0x2928292E)
private val PrimitiveNeutralWhiteAlpha04: Color = Color(0x99FFFFFF)
internal val PrimitiveSaturationRedD01: Color = Color(0xFFFF453A)
private val PrimitiveNeutralGrayAlphaL05: Color = Color(0x3328292E)
private val PrimitiveNeutralGrayAlphaL06: Color = Color(0x3D28292E)
private val PrimitiveSaturationRedAlphaL01: Color = Color(0x29FF3B30)
private val PrimitiveNeutralGrayAlphaL07: Color = Color(0x4728292E)
private val PrimitiveSaturationRedAlphaL02: Color = Color(0x66FF3B30)
private val PrimitiveSaturationRedAlphaD01: Color = Color(0x3DFF453A)
private val PrimitiveNeutralGrayAlphaL08: Color = Color(0x9928292E)
private val PrimitiveNeutralGrayAlphaL09: Color = Color(0xF2191B1F)
private val PrimitiveNeutralGrayAlphaD01: Color = Color(0xFAF2F4F7)
private val PrimitiveNeutralGrayAlphaD02: Color = Color(0x99EBEDF2)
private val PrimitiveNeutralGrayAlphaD03: Color = Color(0x47EBEDF2)
private val PrimitiveSaturationRedAlphaD02: Color = Color(0x8FFF453A)
private val PrimitiveNeutralGrayAlphaD04: Color = Color(0x3DEBEDF2)
private val PrimitiveNeutralGrayAlphaD05: Color = Color(0x33EBEDF2)
private val PrimitiveNeutralGrayAlphaD06: Color = Color(0x29EBEDF2)
private val PrimitiveNeutralGrayAlphaD07: Color = Color(0x1FEBEDF2)
private val PrimitiveNeutralGrayAlphaD08: Color = Color(0x14EBEDF2)
private val PrimitiveNeutralGrayAlphaD09: Color = Color(0x0AEBEDF2)
private val PrimitiveSaturationOrangeL01: Color = Color(0xFFFF9500)
private val PrimitiveSaturationOrangeD01: Color = Color(0xFFFF9F0A)
private val PrimitiveSaturationOrangeAlphaL01: Color = Color(0x29FF9500)
private val PrimitiveSaturationOrangeAlphaL02: Color = Color(0x66FF9500)
private val PrimitiveSaturationOrangeAlphaD01: Color = Color(0x3DFF9F0A)
private val PrimitiveSaturationOrangeAlphaD02: Color = Color(0x8FFF9F0A)
private val PrimitiveSaturationYellowL01: Color = Color(0xFFFFCC00)
private val PrimitiveSaturationYellowD01: Color = Color(0xFFFFD60A)
private val PrimitiveSaturationYellowAlphaL01: Color = Color(0x29FFCC00)
private val PrimitiveSaturationYellowAlphaL02: Color = Color(0x66FFCC00)
private val PrimitiveSaturationYellowAlphaD01: Color = Color(0x29FFD60A)
private val PrimitiveSaturationYellowAlphaD02: Color = Color(0x8FFFD60A)
private val PrimitiveSaturationGreenL01: Color = Color(0xFF34C759)
private val PrimitiveSaturationGreenD01: Color = Color(0xFF30D158)
private val PrimitiveSaturationGreenAlphaL01: Color = Color(0x2934C759)
private val PrimitiveSaturationGreenAlphaL02: Color = Color(0x6634C759)
private val PrimitiveSaturationGreenAlphaD01: Color = Color(0x3D30D158)
private val PrimitiveSaturationGreenAlphaD02: Color = Color(0x8F30D158)
private val PrimitiveSaturationMintL01: Color = Color(0xFF00C7BE)
private val PrimitiveSaturationMintD01: Color = Color(0xFF63E6E2)
private val PrimitiveSaturationMintAlphaL01: Color = Color(0x2900C7BE)
private val PrimitiveSaturationMintAlphaL02: Color = Color(0x6600C7BE)
private val PrimitiveSaturationMintAlphaD01: Color = Color(0x3D63E6E2)
private val PrimitiveSaturationMintAlphaD02: Color = Color(0x8F63E6E2)
private val PrimitiveSaturationCyanL01: Color = Color(0xFF32ADE6)
private val PrimitiveSaturationCyanD01: Color = Color(0xFF64D2FF)
private val PrimitiveSaturationCyanAlphaL01: Color = Color(0x2932ADE6)
private val PrimitiveSaturationCyanAlphaL02: Color = Color(0x6632ADE6)
private val PrimitiveSaturationCyanAlphaD01: Color = Color(0x3D64D2FF)
private val PrimitiveSaturationCyanAlphaD02: Color = Color(0x8F64D2FF)
private val PrimitiveSaturationIndigoL01: Color = Color(0xFF5856D6)
private val PrimitiveSaturationIndigoD01: Color = Color(0xFF5E5CE6)
private val PrimitiveSaturationIndigoAlphaL01: Color = Color(0x295856D6)
private val PrimitiveSaturationIndigoAlphaL02: Color = Color(0x665856D6)
private val PrimitiveSaturationIndigoAlphaD01: Color = Color(0x3D5E5CE6)
private val PrimitiveSaturationIndigoAlphaD02: Color = Color(0x8F5E5CE6)
private val PrimitiveSaturationPurpleL01: Color = Color(0xFFAF52DE)
private val PrimitiveSaturationPurpleD01: Color = Color(0xFFBF5AF2)
private val PrimitiveSaturationPurpleAlphaL01: Color = Color(0x29AF52DE)
private val PrimitiveSaturationPurpleAlphaL02: Color = Color(0x66AF52DE)
private val PrimitiveSaturationPurpleAlphaD01: Color = Color(0x3DBF5AF2)
private val PrimitiveSaturationPurpleAlphaD02: Color = Color(0x8FBF5AF2)

val SemanticSurface01: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGray11
    } else {
        PrimitiveNeutralWhite01
    }

val SemanticSurface02: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGray10
    } else {
        PrimitiveNeutralGray01
    }

val SemanticSurface03: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGray09
    } else {
        PrimitiveNeutralWhite01
    }

val SemanticSurfaceNav: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaL09
    } else {
        PrimitiveNeutralWhiteAlpha01
    }

val SemanticGroupedSurface01: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGray11
    } else {
        PrimitiveNeutralGray01
    }

val SemanticGroupedSurface02: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGray10
    } else {
        PrimitiveNeutralWhite01
    }

val SemanticGroupedSurface03: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGray09
    } else {
        PrimitiveNeutralGray01
    }

val SemanticTextNeutralEmphasized: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralBlack01
    } else {
        PrimitiveNeutralWhite01
    }

val SemanticGroupedSurfaceNav: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaL09
    } else {
        PrimitiveNeutralGrayAlphaD01
    }

val SemanticDarkSurface01: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralBlack01
    } else {
        PrimitiveNeutralGray10
    }

val SemanticBackgroundNeutralEmphasized: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhite01
    } else {
        PrimitiveNeutralGray10
    }

val SemanticBackgroundNeutralDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaD08
    } else {
        PrimitiveNeutralGrayAlphaL02
    }

val SemanticBackgroundGrayDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGray09
    } else {
        PrimitiveNeutralGray10
    }

val SemanticBackgroundNeutralLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaD09
    } else {
        PrimitiveNeutralGrayAlphaL01
    }

val SemanticBackgroundWhiteDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhite01
    } else {
        PrimitiveNeutralWhite01
    }

val SemanticBackgroundWhiteMedium: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhiteAlpha03
    } else {
        PrimitiveNeutralWhiteAlpha03
    }

val SemanticBackgroundWhiteLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhiteAlpha02
    } else {
        PrimitiveNeutralWhiteAlpha02
    }

val SemanticBackgroundBlackDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralBlack01
    } else {
        PrimitiveNeutralBlack01
    }

val SemanticBackgroundAccentDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationBlueD01
    } else {
        PrimitiveSaturationBlueL01
    }

val SemanticBackgroundAccentLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationBlueAlphaD01
    } else {
        PrimitiveSaturationBlueAlphaL01
    }

val SemanticBackgroundSuccessDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationGreenD01
    } else {
        PrimitiveSaturationGreenL01
    }

val SemanticBackgroundSuccessLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationGreenAlphaD01
    } else {
        PrimitiveSaturationGreenAlphaL01
    }

val SemanticBackgroundDangerDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationRedD01
    } else {
        PrimitiveSaturationRedL01
    }

val SemanticBackgroundDangerLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationRedAlphaD01
    } else {
        PrimitiveSaturationRedAlphaL01
    }

val SemanticTextNeutralDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhite01
    } else {
        PrimitiveNeutralBlack01
    }

val SemanticTextNeutralLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaD02
    } else {
        PrimitiveNeutralGrayAlphaL08
    }

val SemanticTextNeutralDisabled: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaD03
    } else {
        PrimitiveNeutralGrayAlphaL07
    }

val SemanticTextWhiteDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhite01
    } else {
        PrimitiveNeutralWhite01
    }

val SemanticTextWhiteLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhiteAlpha04
    } else {
        PrimitiveNeutralWhiteAlpha04
    }

val SemanticTextBlackDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralBlack01
    } else {
        PrimitiveNeutralBlack01
    }

val SemanticTextBlackLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralBlackAlpha01
    } else {
        PrimitiveNeutralBlackAlpha01
    }

val SemanticTextAccentDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationBlueD01
    } else {
        PrimitiveSaturationBlueL01
    }

val SemanticIconNeutralEmphasized: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralBlack01
    } else {
        PrimitiveNeutralWhite01
    }

val SemanticTextSuccessDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationGreenD01
    } else {
        PrimitiveSaturationGreenL01
    }

val SemanticTextSevereDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationOrangeD01
    } else {
        PrimitiveSaturationOrangeL01
    }

val SemanticTextDangerDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationRedD01
    } else {
        PrimitiveSaturationRedL01
    }

val SemanticIconNeutralDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhite01
    } else {
        PrimitiveNeutralBlack01
    }

val SemanticIconNeutralLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaD02
    } else {
        PrimitiveNeutralGrayAlphaL08
    }

val SemanticIconNeutralDisabled: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaD03
    } else {
        PrimitiveNeutralGrayAlphaL07
    }

val SemanticIconWhiteDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhite01
    } else {
        PrimitiveNeutralWhite01
    }

val SemanticIconWhiteLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhiteAlpha04
    } else {
        PrimitiveNeutralWhiteAlpha04
    }

val SemanticIconBlackDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralBlack01
    } else {
        PrimitiveNeutralBlack01
    }

val SemanticIconAccentDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationBlueD01
    } else {
        PrimitiveSaturationBlueL01
    }

val SemanticIconSuccessDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationGreenD01
    } else {
        PrimitiveSaturationGreenL01
    }

val SemanticIconAttentionDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationYellowD01
    } else {
        PrimitiveSaturationYellowL01
    }

val SemanticIconSevereDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationOrangeD01
    } else {
        PrimitiveSaturationOrangeL01
    }

val SemanticIconDangerDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationRedD01
    } else {
        PrimitiveSaturationRedL01
    }

val SemanticBorderNeutralEmphasized: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhite01
    } else {
        PrimitiveNeutralBlack01
    }

val SemanticBorderNeutralDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaD07
    } else {
        PrimitiveNeutralGrayAlphaL03
    }

val SemanticBorderNeutralLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaD09
    } else {
        PrimitiveNeutralGrayAlphaL01
    }

val SemanticBorderWhiteDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhite01
    } else {
        PrimitiveNeutralWhite01
    }

val SemanticBorderWhiteLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralWhiteAlpha02
    } else {
        PrimitiveNeutralWhiteAlpha02
    }

val SemanticBorderDarkDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralBlack01
    } else {
        PrimitiveNeutralBlack01
    }

val SemanticBorderDarkLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaL03
    } else {
        PrimitiveNeutralGrayAlphaL03
    }

val SemanticBorderGrayLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralGrayAlphaD07
    } else {
        PrimitiveNeutralGrayAlphaD07
    }

val SemanticBorderAccentDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationBlueD01
    } else {
        PrimitiveSaturationBlueL01
    }

val SemanticBorderAccentLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationBlueAlphaD01
    } else {
        PrimitiveSaturationBlueAlphaL01
    }

val SemanticOverlayDeafult: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveNeutralBlackAlpha02
    } else {
        PrimitiveNeutralBlackAlpha01
    }

val SemanticBackgroundSevereDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationOrangeD01
    } else {
        PrimitiveSaturationOrangeL01
    }

val SemanticBackgroundSevereLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationOrangeAlphaD01
    } else {
        PrimitiveSaturationOrangeAlphaL01
    }

val SemanticBackgroundAttentionDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationYellowD01
    } else {
        PrimitiveSaturationYellowL01
    }

val SemanticBackgroundAttentionLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationYellowAlphaD01
    } else {
        PrimitiveSaturationYellowAlphaL01
    }

val SemanticBackgroundPurpleDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationPurpleD01
    } else {
        PrimitiveSaturationPurpleL01
    }

val SemanticBackgroundPurpleLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationPurpleAlphaD01
    } else {
        PrimitiveSaturationPurpleAlphaL01
    }

val SemanticBackgroundMintDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationMintD01
    } else {
        PrimitiveSaturationMintL01
    }

val SemanticBackgroundMintLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationMintAlphaD01
    } else {
        PrimitiveSaturationMintAlphaL01
    }

val SemanticBackgroundIndigoDefault: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationIndigoD01
    } else {
        PrimitiveSaturationIndigoL01
    }

val SemanticBackgroundIndigoLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) {
        PrimitiveSaturationIndigoAlphaD01
    } else {
        PrimitiveSaturationIndigoAlphaL01
    }
