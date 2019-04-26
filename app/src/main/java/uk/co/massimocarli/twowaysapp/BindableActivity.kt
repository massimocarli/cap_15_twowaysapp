package uk.co.massimocarli.twowaysapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.twowaysapp.databinding.BindableBindingBinding

class BindableActivity : AppCompatActivity() {

  lateinit var binding: BindableBindingBinding
  lateinit var model: BindableModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.bindable_binding
    )
    model = BindableModel()
    binding.model = model
  }
}
