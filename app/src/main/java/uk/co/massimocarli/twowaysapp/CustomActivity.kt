package uk.co.massimocarli.twowaysapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.twowaysapp.databinding.CustomBindingBinding

class CustomActivity : AppCompatActivity() {

  lateinit var binding: CustomBindingBinding
  lateinit var model: BindableModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.custom_binding
    )
    model = BindableModel()
    binding.model = model
  }
}
