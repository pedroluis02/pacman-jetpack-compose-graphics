package com.github.pedroluis02.pacmangamegraphics.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PacmanCanvasView(
    modifier: Modifier = Modifier,
    color: Color = Color.Yellow
) {
    Canvas(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        val pacmanDiameter = 200.dp.toPx()
        val pacmanRadius = pacmanDiameter / 2

        val pacmanSize = Size(pacmanDiameter, pacmanDiameter)
        val pacmanOffset = center.minus(Offset(pacmanRadius, pacmanRadius))

        drawArc(
            color,
            45f,
            270f,
            true,
            pacmanOffset,
            pacmanSize
        )
    }
}

@Preview
@Composable
fun PacmanCanvasPreview() {
    PacmanCanvasView(color = Color.Cyan)
}