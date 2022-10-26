package com.erditurkay.blooddonortr.ui.common

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun MyTextField(
    title: String,
    keyboardType: KeyboardType,
    icon: ImageVector,
    maxCharacter: Int = Int.MAX_VALUE
) {
    var text by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = text,
        onValueChange = {
            if (it.length <= maxCharacter) {
                text = it
            }
        },
        label = {
            Text(text = title)
        },
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = "Age Icon"
            )
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = ImeAction.Send
        )
    )
}