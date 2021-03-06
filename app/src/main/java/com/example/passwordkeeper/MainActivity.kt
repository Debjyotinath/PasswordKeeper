package com.example.passwordkeeper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.passwordkeeper.ui.theme.PasswordKeeperTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PasswordKeeperTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("User")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Test Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PasswordKeeperTheme {
        Greeting("User")
    }
}