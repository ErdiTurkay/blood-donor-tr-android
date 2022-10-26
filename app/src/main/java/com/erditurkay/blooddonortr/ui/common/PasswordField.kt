package com.erditurkay.blooddonortr.ui.common

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.erditurkay.blooddonortr.R

@Composable
fun PasswordField() {
    // rememberSaveable, ekran döndüğünde falan korur.
    var password by rememberSaveable { mutableStateOf("") }
    var visibility by remember { mutableStateOf(false) }

    val icon = if (visibility) {
        painterResource(id = R.drawable.ic_baseline_visibility_off_24)
    } else {
        painterResource(id = R.drawable.ic_baseline_visibility_24)
    }

    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        label = {
            Text(text = "Password")
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Lock,
                contentDescription = "Password Icon"
            )
        },
        trailingIcon = {
            IconButton(onClick = { visibility = !visibility }) {
                Icon(
                    painter = icon,
                    contentDescription = "Visibility Icon"
                )
            }
        },
        visualTransformation = if (visibility) { VisualTransformation.None } else { PasswordVisualTransformation() },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        )
    )
}