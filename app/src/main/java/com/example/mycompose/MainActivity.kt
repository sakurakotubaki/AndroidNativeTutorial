package com.example.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycompose.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    // ononCreateとは、Activityが作成された時に呼ばれる
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentは、ComposeのUIを表示するための関数
        setContent {
            // MyComposeThemeは、テーマを設定するための関数
            MyComposeTheme {
                // Surfaceは、Material Designのコンポーネントの一つ
                Surface(
                    modifier = Modifier.fillMaxSize(),// fillMaxSizeは、画面いっぱいに表示するための関数
                    color = MaterialTheme.colorScheme.background// colorSchemeは、Material Designの色を設定するための関数
                ) {
                    // ここで、Textを表示する関数を呼び出す
                    GreetingText(message = "Happy Birthday Sam!")
                }
            }
        }
    }
}

// 新しく作る関数には、@Composableアノテーションをつける
@Composable
// 新しい関数を定義する
fun GreetingText(message: String, modifier: Modifier = Modifier) {
    Row {
        Text(
            text = message
        )
        Text(
            text = message
        )
    }
    Column {
        Text(
            text = message
        )
        Text(
            text = message
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyComposeTheme {
//        Greeting("Android")
        GreetingText(message = "Happy Birthday Sam!")
    }
}