package it.vfsfitvnm.vimusic.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import it.vfsfitvnm.vimusic.ui.styling.LocalColorPalette

fun TextStyle.style(style: FontStyle) = copy(fontStyle = style)

fun TextStyle.weight(weight: FontWeight) = copy(fontWeight = weight)

fun TextStyle.align(align: TextAlign) = copy(textAlign = align)

fun TextStyle.color(color: Color) = copy(color = color)

inline val TextStyle.italic: TextStyle
    get() = style(FontStyle.Italic)

inline val TextStyle.medium: TextStyle
    get() = weight(FontWeight.Medium)

inline val TextStyle.semiBold: TextStyle
    get() = weight(FontWeight.SemiBold)

inline val TextStyle.bold: TextStyle
    get() = weight(FontWeight.Bold)

inline val TextStyle.center: TextStyle
    get() = align(TextAlign.Center)

inline val TextStyle.secondary: TextStyle
    @Composable
    @ReadOnlyComposable
    get() = color(LocalColorPalette.current.textSecondary)

inline val TextStyle.disabled: TextStyle
    @Composable
    @ReadOnlyComposable
    get() = color(LocalColorPalette.current.textDisabled)
