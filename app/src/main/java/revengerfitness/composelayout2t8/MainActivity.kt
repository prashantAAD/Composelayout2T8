package revengerfitness.composelayout2t8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import revengerfitness.composelayout2t8.ui.theme.ComposeLayout2T8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction(){
    Column {
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
        ListViewItem(R.drawable.aarav1,"prashant chauhan","android developer")
    }

}

@Composable
fun ListViewItem(imgId:Int, name:String, occupation:String){
    Row (Modifier.padding(8.dp)){
        Image(painter = painterResource(id = imgId), contentDescription = "",
            Modifier.size(40.dp)
        )
        Column {
            Text(text = name,
                fontWeight = FontWeight.ExtraBold)

            Text(text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp)
        }
    }

}

@Composable
fun TextInput(){

}