package com.example.composequadrantandroidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrantandroidstudio.ui.theme.ComposeQuadrantAndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantAndroidStudioTheme {
                Surface {

                }
            }
        }
    }
}

@Composable
fun Quadrants(modifier: Modifier = Modifier){
    Column(Modifier.fillMaxSize()) {
        Row(modifier = modifier.weight(1F)){
            Quadrant(
                quadrantHeading = stringResource(R.string.first_quadrant_heading),
                quadrantContent = stringResource(R.string.first_quadrant_content),
                modifier = modifier.weight(1F),
                bgColor = Color(0xFFEADDFF)
            )
            Quadrant(
                quadrantHeading = stringResource(R.string.second_quadrant_heading),
                quadrantContent = stringResource(R.string.second_quadrant_content),
                modifier = modifier.weight(1F),
                bgColor = Color(0xFFD0BCFF)
            )
        }
        Row(modifier = modifier.weight(1F)) {
            Quadrant(
                quadrantHeading = stringResource(R.string.third_quadrant_heading),
                quadrantContent = stringResource(R.string.third_quadrant_content),
                modifier = modifier.weight(1F),
                bgColor = Color(0xFFB69DF8)
            )
            Quadrant(
                quadrantHeading = stringResource(R.string.fourth_content_string),
                quadrantContent = stringResource(R.string.fourth_quadrant_content),
                modifier = modifier.weight(1F),
                bgColor = Color(0xFFF6EDFF)

            )
        }
    }
}

@Composable
fun Quadrant(quadrantHeading: String, quadrantContent: String, bgColor: Color, modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .background(bgColor)
        .padding(16.dp)) {
        Text(
            text = quadrantHeading,
            modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = quadrantContent,
            modifier = modifier.align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantAndroidStudioTheme {
        Quadrants()
    }
}