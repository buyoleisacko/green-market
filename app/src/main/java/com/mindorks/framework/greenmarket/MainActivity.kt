package com.mindorks.framework.greenmarket

import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mindorks.framework.greenmarket.ui.theme.GreenMarketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreenMarketTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }}
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column() {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ){
            Icon(painter=painterResource(id = R.drawable.menu), contentDescription = "menu",
                modifier = Modifier.size(20.dp))
            Text(text = "GreenMarket")
            Icon(painter=painterResource(id = R.drawable.grocery), contentDescription = "grocery",
                modifier = Modifier.size(20.dp))



        }

        Column() {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ){
                Text(text = "Online Delivery")

            }

        }


        Column() {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ){
                Icon(painter = painterResource(id = R.drawable.location), contentDescription = "location",
                    modifier = Modifier.size(20.dp))
                Text(text = "Current Location")
                Text(text = "Select Current Location",
                    color = MaterialTheme.colors.primaryVariant)

            }

        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Please Enter Your Location")

        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "So that we can offer you a list of available supermarkets",
            fontStyle = )
        }

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreenMarketTheme {
        Greeting("Hello Android")
    }
}