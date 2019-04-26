package uk.co.massimocarli.twowaysapp

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.twowaysapp.databinding.SimpleBindingBinding

class SimpleActivity : AppCompatActivity() {

  lateinit var binding: SimpleBindingBinding
  lateinit var model: SimpleModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.simple_binding
    )
    model = SimpleModel()
  }

  fun updateChecked(view: View) {
    val newValue = (view as CheckBox).isChecked
    binding.model = SimpleModel(newValue)
  }
}
