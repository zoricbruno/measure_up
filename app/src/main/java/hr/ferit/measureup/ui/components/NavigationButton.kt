package hr.ferit.measureup.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import hr.ferit.measureup.R

@Composable
fun NavigationButton(
    @StringRes textId: Int,
    @DrawableRes iconId: Int,
    @StringRes iconDescriptionId: Int,
    onClick: () -> Unit,
) {
    Button(
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.primary_color),
            contentColor = colorResource(id = R.color.white),
        ),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Image(
                painter = painterResource(id = iconId),
                contentDescription = stringResource(id = iconDescriptionId),
                modifier = Modifier.size(36.dp),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = stringResource(id = textId),
                fontSize = 24.sp,
            )
        }
    }
}
