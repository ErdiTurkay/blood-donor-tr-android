package com.erditurkay.blooddonortr.ui.register

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erditurkay.blooddonortr.R
import com.erditurkay.blooddonortr.ui.common.MyTextField
import com.erditurkay.blooddonortr.ui.common.PasswordField
import com.erditurkay.blooddonortr.ui.theme.BloodDonorTRTheme

@Composable
fun Register(
    //viewModel: RegisterViewModel = hiltViewModel()
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)
    ) {
        val name = remember { mutableStateOf(TextFieldValue()) }
        val surname = remember { mutableStateOf(TextFieldValue()) }
        val mail = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }
        val phone = remember { mutableStateOf(TextFieldValue()) }
        val day = remember { mutableStateOf(TextFieldValue()) }
        val month = remember { mutableStateOf(TextFieldValue()) }
        val year = remember { mutableStateOf(TextFieldValue()) }

        Row {
            MyTextField(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(PaddingValues(end = 2.dp)),
                title = stringResource(id = R.string.name),
                input = name,
                keyboardType = KeyboardType.Text,
                icon = Icons.Filled.Person
            )
            MyTextField(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(PaddingValues(start = 2.dp)),
                title = stringResource(id = R.string.surname),
                input = surname,
                keyboardType = KeyboardType.Text,
                icon = Icons.Filled.Person
            )
        }

        MyTextField(
            title = stringResource(id = R.string.mail),
            keyboardType = KeyboardType.Email,
            icon = Icons.Filled.Email,
            input = mail
        )

        PasswordField(
            input = password
        )

        MyTextField(
            title = stringResource(id = R.string.phone),
            keyboardType = KeyboardType.Phone,
            icon = Icons.Filled.Phone,
            input = phone,
            maxCharacter = 10
        )

        Row {
            MyTextField(
                modifier = Modifier
                    .fillMaxWidth(.33f)
                    .padding(PaddingValues(end = 2.dp)),
                title = stringResource(id = R.string.day),
                keyboardType = KeyboardType.Number,
                icon = Icons.Filled.DateRange,
                maxCharacter = 2,
                input = day
            )
            MyTextField(
                modifier = Modifier
                    .fillMaxWidth(.5f)
                    .padding(PaddingValues(start = 2.dp, end = 2.dp)),
                title = stringResource(id = R.string.month),
                keyboardType = KeyboardType.Number,
                icon = Icons.Filled.DateRange,
                maxCharacter = 2,
                input = month
            )
            MyTextField(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(PaddingValues(start = 2.dp)),
                title = stringResource(id = R.string.year),
                keyboardType = KeyboardType.Number,
                icon = Icons.Filled.DateRange,
                maxCharacter = 4,
                input = year
            )
        }


        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                /*viewModel.register(
                    User(
                        name.value.text,
                        surname.value.text,
                        mail.value.text,
                        password.value.text,
                        phone.value.text,
                        bloodGroup.value.text
                    )
                )*/
            }
        ) {
            Text(text = "KAYIT OL")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterPreview() {
    BloodDonorTRTheme {
        Register()
    }
}