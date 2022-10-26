package com.erditurkay.blooddonortr.ui.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun MyTextField(
    modifier: Modifier = Modifier.fillMaxWidth(),
    title: String,
    input: MutableState<TextFieldValue>,
    keyboardType: KeyboardType,
    icon: ImageVector,
    maxCharacter: Int = Int.MAX_VALUE
) {
    OutlinedTextField(
        modifier = modifier,
        value = input.value,
        onValueChange = {
            if (it.text.length <= maxCharacter) {
                input.value = it
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