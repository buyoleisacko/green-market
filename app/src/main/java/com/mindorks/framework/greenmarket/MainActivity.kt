package com.mindorks.framework.greenmarket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
    Row(){
        Icon(painter=painterResource(id = R.drawable.menu), contentDescription = "menu",
            modifier = Modifier.size(45.dp))
        Text(text = "GreenMarket")
    }
    
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreenMarketTheme {
        Greeting("Hello Android")
    }
}