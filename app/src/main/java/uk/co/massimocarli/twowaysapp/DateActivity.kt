package uk.co.massimocarli.twowaysapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.twowaysapp.databinding.DateBindingBinding
import java.util.*

class DateActivity : AppCompatActivity() {

  lateinit var binding: DateBindingBinding
  lateinit var model: DateModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.simple_binding
    )
    model = DateModel(Date().time)
  }
}
