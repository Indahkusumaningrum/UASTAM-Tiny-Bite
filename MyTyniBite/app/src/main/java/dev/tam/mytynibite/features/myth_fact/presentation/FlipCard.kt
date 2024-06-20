package dev.tam.mytynibite.features.myth_fact.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tam.mytynibite.features.myth_fact.data.MythOrFact

@Composable
fun FlipCard(mythOrFact: MythOrFact, modifier: Modifier = Modifier) {
    var flipped by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { flipped = !flipped },
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            if (flipped) {
                Row {
                    Text(
                        text = if (mythOrFact.isFact) "Fakta" else "Mitos",
                        style = MaterialTheme.typography.titleSmall,
                        color = if (mythOrFact.isFact) Color.Green else Color.Red
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = mythOrFact.explanation, textAlign = TextAlign.Justify)
                }
            } else {
                Column {
                    Text(text = mythOrFact.statement, style = MaterialTheme.typography.titleSmall)
                }
            }
        }
    }
}

@Composable
@Preview
private fun FlipCardPreview() {
    FlipCard(MythOrFact("Mitos", false, "Mitos adalah sebuah pernyataan yang tidak benar"))
}