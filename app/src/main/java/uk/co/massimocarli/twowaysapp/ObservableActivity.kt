package uk.co.massimocarli.twowaysapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.twowaysapp.databinding.ObservableBindingBinding

class ObservableActivity : AppCompatActivity() {

  lateinit var binding: ObservableBindingBinding
  lateinit var model: ObservableModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.observable_binding
    )
    model = ObservableModel()
    binding.model = model
  }
}
