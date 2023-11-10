package com.kevin.androidbuildtypesandflavoursdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.androidbuildtypesandflavoursdemo.ui.theme.AndroidBuildTypesAndFlavoursDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidBuildTypesAndFlavoursDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Cyan)
                    ) {
                        // Setting name from build config constants from build config fields
                        Greeting(
                            BuildConfig.BuildFlavourName,
                            Modifier.padding(20.dp)
                        )

                        Spacer(modifier = Modifier.height(100.dp))

                        // Image from flavour package resources
                        Text(
                            text = "Below image is from Flavour package resources",
                            modifier = Modifier.padding(20.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.baseline_cake_24),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                        )
                        Column(
                            modifier = Modifier
                                .background(Color.Red)
                                .fillMaxWidth()
                        ) {
                            // Resource from Main packager resources
                            Text(
                                text = "Below image is from Main package resources",
                                modifier = Modifier.padding(20.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.baseline_filter_list_24),
                                contentDescription = "",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp)
                            )

                        }


                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello from Flavour $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidBuildTypesAndFlavoursDemoTheme {
        Greeting("Android")
    }
}