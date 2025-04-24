package com.github.pedroluis02.pacmangamegraphics.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun PacmanCanvasView(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        drawPacman()
    }
}

internal fun DrawScope.drawPacman(
    radius: Dp = 100.dp,
    color: Color = Color.Yellow,
    offset: Offset = center
) {
    val radiusPx = radius.toPx()
    val diameterPx = radiusPx * 2

    val sizePx = Size(diameterPx, diameterPx)
    val offsetPx = offset.minus(Offset(radiusPx, radiusPx))

    drawArc(
        color,
        45f,
        270f,
        true,
        offsetPx,
        sizePx
    )
}

@Preview
@Composable
private fun PacmanCanvasPreview() {
    PacmanCanvasView()
}