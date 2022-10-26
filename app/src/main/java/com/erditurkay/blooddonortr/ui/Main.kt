package com.erditurkay.blooddonortr.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erditurkay.blooddonortr.R
import com.erditurkay.blooddonortr.ui.common.MyTextField
import com.erditurkay.blooddonortr.ui.common.PasswordField
import com.erditurkay.blooddonortr.ui.theme.BloodDonorTRTheme

class Main : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloodDonorTRTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(10.dp)
                    ) {
                        MyTextField(
                            title = "Name",
                            keyboardType = KeyboardType.Text,
                            icon = Icons.Filled.Person
                        )

                        MyTextField(
                            title = "Surname",
                            keyboardType = KeyboardType.Text,
                            icon = Icons.Filled.Person
                        )

                        MyTextField(
                            title = "Mail",
                            keyboardType = KeyboardType.Email,
                            icon = Icons.Filled.Email
                        )

                        PasswordField()

                        MyTextField(
                            title = "Age",
                            keyboardType = KeyboardType.Number,
                            icon = Icons.Filled.Face,
                            maxCharacter = 2
                        )
                        
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "KAYIT OL")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BloodDonorTRTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(10.dp)
            ) {
                MyTextField(
                    title = "Name",
                    keyboardType = KeyboardType.Text,
                    icon = Icons.Filled.Person
                )

                MyTextField(
                    title = "Surname",
                    keyboardType = KeyboardType.Text,
                    icon = Icons.Filled.Person
                )

                MyTextField(
                    title = "Mail",
                    keyboardType = KeyboardType.Email,
                    icon = Icons.Filled.Email
                )

                PasswordField()

                MyTextField(
                    title = "Age",
                    keyboardType = KeyboardType.Number,
                    icon = Icons.Filled.Face,
                    maxCharacter = 2
                )

                Button(onClick = { /*TODO*/ }) {
                    Text(text = "KAYIT OL")
                }
            }
        }
    }
}